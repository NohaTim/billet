/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.billet.rest.convertor;

import java.util.List;

/**
 *
 * @author hp pc
 */
public interface AbstractConvertor <T,VO>{
    public T toItem(VO vo);
    public VO toVo(T item);
    public List<VO> toVo(List<T> items);
    public List<T> toItem(List<VO> vos);
    
}
