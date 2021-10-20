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

    List<Movie> movies = new ArrayList<>();
    Connection conn = DBManager.getConnection();

    public List<Movie> getAllMovies(){
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM movies");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Movie movie = new Movie(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
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
