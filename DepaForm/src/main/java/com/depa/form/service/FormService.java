/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depa.form.service;

import com.depa.form.model.CheckBox;
import com.depa.form.model.ChoiceOption;
import com.depa.form.model.Field;
import com.depa.form.model.Form;
import com.depa.form.model.QuestionComponent;
import com.depa.form.model.RadioButtonField;
import com.depa.form.model.TextField;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Test
 */
@Service
public class FormService {
    
//    @Autowired
//    private FormRepository formRepository;

    public Form createForm(Form requestForm) {
        System.out.println(requestForm);
       // System.out.println(((TextField)(requestForm.getFieldList().get(0))));
        return null;
       // return formRepository.save(requestForm);
    }

    public Form getForm() {
        Form form = new Form();
        ArrayList<Field> fieldList = new ArrayList<>();
    
        return null;
    }

    public Form createFormMock() {
        Form form = new Form();
        // Initial Form and Set Form Name
        form.setFormName("Feedback from AWS Re:Invent Conference");
        // Implemented: RadioButton, TextField, Checkbox
        // Add First question
        QuestionComponent question1= new QuestionComponent();
        question1.setQuestionLabel("How many day you have participate ?");
        RadioButtonField radioAnswerField1 = new RadioButtonField();
        ChoiceOption oneDayChoice = new ChoiceOption();
        oneDayChoice.setChoiceLabel("1 Day");
        radioAnswerField1.addChoice(oneDayChoice);
        
        ChoiceOption twoDayChoice = new ChoiceOption();
        twoDayChoice.setChoiceLabel("2 Day");
        radioAnswerField1.addChoice(twoDayChoice);
        
        ChoiceOption threeDayChoice = new ChoiceOption();
        threeDayChoice.setChoiceLabel("3 Day");
        radioAnswerField1.addChoice(threeDayChoice);
        
        question1.setAnswerField(radioAnswerField1);
        form.addQuestionComponent(question1);
        
        // Add Second question
        QuestionComponent question2= new QuestionComponent();
        question2.setQuestionLabel("Do you Like our food?");
        RadioButtonField radioAnswerField2 = new RadioButtonField();
        question2.setAnswerField(radioAnswerField2);
        ChoiceOption yesOption = new ChoiceOption();
        yesOption.setChoiceLabel("Yes, I like it :D");
        radioAnswerField2.addChoice(yesOption);
        
        ChoiceOption noOption = new ChoiceOption();
        noOption.setChoiceLabel("No, I don't it T^T");
        radioAnswerField2.addChoice(noOption);
        form.addQuestionComponent(question2);
        
        // Add Thrid question
        QuestionComponent question3 = new QuestionComponent();
        question3.setQuestionLabel("Please briefly explain your impression about this conference.");
        TextField impressionAnswerTextField = new TextField();
        question3.setAnswerField(impressionAnswerTextField);
        form.addQuestionComponent(question3);
        
        QuestionComponent question4 = new QuestionComponent();
        question4.setQuestionLabel("What are topics you had joined ?");
        CheckBox topicCheckboxAnswer = new CheckBox();
        ChoiceOption cloudTopic = new ChoiceOption();
        cloudTopic.setChoiceLabel("Cloud Native with Cloud Foundry for Enterprise.");
        
        return form;
    }
    
    
    
}
