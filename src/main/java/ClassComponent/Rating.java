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
public class Rating {
    private int userID,rateID,movieID;
    private int Score;
    
    public Connect con = new Connect();

    public Rating(int userID, int rateID, int movieID, int Score) {
        this.userID = userID;
        this.rateID = rateID;
        this.movieID = movieID;
        this.Score = Score;
    }

    public Rating() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRateID() {
        return rateID;
    }

    public void setRateID(int rateID) {
        this.rateID = rateID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public List<Rating> getAccRates(int UserID)
    {
        List<Rating> lstR = new ArrayList<>();
        try {
            String selectQuery = "Select * From Ratings  Where UserID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setInt(1, UserID);
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Rating r = new Rating(rs.getInt("UserID"), rs.getInt("RateID"), rs.getInt("MovieID"), rs.getInt("Rating"));
                lstR.add(r);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(getAccRates): "+ex.getMessage());
        }
        con.closeSQL();
        
        return lstR;
    }
    
    public void updateRating(int UserID,int MovieID,int Score)
    {
        try {
            String updateQuery = "Update Ratings set Ratings = ?  Where UserID = ? and MovieID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(updateQuery);
            pState.setInt(1, Score);
            pState.setInt(2, UserID);
            pState.setInt(3, MovieID);
            int rowsAffected = pState.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null,"Rating updated successfully.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(updateRating): "+ex.getMessage());
        }
        con.closeSQL();
    }
    
    public void setRating(int UserID,int MovieID,int Score)
    {
        try {
            String updateQuery = "Insert into Ratings(Rating, UserID, MovieID) values(?,?,?)";
            PreparedStatement pState = con.connectSQL().prepareCall(updateQuery);
            pState.setInt(1, Score);
            pState.setInt(2, UserID);
            pState.setInt(3, MovieID);
            int rowsAffected = pState.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null,"Rating updated successfully.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(setRating): "+ex.getMessage());
        }
        con.closeSQL();
    }
}
