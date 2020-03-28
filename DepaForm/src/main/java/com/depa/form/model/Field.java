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

    protected FieldType fieldType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public Field setFieldType(FieldType fieldType) {

        if (fieldType == FieldType.CheckBox) {
        } else if (fieldType == fieldType.Dropdown) {

        } else if (fieldType == fieldType.Input) {

        } else if (fieldType == fieldType.RadioButton) {
            return new RadioButtonField();
        } else if (fieldType == fieldType.TextArea) {

        } else if (fieldType == fieldType.TextField) {
            return new TextField();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Field{" + "id=" + id + ", fieldLabel=" + ", fieldOrder=" + '}';
    }

}
