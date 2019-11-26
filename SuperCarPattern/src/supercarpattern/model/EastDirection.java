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
public class EastDirection implements Direction{
    
    private static final EastDirection EAST_DIRECTION = new EastDirection();
    
    private EastDirection(){
        
    }
    
    public static EastDirection getInstance(){
        return EAST_DIRECTION;
    }

    @Override
    public void turnLeft(Vehicle vehicle) {
      vehicle.setDirection(vehicle.northDirection);
    }

    @Override
    public void turnRight(Vehicle vehicle) {
       vehicle.setDirection(vehicle.southDirection);
    }


    @Override
    public void uTurn(Vehicle vehicle) {
        vehicle.setDirection(vehicle.westDirection);
    }

    @Override
    public void move(Vehicle vehicle, int distance) {
        int moveX = vehicle.getLocation().getX();
        moveX += distance;
        vehicle.getLocation().setX(moveX);
    }

 
    
}
