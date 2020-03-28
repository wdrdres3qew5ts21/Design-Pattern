/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.dao;

import com.depa.form.model.ChoiceOption;
import com.depa.form.model.Field;
import com.depa.form.model.FieldType;
import com.depa.form.model.RadioButtonField;
import com.depa.form.model.TextField;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Test
 */
public class FieldDao {

    protected int id;

    protected FieldType fieldType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private List<ChoiceOption> choiceList = new ArrayList<>();

    public List<ChoiceOption> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<ChoiceOption> choiceList) {
        this.choiceList = choiceList;
    }

    public void addChoice(ChoiceOption choiceOption) {
        int currentChoiceSequence = this.choiceList.size();
        choiceOption.setChoiceSequenceOrder(currentChoiceSequence);
        this.choiceList.add(choiceOption);
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    @Override
    public String toString() {
        return "Field{" + "id=" + id + ", fieldLabel=" + ", fieldOrder=" + '}';
    }

}
