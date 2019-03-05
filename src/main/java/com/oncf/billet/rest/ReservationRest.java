/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest;

import com.oncf.billet.bean.Reservation;
import com.oncf.billet.rest.convertor.ReservationVoConvertor;
import com.oncf.billet.rest.vo.ReservationVo;
import com.oncf.billet.service.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp pc
 */
@RestController()
@RequestMapping({"/oncf/reservations"})
public class ReservationRest {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/refReservation/{refReservation}")
    public ReservationVo findByRefReservation(@PathVariable String refReservation) {
        ReservationVoConvertor reservationVoConvertor = new ReservationVoConvertor();
        Reservation res = reservationService.findByRefReservation(refReservation);
        return reservationVoConvertor.toVo(res);
    }

    @GetMapping("/cin/{cin}")
    public List<ReservationVo> findByClientCin(@PathVariable String cin) {
        ReservationVoConvertor reservationVoConvertor = new ReservationVoConvertor();
        List<Reservation> ress = reservationService.findByClientCin(cin);
        return reservationVoConvertor.toVo(ress);
    }

    /*@PostMapping("/")
    public ReservationVo creeReservation(@RequestBody ReservationVo reservationVo) {
        ReservationVoConvertor reservationVoConvertor = new ReservationVoConvertor();
        Reservation res = reservationVoConvertor.toItem(reservationVo);
        Reservation reserv = reservationService.creeReservation(res);
        return reservationVoConvertor.toVo(reserv);

    }*/
    @PostMapping("//")
    public ReservationVo reservation(@RequestBody ReservationVo reservationVo) {
        ReservationVoConvertor reservationVoConvertor = new ReservationVoConvertor();
        Reservation res = reservationVoConvertor.toItem(reservationVo);
        Reservation reserv = reservationService.reservation(res);
        return reservationVoConvertor.toVo(reserv);

    }

    @GetMapping("")
    public int findMaxIndice() {
        return reservationService.findMaxIndice();
    }
    @DeleteMapping("/refReservation/{refReservation}")
     public int deleteReservation(@PathVariable String refReservation) {
        return reservationService.deleteReservation(refReservation);
    }
    @GetMapping("/refReservation/{refReservation}/cin/{cin}")
    public ReservationVo findByRefReservationAndCinClient(@PathVariable String reference, @PathVariable String cin) {
        ReservationVoConvertor reservationVoConvertor=new ReservationVoConvertor();
                    System.out.println("kokoooo ==> "+reference+""+cin);

        Reservation res=reservationService.findByRefReservationAndClientCin(reference, cin);
        return reservationVoConvertor.toVo(res);
    }
     

    public ReservationService getReservationService() {
        return reservationService;
    }

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

}
