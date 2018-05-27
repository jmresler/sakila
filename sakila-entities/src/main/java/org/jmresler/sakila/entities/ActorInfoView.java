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
@Table(name = "actor_info", catalog = "sakila", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActorInfoView.findAll", query = "SELECT a FROM ActorInfoView a")
    , @NamedQuery(name = "ActorInfoView.findByActorId", query = "SELECT a FROM ActorInfoView a WHERE a.actorId = :actorId")
    , @NamedQuery(name = "ActorInfoView.findByFirstName", query = "SELECT a FROM ActorInfoView a WHERE a.firstName = :firstName")
    , @NamedQuery(name = "ActorInfoView.findByLastName", query = "SELECT a FROM ActorInfoView a WHERE a.lastName = :lastName")})
public class ActorInfoView implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "actor_id", nullable = false)
    private short actorId;
    @Basic(optional = false)
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Basic(optional = false)
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Lob
    @Column(name = "film_info", length = 65535)
    private String filmInfo;

    public ActorInfoView() {
    }

    public short getActorId() {
        return actorId;
    }

    public void setActorId(short actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
    }
    
}
