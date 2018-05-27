/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jmresler.sakila.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "sales_by_store", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesByStoreView.findAll", query = "SELECT s FROM SalesByStoreView s")
    , @NamedQuery(name = "SalesByStoreView.findByStore", query = "SELECT s FROM SalesByStoreView s WHERE s.store = :store")
    , @NamedQuery(name = "SalesByStoreView.findByManager", query = "SELECT s FROM SalesByStoreView s WHERE s.manager = :manager")
    , @NamedQuery(name = "SalesByStoreView.findByTotalSales", query = "SELECT s FROM SalesByStoreView s WHERE s.totalSales = :totalSales")})
public class SalesByStoreView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "store", length = 101)
    private String store;
    @Column(name = "manager", length = 91)
    private String manager;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_sales", precision = 27, scale = 2)
    private BigDecimal totalSales;

    public SalesByStoreView() {
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }
    
}
