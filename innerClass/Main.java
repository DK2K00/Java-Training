package innerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox audi = new Gearbox(6);
        audi.operateClutch(false);
        audi.changeGear(4);
    }
}
