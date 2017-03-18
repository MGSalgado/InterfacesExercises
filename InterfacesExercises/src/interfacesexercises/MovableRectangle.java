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
public class MovableRectangle implements iMovable {
    private MoveablePoint topLeft;
    private MoveablePoint bottomRight;
    
    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed, int ySpeed){
        this.topLeft=new MoveablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight=new MoveablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString(){
        return this.bottomRight.toString()+" y "+this.topLeft.toString();
    }
    
    @Override
    public void moveUp() {
        this.bottomRight.y+=this.bottomRight.ySpeed;
        this.topLeft.y+=this.topLeft.ySpeed;
       
    }

    @Override
    public void moveDown() {
        this.bottomRight.y-=this.bottomRight.ySpeed;
        this.topLeft.y-=this.topLeft.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.bottomRight.x+=this.bottomRight.xSpeed;
        this.topLeft.x+=this.topLeft.xSpeed;
    }

    @Override
    public void moveRight() {
        this.bottomRight.x-=this.bottomRight.xSpeed;
        this.topLeft.x-=this.topLeft.xSpeed;
    }
}
