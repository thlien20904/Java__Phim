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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Actor {
    private int ID;
    private String name;
    private Map<Movie, String> roles = new HashMap<>();//không tạo bảng role nên dùng map để tạo cặp value phim và vai diễn
    private String ImgURL;
    Connect con = new Connect();

    public Actor(String name, int id, String ImgURL) {
        this.name = name;
        this.ImgURL = ImgURL;
        this.ID = id;
    }
    
    public Actor() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Map<Movie, String> getRoles() {
        return roles;
    }

    public void addRole(Movie movie, String role) {
        this.roles.put(movie, role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return ImgURL;
    }

    public void setImgURL(String ImgURL) {
        this.ImgURL = ImgURL;
    }

    public List<Movie> getMovies() {
        return new ArrayList<>(roles.keySet());
    }
    
    public List<Actor> SearchActorOnly(String txt)
    {
        List<Actor> lstActor = new ArrayList<>();
        try {
            String selectQuery = "select * from Actors where NameActor like ?";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setString(1,"%"+txt+"%");
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Actor act = new Actor();
                act.setName(rs.getString("NameActor"));
                act.setImgURL(rs.getString("ActorImgURL"));
                lstActor.add(act);  
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(SearchActorOnly): "+ex.getMessage());
        }
        con.closeSQL();
        return lstActor;
    }
    
    
}
