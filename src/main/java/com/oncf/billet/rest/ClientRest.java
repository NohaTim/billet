/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest;

import com.oncf.billet.bean.Client;
import com.oncf.billet.rest.convertor.ClientVoConvertor;
import com.oncf.billet.rest.vo.ClientVo;
import com.oncf.billet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping({"/oncf/clients"})
public class ClientRest {

    @Autowired
    private ClientService clientService;

    @PostMapping("/")
    public ClientVo creeClient(@RequestBody ClientVo clientVo) {
        ClientVoConvertor clientVoConvertor = new ClientVoConvertor();
        Client client = clientVoConvertor.toItem(clientVo);
        Client c = clientService.creeClient(client);
        return clientVoConvertor.toVo(client);
    }

    @GetMapping("/cin/{cin}")
    public ClientVo findByCin(@PathVariable String cin) {
        ClientVoConvertor clientVoConvertor = new ClientVoConvertor();
        Client client = clientService.findByCin(cin);
        return clientVoConvertor.toVo(client);
    }
    @PostMapping("/inscrire")
    public ClientVo inscrireClient(@RequestBody ClientVo nvclientVo) {
        ClientVoConvertor clientVoConvertor = new ClientVoConvertor();
        Client nvClient = clientVoConvertor.toItem(nvclientVo);
        Client nvC = clientService.inscrireClient(nvClient);
        return clientVoConvertor.toVo(nvC);

    }

    public ClientService getClientService() {
        return clientService;
    }

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

}
