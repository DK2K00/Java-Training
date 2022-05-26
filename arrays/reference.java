package arrays;

public class reference {
    public static void main(String[] args) {
        int num1 = 10;
        //Reference not made
        int num2 = num1;

        System.out.println("Num1 = " + num1); //10
        System.out.println("Num2 = " + num2); //10

        num2++;

        System.out.println("Changed Num1 = " + num1); //10
        System.out.println("Changed Num2 = " + num2); //11

        //Reference is being made
        int[] arr1 = new int[5];
        int[] arr2 = arr1;

        System.out.println("Arr1 = "); printArr(arr1); //[0,0,0,0,0]
        System.out.println("Arr2 = "); printArr(arr2); //[0,0,0,0,0]

        //Will change for both arrays
        arr2[0] = 1;

        System.out.println("Changed Arr1 ="); printArr(arr1); //[1,0,0,0,0]
        System.out.println("Changed Arr2 ="); printArr(arr2); //[1,0,0,0,0]

        //Will change for both arrays
        modArr(arr1);

        System.out.println("Modified Arr1 ="); printArr(arr1); //[1,0,10,0,0]
        System.out.println("Modified Arr2 ="); printArr(arr2); //[1,0,10,0,0]

        //Arr1 won't change since arr2 is being dereferenced and referenced to a new array
        arr2 = new int[] {5,6,7,8,9};

        System.out.println("Arr1 ="); printArr(arr1); //[1,0,10,0,0]
        System.out.println("New Arr2 ="); printArr(arr2); //[5,6,7,8,9]
    }

    public static void modArr(int[] arr){
        arr[2] = 10;
        //Will not change since array is being derefernced and pointed to somewhere else - a new array
        arr = new int[] {41,24,67,86,54};
    }

    //To print array properly
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
