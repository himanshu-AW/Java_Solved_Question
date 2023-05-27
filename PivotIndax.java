package JAVA.Array;

public class PivotIndax {
    public static void main(String[] args) {
        // int[] arr={3,7,5,6,4};
        // int[] arr={1,2,3,4,6,10};
        // int[] arr={1,7,3,6,5,6};
        // int[] arr={1,2,3};
        int[] arr={2,1,2,2,4};
        int i=0;
        int j=arr.length-1;
        int s1=arr[i++],s2=arr[j--];
        while(i<j){
             if(s1<s2){
                s1+=arr[i++];
            }
            else if(s1>s2){
                s2+=arr[j--];
            }
        }
        if(s1==s2)
        System.out.println("the index of pivot is "+(i));
        else
        System.out.println(-1);
    }
}
