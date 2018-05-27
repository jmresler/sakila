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
@Table(name = "film_list", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FilmListView.findAll", query = "SELECT f FROM FilmListView f")
    , @NamedQuery(name = "FilmListView.findByFid", query = "SELECT f FROM FilmListView f WHERE f.fid = :fid")
    , @NamedQuery(name = "FilmListView.findByTitle", query = "SELECT f FROM FilmListView f WHERE f.title = :title")
    , @NamedQuery(name = "FilmListView.findByCategory", query = "SELECT f FROM FilmListView f WHERE f.category = :category")
    , @NamedQuery(name = "FilmListView.findByPrice", query = "SELECT f FROM FilmListView f WHERE f.price = :price")
    , @NamedQuery(name = "FilmListView.findByLength", query = "SELECT f FROM FilmListView f WHERE f.length = :length")
    , @NamedQuery(name = "FilmListView.findByRating", query = "SELECT f FROM FilmListView f WHERE f.rating = :rating")})
public class FilmListView implements Serializable {

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

    public FilmListView() {
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
