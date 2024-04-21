/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS ZENBOOK
 */
public class DBConnection 
{
  public static Connection con;
        
    public static Connection createDBconnection()
    {
         try
        {
            String path = "jdbc:mysql://localhost:3306/pharmacy";
            con = DriverManager.getConnection(path, "root", "");
        }
        
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }     
}
