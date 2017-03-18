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

public class HandyPerson extends Human implements iPlumber, iElectrician {

    public HandyPerson(String name) {
        super(name);
    }
    
    
    @Override
    public String unplugDrain() {
        return "Succesfully unplugged drain";
    }

    @Override
    public String changeBulb() {
        return "Succesfully changed bulb";
    }


}
