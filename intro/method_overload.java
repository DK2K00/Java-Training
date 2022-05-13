package intro;
public class method_overload {
    public static void main(String[] args) {
        FandItoCm(5, 11);
        FandItoCm(71);
    }

    public static double FandItoCm(int foot, int inch){
        if(foot < 0 || (inch < 0 && inch > 12))
            return -1;

        else{
            foot = foot * 12;
            inch += foot;
            double cm = inch * 2.54;
            System.out.println(cm);
            return cm;
        }
    }
    public static double FandItoCm(int inches){
        if(inches < 0)
            return -1;
        else{
            int foot = inches / 12;
            inches = inches % 12;
            System.out.println("Foot = " + foot + " and inches = " + inches);
            return FandItoCm(foot, inches);
        }
    }
}
