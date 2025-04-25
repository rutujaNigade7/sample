
package org.arrays.assignment;
import java.util.*;
public class SearchElement {

    public static void main(String args[]){

        int a[] = new int[]{1,2,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elemenet to search : ");
        int search = sc.nextInt();
        int flag = 1;
        for(int i=0;i<a.length;i++){
            if(a[i] == search) {
                System.out.println("index is : "+i);
                flag = 0;
            }

        }

        if(flag ==1){
            System.out.println("element not found");
        }
    }
}
