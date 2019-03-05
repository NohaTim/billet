/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest.convertor;

import com.oncf.billet.bean.Reservation;
import com.oncf.billet.commun.util.DateUtil;
import com.oncf.billet.commun.util.NumberUtil;
import com.oncf.billet.rest.vo.ReservationVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp pc
 */
public class ReservationVoConvertor implements AbstractConvertor<Reservation, ReservationVo> {

    @Override
    public Reservation toItem(ReservationVo resVo) {
        if (resVo != null) {
            Reservation res = new Reservation();
            res.setRefReservation(resVo.getRefReservation());
            res.setId(resVo.getId());
            res.setGareDépart(resVo.getGareDépart());
            res.setGareArrivé(resVo.getGareArrivé());
            res.setTypeVoyage(resVo.getTypeVoyage());
            res.setDateDépart(DateUtil.parse(resVo.getDateDépart()));
            res.setDateArrivée(DateUtil.parse(resVo.getDateArrivée()));
            res.setNbrPlace(NumberUtil.toInteger(resVo.getNbrPlace()));
            res.setDateReservation(DateUtil.parse(resVo.getDateReservation()));
            res.setConfirmer(Boolean.valueOf(resVo.getConfirmer()).booleanValue());
            res.setIndice(NumberUtil.toInteger(resVo.getIndice()));
            res.setClient(new ClientVoConvertor().toItem(resVo.getClientvo()));
            System.out.println("kokoooo ==> "+res.getClient());

            return res;
        }
        return null;
    }

    @Override
    public ReservationVo toVo(Reservation res) {
        if (res != null) {
            ReservationVo resVo = new ReservationVo();
            resVo.setRefReservation(res.getRefReservation());
            resVo.setId(res.getId());
            resVo.setGareDépart(res.getGareDépart());
            resVo.setGareArrivé(res.getGareArrivé());
            resVo.setTypeVoyage(res.getTypeVoyage());
            resVo.setDateDépart(DateUtil.formateDate(res.getDateDépart()));
            resVo.setDateArrivée(DateUtil.formateDate(res.getDateArrivée()));
            resVo.setNbrPlace(NumberUtil.toString(res.getNbrPlace()));
            resVo.setDateReservation(DateUtil.formateDate(res.getDateReservation()));
            resVo.setConfirmer(Boolean.toString(res.isConfirmer()));
            resVo.setIndice(NumberUtil.toString(res.getIndice()));
            System.out.println("kokoooo ==> "+res.getClient());
            resVo.setClientvo(new ClientVoConvertor().toVo(res.getClient()));
            return resVo;
        }
        return null;
    }

    @Override
    public List<ReservationVo> toVo(List<Reservation> ress) {
        if (ress == null || ress.isEmpty()) {
            return null;
        } else {
            List<ReservationVo> reservationVos = new ArrayList<>();
            for (Reservation res : ress) {
                reservationVos.add(toVo(res));
            }
            return reservationVos;
        }
    }

    @Override
    public List<Reservation> toItem(List<ReservationVo> resVos) {
        if (resVos == null || resVos.isEmpty()) {
            return null;
        } else {
            List<Reservation> ress = new ArrayList<>();
            for (ReservationVo resVo : resVos) {
                ress.add(toItem(resVo));
            }
            return ress;
        }
    }

}
