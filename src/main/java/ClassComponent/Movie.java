/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ClassComponent;


import Database.Connect;
import ClassComponent.Actor;
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
public class Movie {
    private int ID;
    private String Name;
    private Date ReleaseDate;
    private Director Director;
    private List<Actor> act = new ArrayList<>();
    private float duration;
    private String Description;
    private float Score;
    private float Price;
    private String UrlPoster;
    private String UrlVideo;
    private List<Comment> cmts = new ArrayList<>();
    //private List<Rating> rates = new ArrayList<>();
    
    public static Connect con = new Connect();

    public Movie(int ID, String Name, Date ReleaseDate, Director Director, float duration, String Description, float Score, float Price, String UrlPoster, String UrlVideo) {
        this.ID = ID;
        this.Name = Name;
        this.ReleaseDate = ReleaseDate;
        this.Director = Director;
        this.duration = duration;
        this.Description = Description;
        this.Score = Score;
        this.Price = Price;
        this.UrlPoster = UrlPoster;
        this.UrlVideo = UrlVideo;
    }

    
    
    public Movie() {
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Date ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }

    public Director getDirector() {
        return Director;
    }

    public void setDirector(Director Director) {
        this.Director = Director;
    }

    public List<Actor> getAct() {
        return act;
    }

    public void setAct(List<Actor> act) {
        this.act = act;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public float getScore() {
        return Score;
    }

    public void setScore(float Score) {
        this.Score = Score;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getUrlPoster() {
        return UrlPoster;
    }

    public void setUrlPoster(String UrlPoster) {
        this.UrlPoster = UrlPoster;
    }

    public String getUrlVideo() {
        return UrlVideo;
    }

    public void setUrlVideo(String UrlVideo) {
        this.UrlVideo = UrlVideo;
    }
    
    public void addActor(Actor actor)
    {
        this.act.add(actor);
        actor.addRole(this, actor.getRoles().get(this));
    }
    
    public List<Actor> getActors()
    {
        return act;
    }

    public List<Comment> getCmts() {
        return cmts;
    }

    public void setCmts(List<Comment> cmts) {
        this.cmts = cmts;
    }
    
    
    
    public List<Movie> getMovie()
    {
        List<Movie> lstMovie = new ArrayList<>();
        try {
            String selectQuery = "Select * From Movies m,Films f,Directors d   Where m.IdDirector = d.IdDirector and m.MovieID = f.MovieID;";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            ResultSet rs = pState.executeQuery();
            int i=0;
            while(rs.next() && i<10)
            {
                Movie a = new Movie();
                Comment c = new Comment();
                a.setName(rs.getString("Title"));
                a.setID(rs.getInt("MovieID"));
                a.setDirector(new Director(rs.getString("NameDirector"), rs.getString("DirectImgURL")));
                a.setDescription(rs.getString("DescriptionMovie"));
                a.setScore(rs.getFloat("Score"));
                a.setPrice(rs.getFloat("Price"));
                a.setUrlPoster(rs.getString("UrlPoster"));
                a.setUrlVideo(rs.getString("UrlVideo"));
                String actorQuery = "Select ma.MovieID,ma.ActorID,RoleAct,ActorImgURL,NameActor\n"
                                  + "From MovieActors ma,Actors a \n"
                                  + "Where  ma.ActorID=a.ActorID and ma.ActorID = ?";
                PreparedStatement actorPstmt = con.connectSQL().prepareStatement(actorQuery);
                
                actorPstmt.setInt(1, a.ID);
                ResultSet Atcrs = actorPstmt.executeQuery();
                while (Atcrs.next())
                        {
                            int actorID = Atcrs.getInt("ActorID");
                            String actorRole = Atcrs.getString("RoleAct");
                            String actorName = Atcrs.getString("NameActor");
                            String actorURL = Atcrs.getString("ActorImgURL");
                            Actor actor = new Actor(actorName, actorID, actorURL);
                            actor.addRole(a, actorRole);
                            a.addActor(actor);
                        }
                a.setCmts(c.getMovieComments(ID));
                    lstMovie.add(a);
                    i++;
                
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(getMovie): "+ex.getMessage());
        }
        con.closeSQL();
        return lstMovie;
    }
    
    
    public static List<Movie> getAllMovies()
    {
        List<Movie> lstMovie = new ArrayList<>();
        try {
            String selectQuery = "Select * From Movies m,Films f,Directors d   Where m.IdDirector = d.IdDirector and m.MovieID = f.MovieID;";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Movie a = new Movie();
                
                a.setName(rs.getString("Title"));
                a.setID(rs.getInt("MovieID"));
                a.setDirector(new Director(rs.getString("NameDirector"), rs.getString("DirectImgURL")));
                a.setDescription(rs.getString("DescriptionMovie"));
                a.setScore(rs.getFloat("Score"));
                a.setPrice(rs.getFloat("Price"));
                a.setUrlPoster(rs.getString("UrlPoster"));
                a.setUrlVideo(rs.getString("UrlVideo"));
                String actorQuery = "Select ma.MovieID,ma.ActorID,RoleAct,ActorImgURL,NameActor\n"
                                  + "From MovieActors ma, Actors a\n"
                                  + "Where  ma.ActorID = a.ActorID and ma.MovieID = ?";
                try(PreparedStatement actorPstmt = con.connectSQL().prepareStatement(actorQuery))
                {
                    actorPstmt.setInt(1, a.ID);
                    try(ResultSet Atcrs = actorPstmt.executeQuery();)
                    {
                        while (Atcrs.next())
                        {
                            int actorID = Atcrs.getInt("ActorID");
                            String actorRole = Atcrs.getString("RoleAct");
                            String actorName = Atcrs.getString("NameActor");
                            String actorURL = Atcrs.getString("ActorImgURL");
                            Actor actor = new Actor(actorName, actorID, actorURL);
                            actor.addRole(a, actorRole);
                            a.addActor(actor);
                        }
                    }
                    lstMovie.add(a);
                }
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(getAllMovies): "+ex.getMessage());
        }
        con.closeSQL();
        return lstMovie;
    }
    
    public static List<Actor> getAllActors() {
        List<Actor> actors = new ArrayList<>();
        try{
        String query = "SELECT a.ActorID, a.NameActor, a.ActorImgURL, ma.RoleAct, m.MovieID, m.Title " +
                       "FROM Actors a " +
                       "JOIN MovieActors ma ON a.ActorID = ma.ActorID " +
                       "JOIN Movies m ON ma.MovieID = m.MovieID;";
             PreparedStatement pstmt = con.connectSQL().prepareStatement(query);
             ResultSet rs = pstmt.executeQuery() ;

            while (rs.next()) {
                int actorID = rs.getInt("ActorID");
                String actorName = rs.getString("NameActor");
                String actorImgURL = rs.getString("ActorImgURL");

                // Tìm xem diễn viên này đã có trong danh sách chưa
                Actor actor = actors.stream().filter(a -> a.getID() == actorID).findFirst().orElse(null);
                if (actor == null) {
                    actor = new Actor( actorName,actorID, actorImgURL);
                    actors.add(actor);
                }

                int movieID = rs.getInt("MovieID");
                String movieTitle = rs.getString("Title");
                Movie movie = new Movie();
                movie.setID(movieID);
                movie.setName(movieTitle);

                String roleAct = rs.getString("RoleAct");
                actor.addRole(movie, roleAct);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error(getAllActors): " + ex.getMessage());
        }

        return actors;
    }
    
    public List<Movie> SearchMovieByDirect(String txt)
    {
        List<Movie> lstMovie = new ArrayList<>();
        try {
            String selectQuery = 
                    "Select m.MovieID,Title,ReleaseDate,Duration,DescriptionMovie,Score,Price,UrlPoster,UrlVideo,NameDirector,DirectImgURL "
                    + "From Movies m,Films f,Directors d "
                    + "Where m.IdDirector = d.IdDirector and m.MovieID = f.MovieID and NameDirector like ?;";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            pState.setString(1,"%"+txt+"%");
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Movie a = new Movie();
                Comment c = new Comment();
                a.setName(rs.getString("Title"));
                a.setID(rs.getInt("MovieID"));
                a.setDirector(new Director(rs.getString("NameDirector"), rs.getString("DirectImgURL")));
                a.setDescription(rs.getString("DescriptionMovie"));
                a.setScore(rs.getFloat("Score"));
                a.setPrice(rs.getFloat("Price"));
                a.setUrlPoster(rs.getString("UrlPoster"));
                a.setUrlVideo(rs.getString("UrlVideo"));
                String actorQuery = "Select ma.MovieID,ma.ActorID,RoleAct,ActorImgURL,NameActor\n"
                                  + "From MovieActors ma,Actors a \n"
                                  + "Where  ma.ActorID=a.ActorID and ma.ActorID = ?";
                PreparedStatement actorPstmt = con.connectSQL().prepareStatement(actorQuery);
                
                actorPstmt.setInt(1, a.ID);
                ResultSet Atcrs = actorPstmt.executeQuery();
                while (Atcrs.next())
                        {
                            int actorID = Atcrs.getInt("ActorID");
                            String actorRole = Atcrs.getString("RoleAct");
                            String actorName = Atcrs.getString("NameActor");
                            String actorURL = Atcrs.getString("ActorImgURL");
                            Actor actor = new Actor(actorName, actorID, actorURL);
                            actor.addRole(a, actorRole);
                            a.addActor(actor);
                        }
                a.setCmts(c.getMovieComments(ID));
                    lstMovie.add(a);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(SearchMovieByDirect): "+ex.getMessage());
        }
        con.closeSQL();
        return lstMovie;
    }
    public List<Movie> SearchMovieByActor(String txt)
    {
        List<Movie> lstMovie = new ArrayList<>();
        try {
            String selectQuery = 
                    "Select m.MovieID,Title,ReleaseDate,Duration,DescriptionMovie,Score,Price,UrlPoster,UrlVideo,NameActor,DirectImgURL "
                    + "From Movies m,Films f,Directors d "
                    + "Where m.IdDirector = d.IdDirector and m.MovieID = f.MovieID and NameActor like ?;";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            pState.setString(1,"%"+txt+"%");
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Movie a = new Movie();
                Comment c = new Comment();
                a.setName(rs.getString("Title"));
                a.setID(rs.getInt("MovieID"));
                a.setDirector(new Director(rs.getString("NameDirector"), rs.getString("DirectImgURL")));
                a.setDescription(rs.getString("DescriptionMovie"));
                a.setScore(rs.getFloat("Score"));
                a.setPrice(rs.getFloat("Price"));
                a.setUrlPoster(rs.getString("UrlPoster"));
                a.setUrlVideo(rs.getString("UrlVideo"));
                String actorQuery = "Select ma.MovieID,ma.ActorID,RoleAct,ActorImgURL,NameActor\n"
                                  + "From MovieActors ma,Actors a \n"
                                  + "Where  ma.ActorID=a.ActorID and ma.ActorID = ?";
                PreparedStatement actorPstmt = con.connectSQL().prepareStatement(actorQuery);
                
                actorPstmt.setInt(1, a.ID);
                ResultSet Atcrs = actorPstmt.executeQuery();
                while (Atcrs.next())
                        {
                            int actorID = Atcrs.getInt("ActorID");
                            String actorRole = Atcrs.getString("RoleAct");
                            String actorName = Atcrs.getString("NameActor");
                            String actorURL = Atcrs.getString("ActorImgURL");
                            Actor actor = new Actor(actorName, actorID, actorURL);
                            actor.addRole(a, actorRole);
                            a.addActor(actor);
                        }
                a.setCmts(c.getMovieComments(ID));
                lstMovie.add(a);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(SearchMovieByDirect): "+ex.getMessage());
        }
        con.closeSQL();
        return lstMovie;
    }
    
    public List<Movie> SearchMovieTitle(String txt)
    {
        List<Movie> lstMovie = new ArrayList<>();
        try {
            String selectQuery = 
                    "Select m.MovieID,Title,ReleaseDate,Duration,DescriptionMovie,Score,Price,UrlPoster,UrlVideo,NameDirector,DirectImgURL "
                    + "From Movies m,Films f,Directors d "
                    + "Where m.IdDirector = d.IdDirector and m.MovieID = f.MovieID and Title like ?;";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            pState.setString(1,"%"+txt+"%");
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Movie a = new Movie();
                Comment c = new Comment();
                a.setName(rs.getString("Title"));
                a.setID(rs.getInt("MovieID"));
                a.setDirector(new Director(rs.getString("NameDirector"), rs.getString("DirectImgURL")));
                a.setDescription(rs.getString("DescriptionMovie"));
                a.setScore(rs.getFloat("Score"));
                a.setPrice(rs.getFloat("Price"));
                a.setUrlPoster(rs.getString("UrlPoster"));
                a.setUrlVideo(rs.getString("UrlVideo"));
                String actorQuery = "Select ma.MovieID,ma.ActorID,RoleAct,ActorImgURL,NameActor\n"
                                  + "From MovieActors ma,Actors a \n"
                                  + "Where  ma.ActorID=a.ActorID and ma.ActorID = ?";
                PreparedStatement actorPstmt = con.connectSQL().prepareStatement(actorQuery);
                
                actorPstmt.setInt(1, a.ID);
                ResultSet Atcrs = actorPstmt.executeQuery();
                while (Atcrs.next())
                        {
                            int actorID = Atcrs.getInt("ActorID");
                            String actorRole = Atcrs.getString("RoleAct");
                            String actorName = Atcrs.getString("NameActor");
                            String actorURL = Atcrs.getString("ActorImgURL");
                            Actor actor = new Actor(actorName, actorID, actorURL);
                            actor.addRole(a, actorRole);
                            a.addActor(actor);
                        }
                a.setCmts(c.getMovieComments(ID));
                    lstMovie.add(a);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(SearchMovieByDirect): "+ex.getMessage());
        }
        con.closeSQL();
        return lstMovie;
    }
    
    public List<Movie> getWatchList(int UserID)
    {
        List<Movie> lstMovie = new ArrayList<>();
        try {
            String selectQuery  = "Select w.MovieID,UserID ,Title,ReleaseDate,Duration,DescriptionMovie,Score,Price,UrlPoster,UrlVideo,NameDirector,DirectImgURL\n" 
                                + "From WatchList w, Movies m,Films f,Directors d \n"
                                + "Where m.IdDirector = d.IdDirector and m.MovieID = f.MovieID and w.MovieID = m.MovieID and UserID = ?;";
            PreparedStatement pState = con.connectSQL().prepareStatement(selectQuery);
            pState.setInt(1,UserID);
            ResultSet rs = pState.executeQuery();
            while(rs.next())
            {
                Movie a = new Movie();
                Comment c = new Comment();
                a.setName(rs.getString("Title"));
                a.setID(rs.getInt("MovieID"));
                a.setDirector(new Director(rs.getString("NameDirector"), rs.getString("DirectImgURL")));
                a.setDescription(rs.getString("DescriptionMovie"));
                a.setScore(rs.getFloat("Score"));
                a.setPrice(rs.getFloat("Price"));
                a.setUrlPoster(rs.getString("UrlPoster"));
                a.setUrlVideo(rs.getString("UrlVideo"));
                String actorQuery = "Select ma.MovieID,ma.ActorID,RoleAct,ActorImgURL,NameActor\n"
                                  + "From MovieActors ma,Actors a \n"
                                  + "Where  ma.ActorID=a.ActorID and ma.ActorID = ?";
                PreparedStatement actorPstmt = con.connectSQL().prepareStatement(actorQuery);
                actorPstmt.setInt(1, a.ID);
                ResultSet Atcrs = actorPstmt.executeQuery();
                while (Atcrs.next())
                        {
                            int actorID = Atcrs.getInt("ActorID");
                            String actorRole = Atcrs.getString("RoleAct");
                            String actorName = Atcrs.getString("NameActor");
                            String actorURL = Atcrs.getString("ActorImgURL");
                            Actor actor = new Actor(actorName, actorID, actorURL);
                            actor.addRole(a, actorRole);
                            a.addActor(actor);
                        }
                a.setCmts(c.getMovieComments(ID));
                    lstMovie.add(a);
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error(SearchMovieByDirect): "+ex.getMessage());
        }
        con.closeSQL();
        return lstMovie;
    }

    public boolean DelMovie(int ma) {
        boolean deleted = false;
        try
        {
            String deleteQuerry = "DELETE FROM MovieActors WHERE MovieID = ?";
            PreparedStatement pState = con.connectSQL().prepareCall(deleteQuerry);
            pState.setInt(1,ma);
            if(pState.executeUpdate() > 0)
            {
                String deleteMovieQuerry = "DELETE FROM Movies WHERE MovieID = ?";
                PreparedStatement pStateM = con.connectSQL().prepareCall(deleteMovieQuerry);
                pState.setInt(1,ma);
                deleted = pState.executeUpdate() > 0;
            }
        }catch(Exception ex)
        {
            
        }
        return deleted;
    }
}
