/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Test
 */
public class RadioButtonField extends Field {
    
    private final FieldType fieldType = FieldType.RadioButton;
    
    private List<ChoiceOption> choiceList = new ArrayList<>();

    public FieldType getFieldType() {
        return fieldType;
    }

    public List<ChoiceOption> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<ChoiceOption> choiceList) {
        this.choiceList = choiceList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addChoice(ChoiceOption choiceOption) {
        int currentChoiceSequence = this.choiceList.size();
        choiceOption.setChoiceSequenceOrder(currentChoiceSequence);
        this.choiceList.add(choiceOption);
    }
    
    

}
