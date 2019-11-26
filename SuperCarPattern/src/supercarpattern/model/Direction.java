/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercarpattern.model;

/**
 *
 * @author Test
 */
public interface Direction {

    public void turnLeft(Vehicle vehicle);

    public void turnRight(Vehicle vehicle);

    public void uTurn(Vehicle vehicle);

    public void move(Vehicle vehicle, int distance);

}
