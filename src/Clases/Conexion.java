/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author felix
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public static String BD = "jdbc:postgresql://localhost:5432/colegio";
    public static String USER = "postgres";
    public static String PASSWORD = "admin";
    
    public static Connection GetConexion(){
        
        try {
            Connection conexion = DriverManager.getConnection(BD,USER,PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            return conexion;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error:"+e);
            return null;
        }
        
        
    }
    
}
