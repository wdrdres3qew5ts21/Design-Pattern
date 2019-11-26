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
public class SouthDirection implements Direction {
    
    private static SouthDirection SOUTCH_DIRECTION = new SouthDirection();
    
    private SouthDirection(){
        
    }
    
    public static SouthDirection getInstance(){
        return SOUTCH_DIRECTION;
    }

    @Override
    public void turnLeft(Vehicle vehicle) {
       vehicle.setDirection(vehicle.westDirection);
    }

    @Override
    public void turnRight(Vehicle vehicle) {
       vehicle.setDirection(vehicle.eastDirection);
    }

    @Override
    public void uTurn(Vehicle vehicle) {
       vehicle.setDirection(vehicle.northDirection);
    }

    @Override
    public void move(Vehicle vehicle, int distance) {
        int deductY = vehicle.getLocation().getY();
        System.out.println(deductY);
        deductY -= distance;
        vehicle.getLocation().setY(deductY);
    }

}
