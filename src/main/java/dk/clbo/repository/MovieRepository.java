package dk.clbo.repository;

import dk.clbo.model.Movie;
import dk.clbo.repository.dbconnect.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    List<Movie> movies;
    Connection conn = DBManager.getConnection();

    public List<Movie> getAllMovies(){
        movies = new ArrayList<>();

        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM movies");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                Movie movie = new Movie(
                        rs.getString("year"),
                        rs.getString("length"),
                        rs.getString("title"),
                        rs.getString("subject"),
                        rs.getString("popularity"),
                        rs.getString("awards")
                );
                movies.add(movie);
            }

        } catch (SQLException e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }

        return movies;
    }

}
