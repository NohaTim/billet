/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.dao;

import com.oncf.billet.bean.Reduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp pc
 */
@Repository
public interface ReductionDao extends JpaRepository<Reduction,Long> {
    public Reduction findByRefReduction(String  refReduction);
    
}
