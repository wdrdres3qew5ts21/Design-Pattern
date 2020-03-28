/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.model;

/**
 *
 * @author Test
 */
public class QuestionComponent {

    private int componentSequenceOrder;

    private String questionLabel;
    
    private Field answerField;
    
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

    public Field getAnswerField() {
        return answerField;
    }

    public void setAnswerField(Field answerField) {
        this.answerField = answerField;
    }
    
}
