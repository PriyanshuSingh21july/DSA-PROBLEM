/*
 *  Remove Duplicates from Sorted Array
 * 'n' = 5, 'arr' = [1 2 2 2 3].
The new array will be [1 2 3].
So our answer is 3


 public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
       

       int i=0;
       for(int j=1; j<n;j++)
       {
           if(arr[j]!=arr[i])
           {
               arr[i+1]=arr[j];
               i++;
           }
       }
  return (i+1);


    }
}
 */