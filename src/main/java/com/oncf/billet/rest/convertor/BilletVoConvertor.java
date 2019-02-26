/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest.convertor;

import com.oncf.billet.bean.Billet;
import com.oncf.billet.commun.util.DateUtil;
import com.oncf.billet.commun.util.NumberUtil;
import com.oncf.billet.rest.vo.BilletVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp pc
 */
public class BilletVoConvertor implements AbstractConvertor<Billet, BilletVo> {

    @Override
    public Billet toItem(BilletVo billetVo) {
        if (billetVo != null) {
            Billet billet = new Billet();
            billet.setRefBillet(billetVo.getRefBillet());
            billet.setId(billetVo.getId());
            billet.setRefGare(billetVo.getRefGare());
            billet.setTypeVoyage(billetVo.getTypeVoyage());
            billet.setClasse(billetVo.getClasse());
            billet.setDateDépart(DateUtil.parse(billetVo.getDateDépart()));
            billet.setDateArrivé(DateUtil.parse(billetVo.getDateArrivé()));
            billet.setPrixBase(NumberUtil.toDouble(billetVo.getPrixBase()));
            billet.setPrixReduction(NumberUtil.toDouble(billetVo.getPrixReduction()));
            billet.setReduction(NumberUtil.toDouble(billetVo.getReduction()));
            billet.setNumPlace(NumberUtil.toInteger(billetVo.getNumPlace()));
            billet.setNbrPlace(NumberUtil.toInteger(billetVo.getNbrPlace()));
            billet.setClient(new ClientVoConvertor().toItem(billetVo.getClientvo()));
            return billet;
        }
        return null;
    }

    @Override
    public BilletVo toVo(Billet billet) {
        if (billet != null) {
            BilletVo billetVo = new BilletVo();
            billetVo.setRefBillet(billet.getRefBillet());
            billetVo.setId(billet.getId());
            billetVo.setRefGare(billet.getRefGare());
            billetVo.setTypeVoyage(billet.getTypeVoyage());
            billetVo.setClasse(billet.getClasse());
            billetVo.setDateDépart(DateUtil.formateDate(billet.getDateDépart()));
            billetVo.setDateArrivé(DateUtil.formateDate(billet.getDateArrivé()));
            billetVo.setPrixBase(Double.toString(billet.getPrixBase()));
            billetVo.setReduction(Double.toString(billet.getReduction()));
            billetVo.setPrixReduction(Double.toString(billet.getPrixReduction()));
            billetVo.setNbrPlace(Integer.toString(billet.getNbrPlace()));
            billetVo.setNumPlace(Integer.toString(billet.getNumPlace()));
            billetVo.setClientvo(new ClientVoConvertor().toVo(billet.getClient()));
            return billetVo;
        }
        return null;

    }
     public List<Billet> toItem(List<BilletVo> billetVos) {
        if (billetVos == null || billetVos.isEmpty()) {
            return null;
        } else {
            List<Billet> billets = new ArrayList<>();
            for (BilletVo billetVo : billetVos) {
                billets.add(toItem(billetVo));
            }
            return billets;
        }
    }

    public List<BilletVo> toVo(List<Billet> billets) {
        if (billets == null || billets.isEmpty()) {
            return null;
        } else {
            List<BilletVo> billetVos = new ArrayList<>();
            for (Billet billet : billets) {
                billetVos.add(toVo(billet));
            }
            return billetVos;
        }
    }

}
