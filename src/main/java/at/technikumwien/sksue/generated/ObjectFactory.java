
package at.technikumwien.sksue.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.technikumwien.sksue.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchByTitleResponse_QNAME = new QName("http://services.sksue.technikumwien.at/", "SearchByTitleResponse");
    private final static QName _Movie_QNAME = new QName("http://services.sksue.technikumwien.at/", "movie");
    private final static QName _AddMovies_QNAME = new QName("http://services.sksue.technikumwien.at/", "AddMovies");
    private final static QName _AddMoviesResponse_QNAME = new QName("http://services.sksue.technikumwien.at/", "AddMoviesResponse");
    private final static QName _SearchByTitle_QNAME = new QName("http://services.sksue.technikumwien.at/", "SearchByTitle");
    private final static QName _Exception_QNAME = new QName("http://services.sksue.technikumwien.at/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.technikumwien.sksue.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link SearchByTitleResponse }
     * 
     */
    public SearchByTitleResponse createSearchByTitleResponse() {
        return new SearchByTitleResponse();
    }

    /**
     * Create an instance of {@link AddMovies }
     * 
     */
    public AddMovies createAddMovies() {
        return new AddMovies();
    }

    /**
     * Create an instance of {@link AddMoviesResponse }
     * 
     */
    public AddMoviesResponse createAddMoviesResponse() {
        return new AddMoviesResponse();
    }

    /**
     * Create an instance of {@link SearchByTitle }
     * 
     */
    public SearchByTitle createSearchByTitle() {
        return new SearchByTitle();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Studio }
     * 
     */
    public Studio createStudio() {
        return new Studio();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link Movie.Actors }
     * 
     */
    public Movie.Actors createMovieActors() {
        return new Movie.Actors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sksue.technikumwien.at/", name = "SearchByTitleResponse")
    public JAXBElement<SearchByTitleResponse> createSearchByTitleResponse(SearchByTitleResponse value) {
        return new JAXBElement<SearchByTitleResponse>(_SearchByTitleResponse_QNAME, SearchByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sksue.technikumwien.at/", name = "movie")
    public JAXBElement<Movie> createMovie(Movie value) {
        return new JAXBElement<Movie>(_Movie_QNAME, Movie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sksue.technikumwien.at/", name = "AddMovies")
    public JAXBElement<AddMovies> createAddMovies(AddMovies value) {
        return new JAXBElement<AddMovies>(_AddMovies_QNAME, AddMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sksue.technikumwien.at/", name = "AddMoviesResponse")
    public JAXBElement<AddMoviesResponse> createAddMoviesResponse(AddMoviesResponse value) {
        return new JAXBElement<AddMoviesResponse>(_AddMoviesResponse_QNAME, AddMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sksue.technikumwien.at/", name = "SearchByTitle")
    public JAXBElement<SearchByTitle> createSearchByTitle(SearchByTitle value) {
        return new JAXBElement<SearchByTitle>(_SearchByTitle_QNAME, SearchByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.sksue.technikumwien.at/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
