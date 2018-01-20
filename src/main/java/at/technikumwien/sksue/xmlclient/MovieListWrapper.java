package at.technikumwien.sksue.xmlclient;

import at.technikumwien.sksue.generated.*;
import java.util.*;
import static javax.xml.bind.annotation.XmlAccessType.FIELD;
import javax.xml.bind.annotation.*;

/**
 * @author Link
 */
@XmlSeeAlso(Movie.class)
@XmlAccessorType(FIELD)
@XmlRootElement(name = "movies")
public class MovieListWrapper {

    @XmlElement(name = "movie")
    private List<Movie> movies;

    public MovieListWrapper() {
    }

    public MovieListWrapper(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
