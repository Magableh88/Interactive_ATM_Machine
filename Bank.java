import java.util.ArrayList;
/**
 * Bank class that keeps a list of all accounts made
 *
 * @author (Mohammad Makableh - 202130654)
 */
public class Bank
{
    // instance variables 
    public String bankName;
    public ArrayList<Account> accounts;
    
    //Constructor method for bank
    public Bank()
    {
        accounts = new ArrayList<Account>();
    }
    //overloaded constructor
    public Bank(String name)
    {
        accounts = new ArrayList<Account>();
        bankName = name;
    }
    //adds an account to the list of accounts
    public void add(Account a){
        accounts.add(a);
    }
    //displays the bank and account information
    public void display(){
        System.out.println("Bank: " + bankName);
        for (Account acc : accounts){
            acc.display();
        }
    }
    //displays information of a certain customer name
    public void display(String name){
        System.out.println("Bank: " + bankName);
        for (Account acc : accounts){
            if(acc.getUserName().equals(name)){
                acc.display();
            }
        }
    }
}
