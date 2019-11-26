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
public interface State {
    
    public void getIn(PackageState state);
    
    public void getOut(PackageState state);
    
    public void exit(PackageState state);
    
    public void printState();
    
    
}
