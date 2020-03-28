/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.persistence.Entity;

/**
 *
 * @author Test
 */
//@Entity
//@JsonTypeName("TextField")
public class TextField extends Field {

    public TextField() {
        fieldType = FieldType.TextField;
    }


}
