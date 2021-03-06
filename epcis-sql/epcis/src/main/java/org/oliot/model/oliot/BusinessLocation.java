//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.15 at 01:39:48 PM KST 
//


package org.oliot.model.oliot;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;

import org.w3c.dom.Element;


@Entity
public class BusinessLocation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCEBusinessLocation")
	//@SequenceGenerator(name="SEQUENCEBusinessLocation", sequenceName="SEQUENCEBusinessLocation", allocationSize=1)
	private int id;
    @XmlElement(required = true)
    protected String sId;
	@OneToOne
	@JoinColumn(name="extension_id")
    protected BusinessLocationExtension extension;
    @Transient 
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    
    
    
    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public void setAny(List<Object> any) {
		this.any = any;
	}

	/**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLocationExtension }
     *     
     */
    public BusinessLocationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLocationExtension }
     *     
     */
    public void setExtension(BusinessLocationExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    
    
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

	public BusinessLocation(String sId, BusinessLocationExtension extension) {
		super();
		this.sId = sId;
		this.extension = extension;
	}

	public BusinessLocation(String sId) {
		super();
		this.sId = sId;
	}

	public BusinessLocation() {
		super();
	}

}
