/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuardarFinanzas;

import GuardarFinanzas.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Alvarado Legrand
 */
public class IngresosJpaController implements Serializable {

    public IngresosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ingresos ingresos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ingresos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
 
    public List<Ingresos> findGananciaPorMes(Date inicio,Date fin){
        EntityManager em = getEntityManager();
        TypedQuery<Ingresos> query = em.createNamedQuery("Ingresos.GananciaMes",Ingresos.class);
        List<Ingresos> lista = query.setParameter("fInicio",inicio).setParameter("fFin", fin).getResultList();
           return lista;
    }
    
    public void edit(Ingresos ingresos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ingresos = em.merge(ingresos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = ingresos.getId();
                if (findIngresos(id) == null) {
                    throw new NonexistentEntityException("The ingresos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ingresos ingresos;
            try {
                ingresos = em.getReference(Ingresos.class, id);
                ingresos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ingresos with id " + id + " no longer exists.", enfe);
            }
            em.remove(ingresos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ingresos> findIngresosEntities() {
        return findIngresosEntities(true, -1, -1);
    }

    public List<Ingresos> findIngresosEntities(int maxResults, int firstResult) {
        return findIngresosEntities(false, maxResults, firstResult);
    }

    private List<Ingresos> findIngresosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ingresos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Ingresos findIngresos(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ingresos.class, id);
        } finally {
            em.close();
        }
    }

    public int getIngresosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ingresos> rt = cq.from(Ingresos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
