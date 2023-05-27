package JAVA.Array;

public class ReverseOfArr {
        public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};
        int i=0,j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
