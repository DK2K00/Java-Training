package generics.madrid;

import java.util.ArrayList;

public class Position<P extends Player> {
    private String name;

    ArrayList<P> position = new ArrayList<>();

    public Position(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean addPlayer(P player){
        if(position.contains(player)){
            System.out.println(player.getName() + " is already part of the team");
            return false;
        }else{
            position.add(player);
            System.out.println(player.getName() + " is now part of the team");
            return true;
        }
    }
    
}
