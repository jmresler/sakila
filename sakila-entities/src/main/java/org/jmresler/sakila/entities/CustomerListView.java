/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmresler.sakila.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author John M. Resler
 */
@Entity
@Table(name = "customer_list", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerListView.findAll", query = "SELECT c FROM CustomerListView c")
    , @NamedQuery(name = "CustomerListView.findById", query = "SELECT c FROM CustomerListView c WHERE c.id = :id")
    , @NamedQuery(name = "CustomerListView.findByName", query = "SELECT c FROM CustomerListView c WHERE c.name = :name")
    , @NamedQuery(name = "CustomerListView.findByAddress", query = "SELECT c FROM CustomerListView c WHERE c.address = :address")
    , @NamedQuery(name = "CustomerListView.findByZipCode", query = "SELECT c FROM CustomerListView c WHERE c.zipCode = :zipCode")
    , @NamedQuery(name = "CustomerListView.findByPhone", query = "SELECT c FROM CustomerListView c WHERE c.phone = :phone")
    , @NamedQuery(name = "CustomerListView.findByCity", query = "SELECT c FROM CustomerListView c WHERE c.city = :city")
    , @NamedQuery(name = "CustomerListView.findByCountry", query = "SELECT c FROM CustomerListView c WHERE c.country = :country")
    , @NamedQuery(name = "CustomerListView.findByNotes", query = "SELECT c FROM CustomerListView c WHERE c.notes = :notes")
    , @NamedQuery(name = "CustomerListView.findBySid", query = "SELECT c FROM CustomerListView c WHERE c.sid = :sid")})
public class CustomerListView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private short id;
    @Column(name = "name", length = 91)
    private String name;
    @Basic(optional = false)
    @Column(name = "address", nullable = false, length = 50)
    private String address;
    @Column(name = "zip code", length = 10)
    private String zipCode;
    @Basic(optional = false)
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;
    @Basic(optional = false)
    @Column(name = "city", nullable = false, length = 50)
    private String city;
    @Basic(optional = false)
    @Column(name = "country", nullable = false, length = 50)
    private String country;
    @Basic(optional = false)
    @Column(name = "notes", nullable = false, length = 6)
    private String notes;
    @Basic(optional = false)
    @Column(name = "SID", nullable = false)
    private short sid;

    public CustomerListView() {
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public short getSid() {
        return sid;
    }

    public void setSid(short sid) {
        this.sid = sid;
    }
    
}
