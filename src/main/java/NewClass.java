
import ClassComponent.Actor;
import ClassComponent.Movie;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class NewClass {
    public static void main(String[] args) {
        List<Movie> movies = Movie.getAllMovies();
        
        for (Movie movie : movies) {
            System.out.println("Movie: " + movie.getName());
            for(int i = 0;i<movie.getAct().size();i++)
            {
                System.out.println("  Actor " + movie.getAct().get(i).getName());
            }

        }
        
        System.out.println("Actor\n\n");
        List<Actor> actors = Movie.getAllActors();

        for (Actor actor : actors) {
            System.out.println("Actor: " + actor.getName());
            for (Map.Entry<Movie, String> entry : actor.getRoles().entrySet()) {
                Movie movie = entry.getKey();
                String role = entry.getValue();
                System.out.println("  Movie: " + movie.getName() + " - Role: " + role);
            }
        }
    }
}

