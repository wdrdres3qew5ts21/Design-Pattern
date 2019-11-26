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
public class Vehicle {
    
    private Direction direction = NorthDirection.getInstance();
    
     NorthDirection northDirection = NorthDirection.getInstance();
    
     SouthDirection southDirection = SouthDirection.getInstance();
    
      EastDirection eastDirection = EastDirection.getInstance();
    
     WestDirection westDirection = WestDirection.getInstance();
    
     Location location = new Location();
    
    public Vehicle(int x, int y){
        
    }
    
    public void setDirection(Direction direction){
        this.direction = direction;
    }
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public void move(int distance){
        direction.move(this , distance);
    }
    
    public void turnRight(){
        direction.turnRight(this);
    }
    
     public void turnLeft(){
        direction.turnLeft(this);
    }
    
    public void getCurrentDirection(){
        
    }
    
    public void getDirection(){
        
    }
    
    public void myLocation(){
        System.out.println(location );
    }
    

    
    
}
