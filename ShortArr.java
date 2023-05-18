package JAVA.Array;

public class ShortArr {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,1,1,0,0};
        int count0=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            count0++;
        }
        for(int i=0;i<arr.length;i++){
            if(count0>0){
                arr[i]=0;
                count0--;
            }
            else{
                arr[i]=1;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
