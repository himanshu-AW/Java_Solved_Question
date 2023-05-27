package JAVA.Array;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2};
        // int[] nums={3,5,1,6,3,5,6};
        // int i=0,j=0;
        // int n=nums.length;
        // for( i=0;i<n-1;i++){
        //     for( j=0;j<n-1;j++){
        //         if(i==j)
        //             continue;
        //         if(nums[i]==nums[j])
        //             break; 
        //     }
        //     if(nums[i]!=nums[j])
        //     System.out.println(nums[i]);
        // }
        int n=nums.length;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        for(int i : nums){
            if(map.get(i)==1){
                System.out.println(i);
            }
        }
        
            
        }   
        // System.out.println(map.containsKey(2));
        // System.out.println(map.get());
        // System.out.println(map);
    }
