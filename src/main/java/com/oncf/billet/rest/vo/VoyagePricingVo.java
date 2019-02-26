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
public class VoyagePricingVo {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String refPricing;
    private String prixClasse1;
    private String prixClasse2;
    private ClientVo clientVo;

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

    public String getPrixClasse1() {
        return prixClasse1;
    }

    public void setPrixClasse1(String prixClasse1) {
        this.prixClasse1 = prixClasse1;
    }

    public String getPrixClasse2() {
        return prixClasse2;
    }

    public void setPrixClasse2(String prixClasse2) {
        this.prixClasse2 = prixClasse2;
    }

    public ClientVo getClientVo() {
        return clientVo;
    }

    public void setClientVo(ClientVo clientVo) {
        this.clientVo = clientVo;
    }

}
