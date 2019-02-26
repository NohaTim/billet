/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service.impl;

import com.oncf.billet.bean.VoyagePricing;
import com.oncf.billet.dao.VoyagePricingDao;
import com.oncf.billet.service.VoyagePricingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp pc
 */
@Service
public class VoyagePricingServiceImpl implements VoyagePricingService {

    @Autowired
    private VoyagePricingDao voyagePricingDao;
    

    @Override
    public VoyagePricing findByRefPricing(String refPrising) {
        return voyagePricingDao.findByRefPricing(refPrising);
    }

    @Override
    public int creeVoyagePricing(VoyagePricing voyagePricing) {
        VoyagePricing  voyPri = voyagePricingDao.findByRefPricing(voyagePricing.getRefPricing());
        if(voyPri != null){
            return -1;
        }else{
            voyagePricingDao.save(voyagePricing);
        }
        return 1;
    }
    
     @Override
    public List<VoyagePricing> findByClientCin(String cin) {
        return voyagePricingDao.findByClientCin(cin);
    }

    public VoyagePricingDao getVoyagePricingDao() {
        return voyagePricingDao;
    }

    public void setVoyagePricingDao(VoyagePricingDao voyagePricingDao) {
        this.voyagePricingDao = voyagePricingDao;
    }

   

}
