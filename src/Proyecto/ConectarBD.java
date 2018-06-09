/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mariano
 */
public class ConectarBD {
    public Connection con = null;
    
    public ConectarBD(){
    }
    
    public Connection ConectarBD(){
        try {
            String bd = "WR";
            String user = "root";
            String password = "marianorv";
            String url = "jdbc:mysql://localhost/" + bd;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null,"Error de conexion\n"+e);
        }
        return con;
    }

    public Connection getConexion() {
        return con;
    }
    
    public void DesconectarBD(){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion\n"+ex);
        }
    }
}
