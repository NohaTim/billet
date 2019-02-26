/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service;

import com.oncf.billet.bean.Client;

/**
 *
 * @author hp pc
 */
public interface ClientService {

    public Client creeClient(Client client);

    public Client findByCin(String cin);
    public Client inscrireClient(Client client);

}
