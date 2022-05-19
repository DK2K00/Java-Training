package oops.composition;

import org.w3c.dom.NameList;

public class BedRoom {
    private String name;
    private Lamp lamp;
    private Bed bed;

    public BedRoom(String name, Lamp lamp, Bed bed){
        this.name = name;
        this.lamp = lamp;
        this.bed = bed;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public Bed getBed(){
        return this.bed;
    }
}
