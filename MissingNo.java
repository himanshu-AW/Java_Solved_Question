package JAVA.Array;

public class MissingNo {
    public static void main(String[] args) {
        // int[] arr={0,1,2,4,5};
        // int[] arr={1,2,4,0,5};
        int[] arr = { 3, 2, 4, 6, 7 };
        int sum = 0, s = 0;
        // int n=arr.length;
        // sum=(n*(n+1))/2;
        // find min and max
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i])
                max = arr[i];
            else
                min = arr[i];
        }
        System.out.println(min + " " + max);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // sum of array
        for (int i = min; i <= max; i++) {
            s += i;
        }
        System.out.println("The missing number is " + (s - sum));

    }
}
