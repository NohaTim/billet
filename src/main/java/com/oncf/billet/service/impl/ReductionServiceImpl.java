/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service.impl;

import com.oncf.billet.bean.Reduction;
import com.oncf.billet.dao.ReductionDao;
import com.oncf.billet.service.ReductionService;
import com.oncf.billet.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp pc
 */
@Service
public class ReductionServiceImpl implements ReductionService {

    @Autowired
    private ReductionDao reductionDao;
    @Autowired
    private ReservationService reservationService;

    @Override
    public Reduction findByRefReduction(String refReduction) {
        return reductionDao.findByRefReduction(refReduction);
    }

    @Override
    public int  creeReduction(Reduction reduction) {
        reductionDao.save(reduction);
        return 1;
    }
    
    @Override
    public double calculReduction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ReductionDao getReductionDao() {
        return reductionDao;
    }

    public void setReductionDao(ReductionDao reductionDao) {
        this.reductionDao = reductionDao;
    }

    

}
