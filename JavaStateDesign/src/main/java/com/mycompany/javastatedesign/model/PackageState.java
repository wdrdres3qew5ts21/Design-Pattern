/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javastatedesign.model;

/**
 *
 * @author Test
 */
public class PackageState {
    
    private State state = new In();
    
    private static int value = 0;
    
    public void increaseValue(){
        this.value++;
    };
    
    public void previousState() {
        state.getOut(this);
    }
 
    public void nextState() {
        state.getIn(this);
    }
 
    public void printStatus() {
        state.printState();
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    public  void  getValue() {
        System.out.println(value);
    }

    public static void setValue(int value) {
        PackageState.value = value;
    }
    
    public void exit(){
        state.exit(this);
    }
    
    
}
