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
public class Circle implements iGeometricObject {
    protected double radius=1.0;
    
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    
    
}
