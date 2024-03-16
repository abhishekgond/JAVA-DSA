package PW_BinerySearch;

import javax.xml.transform.Source;

public class first {
    static boolean binary_search(int arr[]){
            int low =0,heigh = arr.length-1;
            int target = 3;
            boolean flag =false;
            while(low<=heigh){
                int mid= low+(heigh-low)/2;
                if(arr[mid]==target){
                    flag =  true;
                    break;
                }
                else if(arr[mid]<target){
                    low = mid+1;
                }
                else if(arr[mid]>target){
                    heigh = mid-1;
                }
            }
            return flag;
    }
    public static void main(String[] args) {
        System.out.println("Binary Search ");
        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println(binary_search(arr));

    }
    }

