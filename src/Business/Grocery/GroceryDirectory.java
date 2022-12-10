/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Grocery;

import Business.GroceryManager.GroceryManager;
import java.util.ArrayList;
/**
 *
 * @author RAJAS
 */
public class GroceryDirectory {
       private ArrayList<Grocery> restaurantList;
    
    public GroceryDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Grocery> getGroceryList() {
        return restaurantList;
    }
    
    public Boolean deleteGrocery(String name) {
        for(int i = 0; i < restaurantList.size(); i ++) {
            if(restaurantList.get(i).getName().equals(name)) {
                restaurantList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    public Grocery createGrocery(String name, GroceryManager rm, String phone, String location, String Network){
        Grocery rest = new Grocery();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setNetwork(Network);
        rest.setUserAccount(rm.getAccountDetails());
        restaurantList.add(rest);
        return rest;
    }
    
 
}