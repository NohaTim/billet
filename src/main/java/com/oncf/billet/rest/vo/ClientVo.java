/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 *
 * @author hp pc
 */
public class ClientVo {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String cin;
    private String nom;
    private String prenom;
    private String numTel;
    private String motDePasse;
    private List<BilletVo> billetVos;
    private List<VoyagePricingVo> voyagePricingVos;
    private List<ReservationVo>reservationVos;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public List<BilletVo> getBilletVos() {
        return billetVos;
    }
    
    public void setBilletVos(List<BilletVo> billetVos) {
        this.billetVos = billetVos;
    }

    public List<VoyagePricingVo> getVoyagePricingVos() {
        return voyagePricingVos;
    }

    public void setVoyagePricingVos(List<VoyagePricingVo> voyagePricingVos) {
        this.voyagePricingVos = voyagePricingVos;
    }

    public List<ReservationVo> getReservationVos() {
        return reservationVos;
    }

    public void setReservationVos(List<ReservationVo> reservationVos) {
        this.reservationVos = reservationVos;
    }

   
    
    

}
