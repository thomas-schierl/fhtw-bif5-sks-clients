
package at.technikumwien.sksue.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für genre.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="genre">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTION"/>
 *     &lt;enumeration value="ANIMATION"/>
 *     &lt;enumeration value="COMEDY"/>
 *     &lt;enumeration value="DRAMA"/>
 *     &lt;enumeration value="HORROR"/>
 *     &lt;enumeration value="SCIENCE_FICTION"/>
 *     &lt;enumeration value="THRILLER"/>
 *     &lt;enumeration value="WESTERN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "genre")
@XmlEnum
public enum Genre {

    ACTION,
    ANIMATION,
    COMEDY,
    DRAMA,
    HORROR,
    SCIENCE_FICTION,
    THRILLER,
    WESTERN;

    public String value() {
        return name();
    }

    public static Genre fromValue(String v) {
        return valueOf(v);
    }

}
