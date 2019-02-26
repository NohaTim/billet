/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest;

import com.oncf.billet.bean.Billet;
import com.oncf.billet.rest.convertor.BilletVoConvertor;
import com.oncf.billet.rest.vo.BilletVo;
import com.oncf.billet.service.BilletService;
import java.util.List;
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
@RestController
@RequestMapping({"/oncf/billets"})
public class BilletRest {

    @Autowired
    private BilletService billetService;

    @PostMapping("/")
    public BilletVo creeBillet(@RequestBody BilletVo billetVo) {
        BilletVoConvertor billetVoConvertor = new BilletVoConvertor();
        Billet b = billetVoConvertor.toItem(billetVo);
        Billet b1=billetService.creeBillet(b);
        return billetVoConvertor.toVo(b1);
    }

    @GetMapping("/refBillet/{refBillet}")
    public BilletVo findByrefBillet(@PathVariable String refBillet) {
        BilletVoConvertor billetVoConvertor = new BilletVoConvertor();
        Billet b = billetService.findByrefBillet(refBillet);
        return billetVoConvertor.toVo(b);

    }

    @GetMapping("/cin/{cin}")
    public List<BilletVo> findByClientCin(@PathVariable String cin) {
        BilletVoConvertor billetVoConvertor = new BilletVoConvertor();
        List<Billet> billets = billetService.findByClientCin(cin);
        return billetVoConvertor.toVo(billets);
    }

    public BilletService getBilletService() {
        return billetService;
    }

    public void setBilletService(BilletService billetService) {
        this.billetService = billetService;
    }

}
