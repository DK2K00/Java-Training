package generics.madrid;

public class Main{
    public static void main(String[] args) {
        Attack benzema = new Attack("Benzema");
        Attack vini = new Attack("Vini");
        Attack rodrygo = new Attack("Rodrygo");

        Mid modric = new Mid("Modric");
        Mid casemiro = new Mid("Casemiro");
        Mid kroos = new Mid("Kroos");

        Defense militao = new Defense("Militao");
        Defense alaba = new Defense("Alaba");
        Defense mendy = new Defense("Mendy");
        Defense cavajal = new Defense("Cavajal");

        Position<Attack> forward = new Position<>("Forward");
        forward.addPlayer(benzema);
        forward.addPlayer(vini);
        forward.addPlayer(rodrygo);
        forward.addPlayer(benzema);

        Position<Mid> midfielder = new Position<>("Midfielder");
        midfielder.addPlayer(modric);
        //midfielder.addPlayer(vini); - will show error since it's of different type
        midfielder.addPlayer(casemiro);
        midfielder.addPlayer(kroos);

        Position<Defense> defense = new Position<>("Defense");
        defense.addPlayer(militao);
        defense.addPlayer(alaba);
        defense.addPlayer(mendy);
        defense.addPlayer(cavajal);


    }
}