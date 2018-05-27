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
@Table(name = "staff_list", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StaffListView.findAll", query = "SELECT s FROM StaffListView s")
    , @NamedQuery(name = "StaffListView.findById", query = "SELECT s FROM StaffListView s WHERE s.id = :id")
    , @NamedQuery(name = "StaffListView.findByName", query = "SELECT s FROM StaffListView s WHERE s.name = :name")
    , @NamedQuery(name = "StaffListView.findByAddress", query = "SELECT s FROM StaffListView s WHERE s.address = :address")
    , @NamedQuery(name = "StaffListView.findByZipCode", query = "SELECT s FROM StaffListView s WHERE s.zipCode = :zipCode")
    , @NamedQuery(name = "StaffListView.findByPhone", query = "SELECT s FROM StaffListView s WHERE s.phone = :phone")
    , @NamedQuery(name = "StaffListView.findByCity", query = "SELECT s FROM StaffListView s WHERE s.city = :city")
    , @NamedQuery(name = "StaffListView.findByCountry", query = "SELECT s FROM StaffListView s WHERE s.country = :country")
    , @NamedQuery(name = "StaffListView.findBySid", query = "SELECT s FROM StaffListView s WHERE s.sid = :sid")})
public class StaffListView implements Serializable {

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
    @Column(name = "SID", nullable = false)
    private short sid;

    public StaffListView() {
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

    public short getSid() {
        return sid;
    }

    public void setSid(short sid) {
        this.sid = sid;
    }

}
