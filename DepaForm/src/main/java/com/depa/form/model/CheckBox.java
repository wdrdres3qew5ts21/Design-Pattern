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
public class CheckBox extends Field {
    
    // default all of them
    private int maximumAnswerChoiceNumber;
    
    private List<ChoiceOption> choiceList = new ArrayList<>();
    
    public CheckBox(){
        this.fieldType = FieldType.CheckBox;
    }

    public int getMaximumAnswerChoiceNumber() {
        return maximumAnswerChoiceNumber;
    }

    public void setMaximumAnswerChoiceNumber(int maximumAnswerChoiceNumber) throws Exception {
        if(maximumAnswerChoiceNumber < 1){
            throw new Exception("Total limit Checkbox must not zero/ negative number (How you can select when it have only zero ?!)");
        }
        this.maximumAnswerChoiceNumber = maximumAnswerChoiceNumber;
    }
    
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
        
        // Resize of maximum answer choice to total current choice number
        int updatedMaximumAnswerChoiceNumber = this.choiceList.size();
        this.maximumAnswerChoiceNumber= updatedMaximumAnswerChoiceNumber;
    }


}
