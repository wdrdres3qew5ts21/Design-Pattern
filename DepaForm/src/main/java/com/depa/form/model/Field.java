/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;
import org.springframework.lang.Nullable;

/**
 *
 * @author Test
 */
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@JsonSubTypes({
//    @JsonSubTypes.Type(value = TextField.class,name = "TextField"),
//    @JsonSubTypes.Type(value = RadioButton.class),
//    @JsonSubTypes.Type(value = CheckBox.class)
//})
public class Field {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", updatable = false, nullable = false)
    protected int id;

    private String fieldLabel;

//    private int fieldOrder;
    private FieldType fieldType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

//    public int getFieldOrder() {
//        return fieldOrder;
//    }
//
//    public void setFieldOrder(int fieldOrder) {
//        this.fieldOrder = fieldOrder;
//    }
    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        
        if (fieldType == FieldType.CheckBox) {
        }
        else if(fieldType == fieldType.Dropdown){
            
        }
        else if(fieldType == fieldType.Input){
            
        }
        else if(fieldType == fieldType.RadioButton){
            this.getClass().asSubclass(RadioButtonField.class);
        }
        else if(fieldType == fieldType.TextArea){
            
        }
        else if(fieldType == fieldType.TextField){
            this.getClass().asSubclass(RadioButtonField.class);
        }
        
    }

    @Override
    public String toString() {
        return "Field{" + "id=" + id + ", fieldLabel=" + fieldLabel + ", fieldOrder=" + '}';
    }

}
