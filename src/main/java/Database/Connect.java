/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Connect 
{
    public Connection con = null;

    public Connect() {
    }
    
    public Connection connectSQL()
    {
        
        try
        {  
            String sqlURL = "jdbc:sqlserver://localhost:"+1433+";databaseName=Java_TV_Phim;encrypt=false;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(sqlURL,"sa","Anmisoi112");
            return con;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error(Connect): "+ ex.getMessage());
        }
        return null;
    }
    
    public void closeSQL()
    {
        try
        {
            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error(Close): "+ ex.getMessage());
        }
    }

    
}
