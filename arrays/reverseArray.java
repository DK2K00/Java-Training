package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5};
        System.out.println("Array = ");
        printArr(arr1);

        System.out.println("Reversed array = ");
        reverseArr(arr1);
        printArr(arr1);
    }
     //To print array properly
     public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void reverseArr(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int temp = 0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
