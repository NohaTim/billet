/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service;

import com.oncf.billet.bean.Reservation;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hp pc
 */
public interface ReservationService {

    public Reservation findByRefReservation(String refReservation);
    public List<Reservation> findByClientCin(String cin);
    public Reservation reservation(Reservation reservation);
    public int findMaxIndice();
    //public Reservation modifierReservation(Reservation reservation);
    public int deleteReservation(String refReservation);
    
    
   
    
    

    //public String findByDateReservation(Date dateReservation);
    //public Reservation creeReservation(Reservation reservation);
    //public String gererReference(int indice);
   
    
}
