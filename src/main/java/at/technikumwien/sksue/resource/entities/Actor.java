package at.technikumwien.sksue.resource.entities;

import at.technikumwien.sksue.resource.enums.*;
import com.fasterxml.jackson.annotation.*;
import java.io.*;
import java.util.*;
import static javax.xml.bind.annotation.XmlAccessType.FIELD;
import javax.xml.bind.annotation.*;

/**
 * @author Link
 */
@XmlAccessorType(FIELD)
public class Actor implements Serializable {

    @XmlAttribute(required = false)
    @JsonProperty(required = false)
    private int id;
    @XmlAttribute(name = "firstname", required = true)
    private String firstName;
    @XmlAttribute(name = "lastname", required = true)
    private String lastName;
    @XmlAttribute(required = false)
    private Sex sex;

    @XmlSchemaType(name = "date")
    @XmlAttribute(required = false)
    private Date birthdate;

    @XmlTransient
    @JsonProperty(required = false)
    private List<Integer> movieList;

    public Actor() {
    }

    public Actor(String firstName, String lastName, Sex sex, Date birthdate, List<Integer> movieList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthdate = birthdate;
        this.movieList = movieList;
    }

    public void initialise(Actor newActor) {
        setFirstName(newActor.getFirstName());
        setLastName(newActor.getLastName());
        setSex(newActor.getSex());
        setBirthdate(newActor.getBirthdate());
        setMovieList(newActor.getMovieList());
    }

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<Integer> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Integer> movieList) {
        this.movieList = movieList;
    }
    //</editor-fold>
}
