/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author Oralia Rodriguez D
 */
public class MovableCircle implements iMovable  {
    private int radius;
    private MoveablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center= new MoveablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public String toString(){
        return this.center.toString();
    }
    
    @Override
    public void moveUp() {
        this.center.y+= this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y-= this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x+=this.center.xSpeed;
    }

    @Override
    public void moveRight() {
       this.center.x-=this.center.ySpeed;
    }
}
