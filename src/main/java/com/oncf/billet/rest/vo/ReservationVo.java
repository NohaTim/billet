/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest.vo;

/**
 *
 * @author hp pc
 */
public class ReservationVo {

    private static final long serialVersionUID = 1L;
    private Long Id;
    private String refReservation;
    private String gareDépart;
    private String gareArrivé;
    private String typeVoyage;
    private String dateDépart;
    private String dateArrivée;
    private String nbrPlace;
    private String dateReservation;
    private String confirmer;
    private String indice;
    private ClientVo clientvo;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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

    public String getDateDépart() {
        return dateDépart;
    }

    public void setDateDépart(String dateDépart) {
        this.dateDépart = dateDépart;
    }

    public String getDateArrivée() {
        return dateArrivée;
    }

    public void setDateArrivée(String dateArrivée) {
        this.dateArrivée = dateArrivée;
    }

    public String getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(String nbrPlace) {
        this.nbrPlace = nbrPlace;
    }


    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public ClientVo getClientvo() {
        return clientvo;
    }

    public void setClientvo(ClientVo clientvo) {
        this.clientvo = clientvo;
    }

    public String getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }
    
    

}
