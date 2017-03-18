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
public class IndustrialPlumber extends Human implements iPlumber{

    public IndustrialPlumber(String name) {
        super(name);
    }

    @Override
    public String unplugDrain() {
        return "Succesfully unplugged drain";
    }
    
    
}
