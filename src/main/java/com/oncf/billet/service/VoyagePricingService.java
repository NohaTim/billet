/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service;

import com.oncf.billet.bean.VoyagePricing;
import java.util.List;

/**
 *
 * @author hp pc
 */
public interface VoyagePricingService {
    public int creeVoyagePricing(VoyagePricing voyagePricing);
    public VoyagePricing findByRefPricing(String refPrising);
    public List<VoyagePricing> findByClientCin(String cin);
    
}
