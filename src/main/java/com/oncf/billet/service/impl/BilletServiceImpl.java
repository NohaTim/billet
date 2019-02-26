/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service.impl;

import com.oncf.billet.bean.Billet;
import com.oncf.billet.dao.BilletDao;
import com.oncf.billet.service.BilletService;
import com.oncf.billet.service.ReductionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp pc
 */
@Service
public class BilletServiceImpl implements BilletService {

    @Autowired
    private BilletDao billetDao;
    @Autowired
    private ReductionService reductionService;

    @Override
    public Billet findByrefBillet(String reference) {
        return billetDao.findByrefBillet(reference);
    }

    @Override
    public Billet creeBillet(Billet billet) {
        Billet b = billetDao.findByrefBillet(billet.getRefBillet());
        if (b != null) {
            return null;
        } else {
            billetDao.save(billet);
        }
        return billet;
    }

    @Override
    public List<Billet> findByClientCin(String cin) {
        return billetDao.findByClientCin(cin);

    }

    public BilletDao getBilletDao() {
        return billetDao;
    }

    public void setBilletDao(BilletDao billetDao) {
        this.billetDao = billetDao;
    }

    public ReductionService getReductionService() {
        return reductionService;
    }

    public void setReductionService(ReductionService reductionService) {
        this.reductionService = reductionService;
    }

}
