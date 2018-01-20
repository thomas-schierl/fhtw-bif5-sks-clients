
package at.technikumwien.sksue.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für movie complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="movie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studio" type="{http://services.sksue.technikumwien.at/}studio" minOccurs="0"/>
 *         &lt;element name="actors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actor" type="{http://services.sksue.technikumwien.at/}actor" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="releaseyear" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="movieLength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="genre" use="required" type="{http://services.sksue.technikumwien.at/}genre" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", propOrder = {
    "studio",
    "actors"
})
public class Movie {

    protected Studio studio;
    protected Movie.Actors actors;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "releaseyear", required = true)
    protected int releaseyear;
    @XmlAttribute(name = "movieLength", required = true)
    protected int movieLength;
    @XmlAttribute(name = "genre", required = true)
    protected Genre genre;

    /**
     * Ruft den Wert der studio-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Studio }
     *     
     */
    public Studio getStudio() {
        return studio;
    }

    /**
     * Legt den Wert der studio-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Studio }
     *     
     */
    public void setStudio(Studio value) {
        this.studio = value;
    }

    /**
     * Ruft den Wert der actors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Movie.Actors }
     *     
     */
    public Movie.Actors getActors() {
        return actors;
    }

    /**
     * Legt den Wert der actors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Movie.Actors }
     *     
     */
    public void setActors(Movie.Actors value) {
        this.actors = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der releaseyear-Eigenschaft ab.
     * 
     */
    public int getReleaseyear() {
        return releaseyear;
    }

    /**
     * Legt den Wert der releaseyear-Eigenschaft fest.
     * 
     */
    public void setReleaseyear(int value) {
        this.releaseyear = value;
    }

    /**
     * Ruft den Wert der movieLength-Eigenschaft ab.
     * 
     */
    public int getMovieLength() {
        return movieLength;
    }

    /**
     * Legt den Wert der movieLength-Eigenschaft fest.
     * 
     */
    public void setMovieLength(int value) {
        this.movieLength = value;
    }

    /**
     * Ruft den Wert der genre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Genre }
     *     
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Legt den Wert der genre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Genre }
     *     
     */
    public void setGenre(Genre value) {
        this.genre = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="actor" type="{http://services.sksue.technikumwien.at/}actor" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actor"
    })
    public static class Actors {

        protected List<Actor> actor;

        /**
         * Gets the value of the actor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Actor }
         * 
         * 
         */
        public List<Actor> getActor() {
            if (actor == null) {
                actor = new ArrayList<Actor>();
            }
            return this.actor;
        }

    }

}
