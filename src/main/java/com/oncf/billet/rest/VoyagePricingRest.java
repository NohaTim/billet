/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest;

import com.oncf.billet.bean.VoyagePricing;
import com.oncf.billet.rest.convertor.VoyagePricingVoConvertor;
import com.oncf.billet.rest.vo.VoyagePricingVo;
import com.oncf.billet.service.VoyagePricingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp pc
 *
 */
@RestController()
@RequestMapping({"/oncf/voyagePricings"})
public class VoyagePricingRest {

    @Autowired
    private VoyagePricingService voyagePricingService;

    @PostMapping("/")
    public int creeVoyagePricing(@RequestBody VoyagePricingVo voyagePricingVo){
        VoyagePricingVoConvertor voyagePricingVoConvertor=new VoyagePricingVoConvertor();
        VoyagePricing voyP=voyagePricingVoConvertor.toItem(voyagePricingVo);
        voyagePricingService.creeVoyagePricing(voyP);
        voyagePricingVoConvertor.toVo(voyP);
        return 1;
    }

    @GetMapping("/refPricing/{refPricing}")
    public VoyagePricingVo findByRefPricing(@PathVariable String refPricing) {
        VoyagePricingVoConvertor voyagePricingVoConvertor=new VoyagePricingVoConvertor();
        VoyagePricing voyPr=voyagePricingService.findByRefPricing(refPricing);
        return voyagePricingVoConvertor.toVo(voyPr);
    }
    @GetMapping("/cin/{cin}")
    public List<VoyagePricingVo> findByClientCin(@PathVariable String cin) {
        VoyagePricingVoConvertor voyagePricingVoConvertor=new VoyagePricingVoConvertor();
        List<VoyagePricing> VoyPrs=voyagePricingService.findByClientCin(cin);
        return voyagePricingVoConvertor.toVo(VoyPrs);
      
    }
    
    

    public VoyagePricingService getVoyagePricingService() {
        return voyagePricingService;
    }

    public void setVoyagePricingService(VoyagePricingService voyagePricingService) {
        this.voyagePricingService = voyagePricingService;
    }

}
