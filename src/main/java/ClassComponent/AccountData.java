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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AccountData {
    private int ID;
    private String role;
    private String mail;
    private String PhoneNum;
    private String Name;
    private String Gender;
    private String URLAva;
    private String URLTheme;
    private Date Age;
    private List<Rating> rates = new ArrayList<>();
    private List<Comment> cmts = new ArrayList<>();
    private Connect con = new Connect();

    public AccountData(int ID, String role, String mail, String PhoneNum, String Name, String Gender, String URLAva, String URLTheme) {
        this.ID = ID;
        this.role = role;
        this.mail = mail;
        this.PhoneNum = PhoneNum;
        this.Name = Name;
        this.Gender = Gender;
        this.URLAva = URLAva;
        this.URLTheme = URLTheme;
    }

    public AccountData() {
    }

    public Date getAge() {
        return Age;
    }

    public void setAge(Date Age) {
        this.Age = Age;
    }
 
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getURLAva() {
        return URLAva;
    }

    public void setURLAva(String URLAva) {
        this.URLAva = URLAva;
    }

    public String getURLTheme() {
        return URLTheme;
    }

    public void setURLTheme(String URLTheme) {
        this.URLTheme = URLTheme;
    }

    public List<Rating> getRates() {
        return rates;
    }

    public void setRates(List<Rating> rates) {
        this.rates = rates;
    }

    public List<Comment> getCmts() {
        return cmts;
    }

    public void setCmts(List<Comment> cmts) {
        this.cmts = cmts;
    }
    
    
    
    public AccountData setAccount(int UserID)
    {
        AccountData a = new AccountData();
        try {
            String selectQuery = "Select * From UserL  Where UserID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setInt(1, UserID);
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Rating r = new Rating();
                Comment c = new Comment();
                a.setID(rs.getInt("UserID"));
                a.setRole(rs.getString("RoleAcc"));
                a.setMail(rs.getString("Email"));
                a.setPhoneNum(rs.getString("PhoneNum"));
                a.setName(rs.getString("NameUser"));
                if(rs.getString("Gender")== null) a.setGender(null);
                else if(rs.getString("Gender").equals("m"))
                {
                    a.setGender("Male");
                }
                else a.setGender("Female");
                a.setAge(rs.getDate("Birth"));
                a.setURLAva(rs.getString("UrlAvatar"));
                a.setURLTheme(rs.getString("UrlTheme"));
                a.setRates(r.getAccRates(UserID));
                a.setCmts(c.getAccComments(UserID));
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(getAccount): "+ex.getMessage());
        }
        con.closeSQL();
        
        return a;
    }
    
    public boolean changePassword(int UserID,String pass,String newPass)
    {
        PasswordHasher hash = new PasswordHasher();
        String HashPass = hash.hashPassword(pass);
        String newHashPass = hash.hashPassword(newPass);
        boolean isAuthenticated = false;
        try {
            String selectQuery = "Select * From LoginAcc  Where UserID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setInt(1, UserID);
            ResultSet rs = pState.executeQuery();
            if (rs.next()) 
            {
                String storedPassword = rs.getString("Pass");
                if (storedPassword.equals(HashPass)) {
                    isAuthenticated = true;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(changePassword): "+ex.getMessage());
        }
        if(isAuthenticated)
        {
            try {
            String updateQuery = "UPDATE LoginAcc set Pass = ?,WHERE UserID = ?";
            PreparedStatement pState = con.connectSQL().prepareStatement(updateQuery);
            pState.setString(1, newHashPass);
            pState.setInt(2, UserID);
            pState.executeQuery();
            return true;

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error(changePassword): "+ex.getMessage());
            }
        }
        
        con.closeSQL();
        return false;
    }

    
}
