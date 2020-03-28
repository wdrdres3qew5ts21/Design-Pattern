/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.dao;

import com.depa.form.model.Field;

/**
 *
 * @author Test
 */
public class QuestionComponentDao {
    
     private int componentSequenceOrder;

    private String questionLabel;
    
    private FieldDao answerField;
    
    public int getComponentSequenceOrder() {
        return componentSequenceOrder;
    }

    public void setComponentSequenceOrder(int componentSequenceOrder) {
        this.componentSequenceOrder = componentSequenceOrder;
    }

    public String getQuestionLabel() {
        return questionLabel;
    }

    public void setQuestionLabel(String questionLabel) {
        this.questionLabel = questionLabel;
    }

    public FieldDao getAnswerField() {
        return answerField;
    }

    public void setAnswerField(FieldDao answerField) {
        this.answerField = answerField;
    }
    
}
