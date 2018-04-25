package com.dhrubo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentDetails" type="{http://in28minutes.com/students}StudentDetails"/>
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
    "bDetails"
})
@XmlRootElement(name = "getBookmarsDetailsResponse")
public class getBookmarksDetailsResponse {

    @XmlElement(name = "bookmarksDetails", required = true)
    private bookmarksDetails bDetails;

    /**
     * Gets the value of the studentDetails property.
     * 
     * @return
     *     possible object is
     *     {@linkStudentDetails }
     *     
     */
    public bookmarksDetails getBookmarksDetails() {
        return bDetails;
    }

    /**
     * Sets the value of the studentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@linkStudentDetails }
     *     
     */
    public void setBookmarksDetails(bookmarksDetails value) {
        this.bDetails = value;
    }

}