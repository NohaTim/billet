/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest;

import com.oncf.billet.bean.Reduction;
import com.oncf.billet.service.ReductionService;
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
@RequestMapping({"/oncf/reductions"})
public class ReductionRest {

    @Autowired
    private ReductionService reductionService;

    @PostMapping("/")
    public int creeReduction(@RequestBody Reduction reduction) {
        return reductionService.creeReduction(reduction);
    }

    @GetMapping("/reference/{refReduction}")
    public Reduction findByRefReduction(@PathVariable String refReduction) {
        return reductionService.findByRefReduction(refReduction);
    }

    public ReductionService getReductionService() {
        return reductionService;
    }

    public void setReductionService(ReductionService reductionService) {
        this.reductionService = reductionService;
    }

}
