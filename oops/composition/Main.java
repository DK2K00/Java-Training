package oops.composition;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("wood", "king");
        Lamp lamp = new Lamp("yellow", "240");

        BedRoom bedroom = new BedRoom("Living", lamp, bed);
        bedroom.getBed().makeBed();
        bedroom.getLamp().turnOn();
    }
}
