package at.technikumwien.sksue.xmlclient;

import at.technikumwien.sksue.generated.*;
import at.technikumwien.sksue.other.*;
import java.io.*;
import java.lang.Exception;
import java.util.*;
import static javax.xml.bind.JAXBContext.newInstance;
import javax.xml.bind.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

/**
 * @author Link
 */
public class XmlClient {

    public static void main(String[] args) throws Exception {
        String inputString;
        if (args.length == 0) {
            System.out.println("Enter path to xml containing movie data: ");
            inputString = new Scanner(System.in).nextLine();
            if (inputString.isEmpty()) {
                System.out.println("Nothing entered, defaulted to \"movies.xml\".");
                inputString = "movies.xml";
            }
        } else {
            inputString = args[0];
        }

        File file = new File(inputString);
        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        JAXBContext context = JAXBContext.newInstance(MovieListWrapper.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Source source = new StreamSource(file);
        JAXBElement<MovieListWrapper> element = unmarshaller.unmarshal(source, MovieListWrapper.class);
        MovieListWrapper movieListWrapper = element.getValue();

        for (Movie m : movieListWrapper.getMovies()) {
            System.out.println("Found " + m.getTitle() + "...");
        }
        PasswordAuthenticator.install("admin", "admin");
        MovieWebService_Service service = new MovieWebService_Service();
        MovieWebService port = service.getMovieWebServicePort();

        System.out.println("Uploading...");
        port.addMovies(movieListWrapper.getMovies());
        System.out.println("Uploaded!");
    }

    public static void create() throws Exception {
        MovieListWrapper wrapper = new MovieListWrapper(new ArrayList<>());

        Movie m = new Movie();
        m.setTitle("Testtitle");
        m.setDescription("Testdescription");
        m.setGenre(Genre.COMEDY);

        Actor a = new Actor();
        a.setFirstname("Testactor");
        m.setActors(new Movie.Actors());
        m.getActors().getActor().add(a);

        Studio s = new Studio();
        s.setName("Teststudio");
        m.setStudio(s);

        wrapper.getMovies().add(m);

        JAXBContext jaxbc = newInstance(MovieListWrapper.class);
        Marshaller marshaller = jaxbc.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(wrapper, System.out);
    }
}
