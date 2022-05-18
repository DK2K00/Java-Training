package oops.constructors;

public class Account {
    private int accNumber;
    private String name;
    private double balance;

    public Account(){
        //Use this keyword to initialize.
        //Should be used only after implementing below constructor
        this(001, "Random", 500000.00);
    }

    public Account(int accNumber, String name, double balance){
        //Do not use methods inside constructors
        //Not recommended to use setter methods as it might cause some bugs
        //Best to assign directly
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public String name(){
        return name;
    }

    public int accNumber(){
        return accNumber;
    }

    public double balance(){
        return balance;
    }
    
}

