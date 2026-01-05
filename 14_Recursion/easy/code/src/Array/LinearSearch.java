package Array;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {2,3,1,4,4,5};
        int target = 4;
        System.out.println(search(arr,target));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexLast(arr, target, arr.length-1));
        System.out.println(findAllIndex(arr,target,0,new ArrayList<>()));
        System.out.println(findAllIndex2(arr,target,0));
    }

    static boolean search(int []arr, int target) {
        return helper(arr, target, 0);
    }

    static boolean helper(int [] arr, int target, int index){
        if(index == arr.length - 1){
            return false;
        }
        return arr[index] == target || helper(arr,target,index+1);
    }

    static int findIndex(int []arr, int target, int index){
        if(index==arr.length-1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return findIndex(arr, target,index + 1);
    }
    static int findIndexLast(int[] arr, int target, int index) {
        if(index == -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }


//    static void findAllIndex(int[]arr, int target, int index){
//        if(index==arr.length-1){
//            return;
//        }
//        if(arr[index]==target){
//            list.add(index);
//        }
//        findAllIndex(arr,target,index+1);
//
//    }
    static ArrayList findAllIndex(int[]arr, int target, int index, ArrayList<Integer>list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

       return findAllIndex(arr,target,index+1,list);
    }

    // not preferred to use below approach because of repetitive object creation, but can be used sometimes
    static ArrayList findAllIndex2(int[]arr, int target, int index){
        ArrayList<Integer> list= new ArrayList<>();

        if(index==arr.length-1){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
