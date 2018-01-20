package at.technikumwien.sksue.resource.entities;

import com.fasterxml.jackson.annotation.*;
import java.io.*;
import java.util.*;
import static javax.xml.bind.annotation.XmlAccessType.FIELD;
import javax.xml.bind.annotation.*;

/**
 * @author Link
 */
@XmlAccessorType(FIELD)
public class Studio implements Serializable {

    @XmlAttribute(required = false)
    @JsonProperty(required = false)
    private int id;
    @XmlAttribute(required = true)
    private String name;
    @XmlAttribute(name = "countrycode", required = false)
    private String countryCode;
    @XmlAttribute(name = "postcode", required = false)
    private String postCode;

    @XmlTransient
    @JsonProperty(required = false)
    private List<Integer> movieList;

    public Studio() {
    }

    public Studio(String name, String countryCode, String postCode, List<Integer> movieList) {
        this.name = name;
        this.countryCode = countryCode;
        this.postCode = postCode;
        this.movieList = movieList;
    }

    public void initialise(Studio newStudio) {
        setName(newStudio.getName());
        setCountryCode(newStudio.getCountryCode());
        setPostCode(newStudio.getPostCode());
        setMovieList(newStudio.getMovieList());
    }

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public List<Integer> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Integer> movieList) {
        this.movieList = movieList;
    }
    //</editor-fold>
}
