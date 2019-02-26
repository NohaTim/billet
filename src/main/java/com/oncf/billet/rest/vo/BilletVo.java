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
public class BilletVo {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String refBillet;
    private String refGare;
    private String typeVoyage;
    private String dateDépart;
    private String dateArrivé;
    private String classe;
    private String prixBase;
    private String reduction;
    private String prixReduction;
    private String numPlace;
    private String nbrPlace;
    private ClientVo clientvo;

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

    public String getDateDépart() {
        return dateDépart;
    }

    public void setDateDépart(String dateDépart) {
        this.dateDépart = dateDépart;
    }

    public String getDateArrivé() {
        return dateArrivé;
    }

    public void setDateArrivé(String dateArrivé) {
        this.dateArrivé = dateArrivé;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getPrixBase() {
        return prixBase;
    }

    public void setPrixBase(String prixBase) {
        this.prixBase = prixBase;
    }

    public String getReduction() {
        return reduction;
    }

    public void setReduction(String reduction) {
        this.reduction = reduction;
    }

    public String getPrixReduction() {
        return prixReduction;
    }

    public void setPrixReduction(String prixReduction) {
        this.prixReduction = prixReduction;
    }

    public String getNumPlace() {
        return numPlace;
    }

    public void setNumPlace(String numPlace) {
        this.numPlace = numPlace;
    }

    public String getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(String nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public ClientVo getClientvo() {
        return clientvo;
    }

    public void setClientvo(ClientVo clientvo) {
        this.clientvo = clientvo;
    }

}
