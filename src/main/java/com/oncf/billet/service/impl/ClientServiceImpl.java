/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.service.impl;

import com.oncf.billet.bean.Billet;
import com.oncf.billet.bean.Client;
import com.oncf.billet.bean.Reservation;
import com.oncf.billet.dao.ClientDao;
import com.oncf.billet.service.BilletService;
import com.oncf.billet.service.ClientService;
import com.oncf.billet.service.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp pc
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientdao;
    @Autowired
    private BilletService billetService;
    @Autowired
    private ReservationService reservationService;

    @Override
    public Client creeClient(Client client) {
        Client c = clientdao.findByCin(client.getCin());
        if (c != null) {
            return null;
        } else {
            clientdao.save(client);
        }
        return client;
    }
    
     @Override
    public Client inscrireClient(Client client) {
        Client nvClient= new Client();
        nvClient.setCin(client.getCin());
        nvClient.setNom(client.getNom());
        nvClient.setPrenom(client.getPrenom());
        nvClient.setMotDePasse(client.getMotDePasse());
        clientdao.save(nvClient);
        return  nvClient;
    }

    @Override
    public Client findByCin(String cin) {
        return clientdao.findByCin(cin);
    }

    public ClientDao getClientdao() {
        return clientdao;
    }

    public void setClientdao(ClientDao clientdao) {
        this.clientdao = clientdao;
    }

    public BilletService getBilletService() {
        return billetService;
    }

    public void setBilletService(BilletService billetService) {
        this.billetService = billetService;
    }


}
