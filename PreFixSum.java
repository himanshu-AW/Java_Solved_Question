package JAVA.Array;
public class PreFixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int[] arr2=new int[n];
        int prevsum=0;
        for(int i=0;i<n;i++){
            prevsum+=arr[i];
            arr2[i]=prevsum;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }
}
