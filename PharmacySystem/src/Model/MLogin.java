/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.VDashboard;
import View.VLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS ZENBOOK
 */
public class MLogin 
{
 ResultSet rst,rst2;
    public int rowCount,UID;
    
    public void Login (String UName, String PWD)
    {
        try
        {
            PreparedStatement pst = DBConnection.createDBconnection().prepareStatement("SELECT * FROM LoginDetails WHERE userName = ? AND pwd = ?");
            pst.setString(1, UName);
            pst.setString(2, PWD);
            rst = pst.executeQuery();
            
            //PreparedStatement pst3 = DBConnection.connectDB().prepareStatement()
            
            if (rst.next())
            {
                //JOptionPane.showMessageDialog(null, "Login successfull customer");
                VDashboard dash = new VDashboard();
                dash.setVisible(true);
                dash.pack();
                dash.setLocationRelativeTo(null);
                
                VLogin log = new VLogin();
                log.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }   
}
