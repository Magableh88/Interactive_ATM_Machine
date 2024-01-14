
/**
 * Saving account allows for withdrawal
 * @author (Mohammad Makableh - 202130654)
 */
public class Saving extends Account
{
    // instance variables 
    private static final double eachTimeCharge = 3.9;
    //constructor method
    public Saving()
    {
        super();
        accType = "Savings";
    }
    //overloaded constructor
    public Saving(String name)
    {
        super(name);
        accType = "Savings";
    }
    //withdraw method - overloaded
    public void withdraw(float m){
        if((eachTimeCharge+m) > balance){
            System.out.println("Insufficient Funds");
        }
        else{
            m += eachTimeCharge;
            balance -= m;
        }
    }
}
