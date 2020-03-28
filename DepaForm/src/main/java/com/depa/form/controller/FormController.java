/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.controller;

import com.depa.form.dao.RequestFormDao;
import com.depa.form.model.Form;
import com.depa.form.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Test
 */
@RestController
public class FormController {
    
    @Autowired
    private FormService formService;
    
    @PostMapping("/form")
    public RequestFormDao createForm(@RequestBody  RequestFormDao requestForm){
        return formService.createForm(requestForm);
    }

    @GetMapping("/form/mock")
    public Form createFormMock() throws Exception{
        return formService.createFormMock();
    }
    
    @GetMapping("/form")
    public Form getForm(){
        return formService.getForm();
    }
   
}
