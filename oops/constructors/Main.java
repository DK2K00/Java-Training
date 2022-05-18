package oops.constructors;

public class Main {
    public static void main(String[] args) {
        Account person1 = new Account(1, "Zoe", 100000);
        System.out.println(person1.name());
        System.out.println(person1.accNumber());
        System.out.println(person1.balance());

    }
    
}
