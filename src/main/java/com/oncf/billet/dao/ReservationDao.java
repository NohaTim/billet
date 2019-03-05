/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.dao;

import com.oncf.billet.bean.Client;
import com.oncf.billet.bean.Reservation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp pc
 */
@Repository
public interface ReservationDao  extends JpaRepository<Reservation,Long>{
    public Reservation findByRefReservation(String refReservation);
    public List<Reservation> findByClientCin(String cin);
    public Reservation findByRefReservationAndClientCin(String reference,String cin);
    
    
   
    
    
    
}
