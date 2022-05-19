package oops.encapsulation;

public class Printer {
    private int pagesAvailable;
    private boolean inkAvailable = true;

    public Printer(int pagesAvailable, boolean inkAvailable){
        this.pagesAvailable = pagesAvailable;
        this.inkAvailable = inkAvailable;
    }

    public int getPages(){
        System.out.println("Pages are available");
        return this.pagesAvailable;
    }
}
