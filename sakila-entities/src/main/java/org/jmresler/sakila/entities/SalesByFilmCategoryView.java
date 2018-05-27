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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author John M. Resler
 */
@Entity
@Table(name = "sales_by_film_category", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesByFilmCategoryView.findAll", query = "SELECT s FROM SalesByFilmCategoryView s")
    , @NamedQuery(name = "SalesByFilmCategoryView.findByCategory", query = "SELECT s FROM SalesByFilmCategoryView s WHERE s.category = :category")
    , @NamedQuery(name = "SalesByFilmCategoryView.findByTotalSales", query = "SELECT s FROM SalesByFilmCategoryView s WHERE s.totalSales = :totalSales")})
public class SalesByFilmCategoryView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "category", nullable = false, length = 25)
    private String category;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_sales", precision = 27, scale = 2)
    private BigDecimal totalSales;

    public SalesByFilmCategoryView() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }
    
}
