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
public class Studio implements iPlayer{

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void reverse() {
        System.out.println("Reverse");
    }
    
}
