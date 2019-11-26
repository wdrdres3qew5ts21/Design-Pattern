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
public class Out implements State{

    @Override
    public void exit(PackageState state) {
        state.setState(new Out());
    }
    
    @Override
    public void printState() {
        System.out.println("Out !!!");
    }

    @Override
    public void getIn(PackageState state) {
        state.setState(new In());
    }

    @Override
    public void getOut(PackageState state) {
    }
    
}
