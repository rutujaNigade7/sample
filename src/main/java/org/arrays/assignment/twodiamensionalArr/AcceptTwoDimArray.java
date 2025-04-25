package org.arrays.assignment.twodiamensionalArr;
import java.util.Scanner;
public class AcceptTwoDimArray {

    public static void main(String args[]){

        int arr[][] = new int[3][];


        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
