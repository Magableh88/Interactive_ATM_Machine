/**
 * Account class acts as parent class to cheque and saving
 *
 * @author (Mohammad Makableh - 202130654)
 */
import java.util.Random;
abstract class Account
{
    // instance variables
    public int accountNum;
    public String name;
    protected int balance;
    public String accType;
    //default constructor
    public Account()
    {
        balance = 0;
        accountNum = new Random().nextInt(999999);
        name = "";
    }
    //Overloaded constructor
    public Account(String name)
    {
        balance = 0;
        this.name = name;
        accountNum = new Random().nextInt(999999);
    }
    //Displays the account information
    public void display(){
        System.out.println("Customer: " + name + "\nAccount Number: " 
        + accountNum + "\nBalance: " + balance);
    }
    //Deposits money and adjusts balance
    public void deposit(float m){
        balance += m;
    }
    //abstract method for withdrawing
    public abstract void withdraw(float m);
    //returns balance
    public float getBalance(){
        return balance;
    }
    //returns name
    public String getUserName(){
        return name;
    }
}
