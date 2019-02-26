/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service;

import com.oncf.billet.bean.Billet;
import java.util.List;

/**
 *
 * @author hp pc
 */
public interface BilletService {
    public Billet findByrefBillet(String reference);
    public Billet creeBillet(Billet billet);
    public List<Billet> findByClientCin(String cin);

    
    
}
