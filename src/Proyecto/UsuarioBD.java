/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mariano
 */
public class UsuarioBD {
    String nombre, contraseña, administrador;
    ConectarBD conexion = new ConectarBD();
    
    public UsuarioBD() {
        nombre = "";
        contraseña = "";
        administrador = "";
    }
    
    public UsuarioBD(String nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = MD5(contraseña);
    }
    
    public UsuarioBD(String nombre, String contraseña, String admin){
        this.nombre = nombre;
        this.contraseña = MD5(contraseña);
        this.administrador = admin;
    }
    
    /**
     * encripta la contraseña del usuario al momento de ingresarla a la base de datos
     * @return 
     */
    public String MD5(String contraseña){
        StringBuffer sb = new StringBuffer();
        try{
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(contraseña.getBytes());
            
            for (int i = 0; i < array.length; i++ ){
                sb.append(Integer.toHexString((array[i] & 0xFF)| 0X100).substring(1,3));
            }
//            System.out.println(sb.toString());
            return sb.toString();
        }catch(java.security.NoSuchAlgorithmException e){
            
        }
        return sb.toString();
    }
    
    /**
     * busca en la base de datos el usuario ingresado y compara si es administrador o no
     * @param base
     * @return
     * @throws SQLException 
     */
    public int autenticar() throws SQLException{
        
        Connection base = conexion.ConectarBD();
        int resultado = -1;
        
        String comando = "SELECT * FROM Usuario WHERE user ='" + nombre  + "' AND password ='" + contraseña + "'";
        String admin;
        PreparedStatement pst = base.prepareStatement(comando);
        ResultSet result = pst.executeQuery(comando);
        while(result.next()){
            admin = result.getString("administrador");
            if(admin.equals("true"))
                resultado = 1;
            else
                resultado = 0;
        }
        conexion.DesconectarBD();
        return resultado;
    }
    
    /**
     * busca si hay algún usuario administrador en la base de datos 
     * (esto para que al iniciar el programa ver si se debe crear un usuario)
     * @param base
     * @return
     * @throws SQLException 
     */
    public static int buscarAdmin() throws SQLException{
        ConectarBD conectar = new ConectarBD();
        Connection base = conectar.ConectarBD();
        int resultado = 0;
        
        char comillas = '"';
        String comando = "SELECT * FROM Usuario WHERE administrador =" + comillas + "true" + comillas;
        
        PreparedStatement pst = base.prepareStatement(comando);
        ResultSet result = null;
        result = pst.executeQuery(comando);
        if(result.next())
            resultado++;
        conectar.DesconectarBD();
        return resultado;
    }
    
    /**
     * 
     * @param base
     * @return
     * @throws SQLException 
     */
    public int autorizar() throws SQLException{
        
        Connection base = conexion.ConectarBD();
        int resultado = 0;
        
        char comillas = '"';
        String comando = "SELECT * FROM Usuario WHERE user =" + comillas + nombre + comillas + " AND password =" + comillas + contraseña + comillas + "AND administrador =" + comillas + "true" + comillas;
        
        PreparedStatement pst = base.prepareStatement(comando);
        ResultSet result = null;
        result = pst.executeQuery(comando);
        if(result.first())
            resultado++;
        conexion.DesconectarBD();
        return resultado;
    }
    
    /**
     * ingresa un nuevo usuario a la base de datos
     * @param base
     * @throws SQLException 
     */
    public void insertarUsuario() throws SQLException{
        
        Connection base = conexion.ConectarBD();
        char comillas = '"';
        String insercion = "INSERT INTO Usuario (user, password, administrador) VALUES (" + comillas + nombre + comillas + ", " + comillas + contraseña + comillas + ", " + comillas + administrador + comillas + ");";
        
        PreparedStatement pst = base.prepareStatement(insercion);
        int resultado;
        resultado = pst.executeUpdate(insercion);
        JOptionPane.showMessageDialog(null, "El usuario ha sido ingresado exitosamente", "Usuario Creado", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(resultado);
        conexion.DesconectarBD();
    }
}
