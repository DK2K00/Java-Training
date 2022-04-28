package intro;
public class primitive {
    public static void main(String[] args){
        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;

        System.out.println("Min val = " + minVal);
        System.out.println("Max val = " + maxVal);

        System.out.println("Wrong Min val = " + (minVal - 1));
        System.out.println("Wrong Max val = " + (maxVal + 1));
    }
}
