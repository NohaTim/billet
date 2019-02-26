/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service;

import com.oncf.billet.bean.Reduction;
import java.util.Date;

/**
 *
 * @author hp pc
 */
public interface ReductionService {

    public Reduction findByRefReduction(String refReduction);

    public int creeReduction(Reduction reduction);
    
    public double calculReduction();
}
