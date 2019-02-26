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
public class Billet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String refBillet;
    private String refGare;
    private String typeVoyage;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateDépart;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateArrivé;
    private String classe;
    private double prixBase;
    private double reduction;
    private double prixReduction;
    private int numPlace;
    private int nbrPlace;
    @ManyToOne
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefBillet() {
        return refBillet;
    }

    public void setRefBillet(String refBillet) {
        this.refBillet = refBillet;
    }

    public String getRefGare() {
        return refGare;
    }

    public void setRefGare(String refGare) {
        this.refGare = refGare;
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

    public Date getDateArrivé() {
        return dateArrivé;
    }

    public void setDateArrivé(Date dateArrivé) {
        this.dateArrivé = dateArrivé;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public double getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(double prixBase) {
        this.prixBase = prixBase;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public double getPrixReduction() {
        return prixReduction;
    }

    public void setPrixReduction(double prixReduction) {
        this.prixReduction = prixReduction;
    }

    public int getNumPlace() {
        return numPlace;
    }

    public void setNumPlace(int numPlace) {
        this.numPlace = numPlace;
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        if (!(object instanceof Billet)) {
            return false;
        }
        Billet other = (Billet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.billet.oncf.bean.Billet[ id=" + id + " ]";
    }

}
