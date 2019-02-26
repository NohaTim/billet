/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author hp pc
 */
@Entity
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String refReservation;
    private String gareDépart;
    private String gareArrivé;
    private String typeVoyage;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateDépart;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateArrivée;
    private int nbrPlace;
    private boolean confirmer;
    private int indice;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateReservation;
    @ManyToOne
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefReservation() {
        return refReservation;
    }

    public void setRefReservation(String refReservation) {
        this.refReservation = refReservation;
    }

    public String getGareDépart() {
        return gareDépart;
    }

    public void setGareDépart(String gareDépart) {
        this.gareDépart = gareDépart;
    }

    public String getGareArrivé() {
        return gareArrivé;
    }

    public void setGareArrivé(String gareArrivé) {
        this.gareArrivé = gareArrivé;
    }

    public String getTypeVoyage() {
        return typeVoyage;
    }

    public void setTypeVoyage(String typeVoyage) {
        this.typeVoyage = typeVoyage;
    }

    public Date getDateDépart() {
        return dateDépart;
    }

    public void setDateDépart(Date dateDépart) {
        this.dateDépart = dateDépart;
    }

    public Date getDateArrivée() {
        return dateArrivée;
    }

    public void setDateArrivée(Date dateArrivée) {
        this.dateArrivée = dateArrivée;
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isConfirmer() {
        return confirmer;
    }

    public void setConfirmer(boolean confirmer) {
        this.confirmer = confirmer;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oncf.billet.bean.Reservation[ id=" + id + " ]";
    }

}
