/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest.convertor;

import com.oncf.billet.bean.Client;
import com.oncf.billet.rest.vo.ClientVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp pc
 */
public class ClientVoConvertor implements AbstractConvertor<Client, ClientVo> {

    @Override
    public Client toItem(ClientVo clientVo) {
        if (clientVo != null) {
            Client client = new Client();
            client.setCin(clientVo.getCin());
            client.setId(clientVo.getId());
            client.setNom(clientVo.getNom());
            client.setPrenom(clientVo.getPrenom());
            client.setNumTel(clientVo.getMotDePasse());
            client.setMotDePasse(clientVo.getMotDePasse());
           // client.setBillets(new BilletVoConvertor().toItem(clientVo.getBilletVos()));
           //client.setVoyagePricings(new VoyagePricingVoConvertor().toItem(clientVo.getVoyagePricingVos()));
           //client.setReservations(new ReservationVoConvertor().toItem(clientVo.getReservationVos()));
            return client;
        }
        return null;
    }

    @Override
    public ClientVo toVo(Client client) {
        if (client != null) {
            ClientVo clientVo = new ClientVo();
            clientVo.setCin(client.getCin());
            clientVo.setId(client.getId());
            clientVo.setNom(client.getNom());
            clientVo.setPrenom(client.getPrenom());
            clientVo.setNumTel(client.getNumTel());
            clientVo.setMotDePasse(client.getMotDePasse());
            //clientVo.setBilletVos(new BilletVoConvertor().toVo(client.getBillets()));
            //clientVo.setVoyagePricingVos(new VoyagePricingVoConvertor().toVo(client.getVoyagePricings()));
            //clientVo.setReservationVos(new ReservationVoConvertor().toVo(client.getReservations())); 
            return clientVo;
        }
        return null;
    }
    
    public List<Client> toItem(List<ClientVo> clientVos){
        if (clientVos==null || clientVos.isEmpty()){
            return null;
        }else{
            List <Client>clients =new ArrayList<>();
            for (ClientVo clientVo : clientVos) {
                clients.add(toItem(clientVo));
            }return clients;
        }
    }
    public List<ClientVo> toVo(List<Client> clients){
        if (clients==null || clients.isEmpty()){
            return null;
        }else{
            List <ClientVo>clientVos =new ArrayList<>();
            for (Client client : clients) {
                clientVos.add(toVo(client));
            }return clientVos;
        }
    }
    
    

}
