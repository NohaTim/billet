/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author hp pc
 */
@Entity
public class VoyagePricing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String refPricing;
    private double prixClasse1;
    private double prixClasse2;
    @ManyToOne
    private Client client;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefPricing() {
        return refPricing;
    }

    public void setRefPricing(String refPricing) {
        this.refPricing = refPricing;
    }

    public double getPrixClasse1() {
        return prixClasse1;
    }

    public void setPrixClasse1(double prixClasse1) {
        this.prixClasse1 = prixClasse1;
    }

    public double getPrixClasse2() {
        return prixClasse2;
    }

    public void setPrixClasse2(double prixClasse2) {
        this.prixClasse2 = prixClasse2;
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
        if (!(object instanceof VoyagePricing)) {
            return false;
        }
        VoyagePricing other = (VoyagePricing) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.billet.oncf.bean.VoyagePricing[ id=" + id + " ]";
    }
    
}
