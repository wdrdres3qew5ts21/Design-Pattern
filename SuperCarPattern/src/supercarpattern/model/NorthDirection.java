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
public class NorthDirection implements Direction {

    private static NorthDirection NORTH_DIRECTION = new NorthDirection();

    private NorthDirection() {

    }

    public static NorthDirection getInstance() {
        return NORTH_DIRECTION;
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
        vehicle.setDirection(vehicle.southDirection);
    }

    @Override
    public void move(Vehicle vehicle, int distance) {
        int moveY = vehicle.getLocation().getY();
        moveY += distance;
        vehicle.getLocation().setY(moveY);
    }

}
