/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassComponent;

import ClassExtend.PasswordHasher;
import Database.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class LoginAcc {
    private String Email;
    private String Password;
    private AccountData acc;
    
    public Connect con = new Connect();
    
    
    public LoginAcc(String Email, String Password) {
        this.Email = Email;
        this.Password = Password;
    }


    
    public LoginAcc() {
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public void CreateAccount(String Email, String Password)
    {
        PasswordHasher hash = new PasswordHasher();
        String HashPass = hash.hashPassword(Password);
        
        try {
            String selectQuery = "Insert into LoginAcc(Email,Pass) Values (?,?)";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setString(1, Email);
            pState.setString(2, HashPass);
            pState.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(getLoaiSP): "+ex.getMessage());
        }
        con.closeSQL();
    }
    
    public boolean LoginAccount(String Email, String Password)
    {
        PasswordHasher hash = new PasswordHasher();
        String HashPass = hash.hashPassword(Password);
        setEmail(Email);
        boolean isAuthenticated = false;
        try {
            String selectQuery = "SELECT Pass FROM LoginAcc WHERE Email = ?";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            pState.setString(1, Email);
            ResultSet rs = pState.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("Pass");
                if (storedPassword.equals(HashPass)) {
                    isAuthenticated = true;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error(authenticate): " + ex.getMessage());
        } finally {
            con.closeSQL();
        }
        return isAuthenticated;       
    }    
    
    public int getID(String mail)
    {
        try {
            String selectQuery = "SELECT UserID FROM LoginAcc WHERE Email = ?";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            pState.setString(1, mail);
            ResultSet rs = pState.executeQuery();

            if(rs.next()) {
                return rs.getInt("UserID");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error(authenticate): " + ex.getMessage());
        } finally {
            con.closeSQL();
        }
       return -1; 
    }
    
    
}
