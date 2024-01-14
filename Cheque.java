/**
 * Cheque account allows for withdrawal and depositing
 * @author (Mohammad Makableh - 202130654)
 */
public class Cheque extends Account
{
    // instance variables 
    private static final int minimBalance = 1000;
    private static final int overLimitCharge = 5;
    //constructor method
    public Cheque(){
        super();
        accType = "Cheque";
    }
    //overloaded constructor
    public Cheque(String name){
        super(name);
        accType = "Cheque";
    }
    //withdraw method - overloads  
    public void withdraw(float m){
        if(m > balance){
            System.out.println("Insufficient Funds");
        }
        else if(balance-m < 1000){
            m += overLimitCharge;
            balance -= m;
        }
        else{
            balance -= m;
        }
    }
}
