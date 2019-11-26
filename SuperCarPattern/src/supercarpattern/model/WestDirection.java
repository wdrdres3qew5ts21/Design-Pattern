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
public class WestDirection implements Direction {

    private static WestDirection WEST_DIRECTION = new WestDirection();

    private WestDirection() {

    }

    static WestDirection getInstance() {
        return WEST_DIRECTION;
    }

    @Override
    public void turnLeft(Vehicle vehicle) {
        vehicle.setDirection(vehicle.southDirection);
    }

    @Override
    public void turnRight(Vehicle vehicle) {
        vehicle.setDirection(vehicle.northDirection);
    }

    @Override
    public void uTurn(Vehicle vehicle) {
        vehicle.setDirection(vehicle.eastDirection);
    }

    @Override
    public void move(Vehicle vehicle, int distance) {
        int deductX = vehicle.getLocation().getX();
        deductX -= distance;
        vehicle.getLocation().setX(deductX);
    }

}
