/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Test
 */
//@Entity
public class Form {
    
    //@Id
    private int id;
    
    private String formName;
    
    private List<QuestionComponent> questionList = new ArrayList<>();
    
    public void addQuestionComponent(QuestionComponent question) {
        int currentQuestionSequence= this.questionList.size();
        question.setComponentSequenceOrder(currentQuestionSequence);
        this.questionList.add(question);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public List<QuestionComponent> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<QuestionComponent> questionList) {
        this.questionList = questionList;
    }
    
    
    
}
