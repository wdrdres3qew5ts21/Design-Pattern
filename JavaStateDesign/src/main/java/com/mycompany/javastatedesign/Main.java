/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javastatedesign;

import com.mycompany.javastatedesign.model.PackageState;

/**
 *
 * @author Test
 */
public class Main {

    public static void main(String[] args) {
        PackageState packageState = new PackageState();
        packageState.printStatus();
        packageState.nextState();
        packageState.printStatus();
        
        packageState.increaseValue();
        packageState.increaseValue();
        packageState.getValue();

        packageState.nextState();
        packageState.previousState();
        
        System.out.println("------- Start to Exit ----------");
        packageState.exit();
        packageState.printStatus();
        System.out.println("----- After  .exit() -----");
        
        packageState.nextState();
        packageState.printStatus();
        packageState.nextState();
        packageState.printStatus();
        packageState.previousState();
        packageState.printStatus();
        packageState.previousState();
        packageState.printStatus();
        
        System.out.println("---- Last Value ----");
         packageState.increaseValue();
        packageState.getValue();

    }

}
