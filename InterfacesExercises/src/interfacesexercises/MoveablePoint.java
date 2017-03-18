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
public class MoveablePoint implements iMovable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString (){
        return "El punto se localiza en x="+this.x+", y= "+this.y+" con una velocidad en x de "+this.xSpeed+" y una velocidad en y de "+this.ySpeed;
    }

    @Override
    public void moveUp() {
        this.y+= this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y-=this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x+=this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.y-=this.ySpeed;
    }
    
    
}
