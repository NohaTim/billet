/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest.convertor;

import com.oncf.billet.bean.VoyagePricing;
import com.oncf.billet.commun.util.NumberUtil;
import com.oncf.billet.rest.vo.VoyagePricingVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp pc
 */
public class VoyagePricingVoConvertor implements AbstractConvertor<VoyagePricing, VoyagePricingVo> {

    @Override
    public VoyagePricing toItem(VoyagePricingVo voyagePricingVo) {
        if (voyagePricingVo != null) {
            VoyagePricing voyagePricing = new VoyagePricing();
            voyagePricing.setRefPricing(voyagePricingVo.getRefPricing());
            voyagePricing.setId(voyagePricing.getId());
            voyagePricing.setPrixClasse1(NumberUtil.toDouble(voyagePricingVo.getPrixClasse1()));
            voyagePricing.setPrixClasse2(NumberUtil.toDouble(voyagePricingVo.getPrixClasse2()));
            voyagePricing.setClient(new ClientVoConvertor().toItem(voyagePricingVo.getClientVo()));
            return voyagePricing;

        }
        return null;
    }

    @Override
    public VoyagePricingVo toVo(VoyagePricing voyagePricing) {
        if (voyagePricing != null) {
            VoyagePricingVo voyagePricingVo = new VoyagePricingVo();
            voyagePricingVo.setRefPricing(voyagePricing.getRefPricing());
            voyagePricingVo.setId(voyagePricing.getId());
            voyagePricingVo.setPrixClasse1(Double.toString(voyagePricing.getPrixClasse1()));
            voyagePricingVo.setPrixClasse2(Double.toString(voyagePricing.getPrixClasse2()));
            voyagePricingVo.setClientVo(new ClientVoConvertor().toVo(voyagePricing.getClient()));
            return voyagePricingVo;

        }
        return null;
    }

    public List<VoyagePricing> toItem(List<VoyagePricingVo> voyagePricingVos) {
        if (voyagePricingVos == null || voyagePricingVos.isEmpty()) {
            return null;
        } else {
            List<VoyagePricing> voyagePricings = new ArrayList<>();
            for (VoyagePricingVo voyagePricingVo : voyagePricingVos) {
                voyagePricings.add(toItem(voyagePricingVo));
            }
            return voyagePricings;
        }

    }
    
    public List<VoyagePricingVo> toVo(List<VoyagePricing> voyagePricings) {
        if (voyagePricings == null || voyagePricings.isEmpty()) {
            return null;
        } else {
            List<VoyagePricingVo> voyagePricingVos = new ArrayList<>();
            for (VoyagePricing voyagePricing : voyagePricings) {
                voyagePricingVos.add(toVo(voyagePricing));
            }
            return voyagePricingVos;
        }

    }

}
