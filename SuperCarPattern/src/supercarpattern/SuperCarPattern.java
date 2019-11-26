/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercarpattern;

import supercarpattern.model.Location;
import supercarpattern.model.Vehicle;

/**
 *
 * @author Test
 */
public class SuperCarPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle = new Vehicle(0, 0);
        vehicle.move(12);
        vehicle.move(3);
        vehicle.turnRight();
        vehicle.move(5);
        vehicle.turnRight();
        vehicle.move(5);
        vehicle.turnLeft();
        vehicle.myLocation();
    }
    
}
