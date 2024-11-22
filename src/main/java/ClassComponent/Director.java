/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassComponent;

import Database.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Director {
    private String Name;
    private String IMGUrl;
    private List<Movie> m = new ArrayList<>();
    public Connect con = new Connect();

    public Director(String Name, String IMGUrl) {
        this.Name = Name;
        this.IMGUrl = IMGUrl;
    }

    public Director() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getIMGUrl() {
        return IMGUrl;
    }

    public void setIMGUrl(String IMGUrl) {
        this.IMGUrl = IMGUrl;
    }
    
    public List<Movie> getM() {
        return m;
    }

    public void setM(List<Movie> m) {
        this.m = m;
    }

    public List<Director> getDirector()
    {
        List<Director> lstD = new ArrayList<>();
        try {
            String selectQuery = "select * from Directors";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            //pState.setString(1,"%"+txt+"%");
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Director d = new Director();
                Movie m = new Movie();
                d.setName(rs.getString("NameDirector"));
                d.setIMGUrl(rs.getString("DirectImgURL"));
                d.setM(m.SearchMovieByDirect(rs.getString("NameDirector")));
                lstD.add(d);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(getDirector): "+ex.getMessage());
        }
        con.closeSQL();
        return lstD;
    }

    public List<Director> getDirectorByName(String txt)
    {
        List<Director> lstD = new ArrayList<>();
        try {
            String selectQuery = "select * from Directors where NameDirector like ?";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setString(1,"%"+txt+"%");
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Director d = new Director();
                Movie m = new Movie();
                d.setName(rs.getString("NameDirector"));
                d.setIMGUrl(rs.getString("DirectImgURL"));
                d.setM(m.SearchMovieByDirect(rs.getString("NameDirector")));
                lstD.add(d);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(getDirector): "+ex.getMessage());
        }
        con.closeSQL();
        return lstD;
    }
    
}
