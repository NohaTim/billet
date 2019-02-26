/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.dao;

import com.oncf.billet.bean.VoyagePricing;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp pc
 */
@Repository
public interface VoyagePricingDao extends JpaRepository<VoyagePricing, Long>{
    public VoyagePricing findByRefPricing(String refPrising);
    public List<VoyagePricing> findByClientCin(String cin);
}
