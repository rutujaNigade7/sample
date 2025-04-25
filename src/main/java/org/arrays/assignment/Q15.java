/*Program: WAP to merge 2 arrays to 3rd array.3rd array should not have
 * elements of same value.
 */

package org.arrays.assignment;

import java.util.Arrays;

public class Q15 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr1[]=new int[] {1,2,3,4};
        int arr2[]=new int[] {5,2,7,9};

        int arr3[]=new int[arr1.length+arr2.length];

        int i,j,k;

        i=0;
        for(j=0;j<arr1.length;j++)
        {
            arr3[i]=arr1[j];
            i++;
        }

        for(k=0;k<arr2.length;k++)
        {
            arr3[i]=arr2[k];
            i++;
        }
        System.out.println("Merged array is: \n"+Arrays.toString(arr3));

        int count=1,flag=0,no_of_digits_in_array=0;

        for(i=0;i<arr3.length;i++)
        {
            for(j=i-1;j>=0;j--)
            {
                if(arr3[i]==arr3[j])
                    flag=1;
            }

            if(flag==0)
            {
                for(k=i+1;k<arr3.length;k++)
                {
                    if(arr3[i]==arr3[k])
                    {
                        count++;
                        for(int p=k+1;p<arr3.length;p++)
                        {
                            arr3[p-1]=arr3[p];
                        }
                    }
                }
                no_of_digits_in_array++;
            }

            flag=0;
            count=1;
        }

        System.out.println("Final array is: ");
        for(int s=0;s<no_of_digits_in_array;s++)
            System.out.print(arr3[s]+" ");


    }

}
