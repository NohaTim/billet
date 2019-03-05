/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service.impl;

import com.oncf.billet.bean.Reservation;

import com.oncf.billet.dao.ReservationDao;
import com.oncf.billet.service.ReservationService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.util.BeanDefinitionUtils;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp pc
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationDao reservationDao;
    @Autowired
    private ReservationService reservationService;

    @Override
    public Reservation findByRefReservation(String refReservation) {
        return reservationDao.findByRefReservation(refReservation);
    }

    @Override
    public List<Reservation> findByClientCin(String cin) {
        return reservationDao.findByClientCin(cin);
    }
    @Override
    public Reservation findByRefReservationAndClientCin(String reference, String cin) {
        return reservationDao.findByRefReservationAndClientCin(reference, cin);
    }
   

    /* @Override
    public Reservation modifierReservation(Reservation reservation) {
        Reservation res=reservationService.findByRefReservation(reservation.getRefReservation());
        if(res==null){
            return null;
        }else{
            res.setRefReservation(res.getRefReservation());
            res.setDateDépart(reservation.getDateDépart());
            res.setDateArrivée(reservation.getDateArrivée());
            res.setGareDépart(reservation.getGareDépart());
            res.setGareArrivé(reservation.getGareArrivé());
            res.setTypeVoyage(reservation.getTypeVoyage());
            res.setNbrPlace(reservation.getNbrPlace());
            res.setDateReservation(reservation.getDateReservation());
        }
        return res;
    }*/
    
    
     @Override
    public int deleteReservation(String refReservation) {
        Reservation res=reservationService.findByRefReservation(refReservation);
        if(res==null){
            return -1;
        }else{
            reservationDao.delete(res);
        }
        return 1;
    }
  
    @Override
    public int findMaxIndice() {
        List<Reservation> ress = reservationDao.findAll();
        int indiceMax = 0;
        for (int i = 0; i < ress.size(); i++) {
            Reservation res = ress.get(i);
            if (res.getIndice() > indiceMax) {
                indiceMax = res.getIndice();
            }
        }
        return indiceMax;

    }

    @Override
    public Reservation reservation(Reservation reservation) {

        Reservation res = new Reservation();
        Date date=new Date();
        int indice=reservationService.findMaxIndice();
        res.setGareDépart(reservation.getGareDépart());
        res.setGareArrivé(reservation.getGareArrivé());
        res.setDateArrivée(reservation.getDateArrivée());
        res.setDateDépart(reservation.getDateDépart());
        res.setTypeVoyage(reservation.getTypeVoyage());
        res.setNbrPlace(reservation.getNbrPlace());
        res.setConfirmer(reservation.isConfirmer());
        res.setClient(reservation.getClient());
        res.setIndice(indice+1);
        if (res.isConfirmer()) {//ajouter la condition de nbr des places restants
            res.setRefReservation("RR-"+(date.getYear()+1900)+"-"+(indice+1));
            res.setDateReservation(new Date());
        } else {
            res.setDateReservation(null);
        }
        reservationDao.save(res);
        return res;

    }

    public ReservationDao getReservationDao() {
        return reservationDao;
    }

    public void setReservationDao(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }


    



}
