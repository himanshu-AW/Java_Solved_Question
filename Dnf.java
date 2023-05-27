package JAVA.Array;

public class Dnf {
    public static void main(String[] args) {
        int[] arr={0,1,2,1,0,1,2,0,1,2,1,0,2};
        int count0=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            count0++;
            else if(arr[i]==1)
                count1++;
        }
        for(int i=0;i<arr.length;i++){
            if(count0>0){
                arr[i]=0;
                count0--;
            }else if(count1>0){
                arr[i]=1;
                count1--;
            }
            else{
                arr[i]=2;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
