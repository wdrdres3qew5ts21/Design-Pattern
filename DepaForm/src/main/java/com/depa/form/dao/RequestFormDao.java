/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.dao;

import com.depa.form.model.QuestionComponent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Test
 */
public class RequestFormDao {
    
    private int id;
    
    private String formName;
    
    private List<QuestionComponentDao> questionList = new ArrayList<>();

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

    public List<QuestionComponentDao> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<QuestionComponentDao> questionList) {
        this.questionList = questionList;
    }
    
    
    
    
}
