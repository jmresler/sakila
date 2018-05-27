/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmresler.sakila.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author John M. Resler
 */
@Entity
@Table(name = "nicer_but_slower_film_list", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NicerButSlowerFilmListView.findAll", query = "SELECT n FROM NicerButSlowerFilmListView n")
    , @NamedQuery(name = "NicerButSlowerFilmListView.findByFid", query = "SELECT n FROM NicerButSlowerFilmListView n WHERE n.fid = :fid")
    , @NamedQuery(name = "NicerButSlowerFilmListView.findByTitle", query = "SELECT n FROM NicerButSlowerFilmListView n WHERE n.title = :title")
    , @NamedQuery(name = "NicerButSlowerFilmListView.findByCategory", query = "SELECT n FROM NicerButSlowerFilmListView n WHERE n.category = :category")
    , @NamedQuery(name = "NicerButSlowerFilmListView.findByPrice", query = "SELECT n FROM NicerButSlowerFilmListView n WHERE n.price = :price")
    , @NamedQuery(name = "NicerButSlowerFilmListView.findByLength", query = "SELECT n FROM NicerButSlowerFilmListView n WHERE n.length = :length")
    , @NamedQuery(name = "NicerButSlowerFilmListView.findByRating", query = "SELECT n FROM NicerButSlowerFilmListView n WHERE n.rating = :rating")})
public class NicerButSlowerFilmListView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "FID")
    private Short fid;
    @Column(name = "title", length = 255)
    private String title;
    @Lob
    @Column(name = "description", length = 65535)
    private String description;
    @Basic(optional = false)
    @Column(name = "category", nullable = false, length = 25)
    private String category;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price", precision = 4, scale = 2)
    private BigDecimal price;
    @Column(name = "length")
    private Short length;
    @Column(name = "rating", length = 5)
    private String rating;
    @Lob
    @Column(name = "actors", length = 65535)
    private String actors;

    public NicerButSlowerFilmListView() {
    }

    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
    
}
