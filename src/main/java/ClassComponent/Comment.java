package ClassComponent;

import Database.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Comment {
    private int userID, cmtID, movieID;
    private String content;
    private String timeCmt;

    public Connect con = new Connect();

    public Comment(int userID, int cmtID, int movieID, String content, String timeCmt) {
        this.userID = userID;
        this.cmtID = cmtID;
        this.movieID = movieID;
        this.content = content;
        this.timeCmt = timeCmt;
    }

    public Comment() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCmtID() {
        return cmtID;
    }

    public void setCmtID(int cmtID) {
        this.cmtID = cmtID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimeCmt() {
        return timeCmt;
    }

    public void setTimeCmt(String timeCmt) {
        this.timeCmt = timeCmt;
    }

    // Lấy danh sách bình luận cho một tài khoản (User)
    public List<Comment> getAccComments(int userID) {
        List<Comment> lstCmt = new ArrayList<>();
        try {
            String selectQuery = "SELECT * FROM Comments WHERE UserID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setInt(1, userID);
            ResultSet rs = pState.executeQuery();
            while (rs.next()) {
                Comment c = new Comment(rs.getInt("UserID"), rs.getInt("CmtID"), rs.getInt("MovieID"),
                                        rs.getString("Comment"), rs.getString("TimeCmt"));
                lstCmt.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(getAccComments): " + ex.getMessage());
        }
        con.closeSQL();

        return lstCmt;
    }

    public List<Comment> getMovieComments(int movieID) {
        List<Comment> lstCmt = new ArrayList<>();
        try {
            String selectQuery = "SELECT * FROM Comments WHERE movieID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(selectQuery);
            pState.setInt(1, movieID);
            ResultSet rs = pState.executeQuery();
            while (rs.next()) {
                Comment c = new Comment(rs.getInt("UserID"), rs.getInt("CmtID"), rs.getInt("MovieID"),
                                        rs.getString("Comment"), rs.getString("TimeCmt"));
                lstCmt.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(getAccComments): " + ex.getMessage());
        }
        con.closeSQL();

        return lstCmt;
    }
    
    // Cập nhật bình luận
    public void updateComment(int cmtID, String content) {
        try {
            String updateQuery = "UPDATE Comments SET Comment = ? WHERE CmtID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(updateQuery);
            pState.setString(1, "N"+content);
            pState.setInt(2, cmtID);
            int rowsAffected = pState.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Comment updated successfully.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(updateComment): " + ex.getMessage());
        }
        con.closeSQL();
    }

    // Thêm bình luận mới
    public void addComment(int userID, int movieID, String content, String timeCmt) {
        try {
            String insertQuery = "INSERT INTO Comments (UserID, MovieID, Comment, TimeCmt) VALUES (?, ?, ?, ?)";
            PreparedStatement pState = con.connectSQL().prepareCall(insertQuery);
            pState.setInt(1, userID);
            pState.setInt(2, movieID);
            pState.setString(3, "N"+content);
            pState.setString(4, timeCmt);
            int rowsAffected = pState.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Comment added successfully.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(addComment): " + ex.getMessage());
        }
        con.closeSQL();
    }
    // thêm phần gọi ra các dữ liệu của người dùng cho cmt
}
