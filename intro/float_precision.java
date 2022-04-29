package intro;

public class float_precision {
    public static void main(String[] args) {
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;

        System.out.println("Max = " + floatMax);
        System.out.println("Min = " + floatMin);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println("Max = " + doubleMax);
        System.out.println("Min = " + doubleMin);

        int intNum = 5 / 2;
        float floatNum = 5f / 2f;
        double doubleNum = 5d / 2d;

        System.out.println(intNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);

        //Challenge
        int pound = 220;
        double kg = (double)pound * 0.45359237;
        System.out.println(kg);
    }
}
