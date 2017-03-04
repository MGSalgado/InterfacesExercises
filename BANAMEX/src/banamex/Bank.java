/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banamex;
import java.util.*;
/**
 *
 * @author Oralia Rodriguez D
 */
public class Bank {
    private ArrayList<Branch> division;

    public Bank(ArrayList<Branch> division) {
                this.division = division;
    }
    
    public Bank(){
        this.division = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() {
        return division;
    }

    public void setBranch(ArrayList<Branch> division) {
        this.division = division;
    }
    
    public boolean addBranch(ArrayList<Customer> customer,String name){
      if(findBranch(name)==-1){
        Branch tempName = new Branch(customer,name);
        division.add(tempName);
        return true;
    }else{
          System.out.println("That branch already exists");
          return false;
      }
    }
    
    public boolean addBranch(String name){
        if(findBranch(name)==-1){
        Branch tempName = new Branch(name);
        division.add(tempName);
        return true;
    }else{
          System.out.println("That branch already exists");
          return false;
      }
    }
    
    public boolean addCustToBranch(String branchName, Customer customer){
        for(int i=0; i<division.size();i++){
            if(division.get(i).getBranchName().equals(branchName)){
                division.get(i).addCustomer(customer);
                                return true;
            }
        }return false;
    }
    
    public boolean addCustToBranch(String branchName, String customerName, double amount){
        for(int i=0; i<division.size();i++){
            if(division.get(i).getBranchName().equals(branchName)){
                division.get(i).addCustomer(customerName,amount);
                                return true;
            }
        }return false;
                }
    
    
    
    public boolean addTransToCustOfBranch (String branchName, String customerName, double amount){
        if(findBranch(branchName)!=-1){
            if(division.get(findBranch(branchName)).findCustomer(customerName)!=-1){
                division.get(findBranch(branchName)).addTransaction(customerName, amount);
            return true;
            }
            System.out.println("Client does not exist");
            return false;
        }   
        System.out.println("Branch does not exist");
        return false;
        }
    
    
    public int findBranch(String name){
            for(int i=0; i<division.size();i++){
            if(division.get(i).getBranchName().equals(name)){
                return i;
            }
        }return -1;
    
    }
    
}
