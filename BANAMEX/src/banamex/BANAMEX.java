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
public class BANAMEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        double m =123;
        lista.add(m);
        
        System.out.println(lista);
        Customer cliente = new Customer("marco");
        System.out.println(cliente.getTransactions());
        
        
        cliente.setTransactions(lista);
        cliente.setTransactions(2230);
        System.out.println(cliente.getTransactions());
        cliente.setTransactions(1232);
        System.out.println(cliente.getTransactions());
        
        Branch loans = new Branch("Loans");
        loans.addCustomer(cliente);
        System.out.println(loans.getCustomers());
        
        loans.addTransaction(cliente, 2132);
        System.out.println(loans.getCustomers());
        
        Bank Banamex = new Bank();
        Banamex.addBranch("Debts");
        System.out.println(Banamex.getBranches()+"12");
        
        Banamex.getBranches().get(0).addCustomer(cliente);
        Banamex.getBranches().get(0).addTransaction(cliente, 333);
        
        System.out.println(Banamex.getBranches().get(0).getCustomers()+"13");
        
       Banamex.addBranch("Loans");
       int x= Banamex.findBranch("Loans");
       
       Banamex.addCustToBranch("Loans", cliente);
       Banamex.getBranches().get(0).addTransaction(cliente, 123214);
       
       
       
        System.out.println(Banamex.getBranches().get(0).getBranchName());
        System.out.println(Banamex.getBranches().get(1).getBranchName());
        
        Banamex.getBranches().get(0).addCustomer("manuel", 0);
        Banamex.getBranches().get(0).addTransaction("manuel", 555);
        System.out.println(Banamex.getBranches().get(0).getCustomers());
        
        System.out.println(Banamex.getBranches().get(1).getCustomers());
        
        Banamex.getBranches().get(1).addCustomer("juan", 21313);
        System.out.println(Banamex.getBranches().get(1).getCustomers());
        
        
        
        //Banamex.addCustToBranch();
        //Banamex.addCustToBranch("Mexico",cliente);
        
        
        //Banamex.getBranches().get(x).addTransaction(cliente,3333);
        
                //LLamar Branch
        //Banamex.getBranches().get(0).addTransaction("marco", 212);
        //System.out.println(Banamex.getBranches().get(x).getCustomers());
    }
    
}
