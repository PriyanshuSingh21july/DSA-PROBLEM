import java.util.Arrays;
import java.util.HashMap;

public class SecondLargestEl {


               /**
                * @param args
                */
               public static void main(String[] args) {
                              

                          
                              int arr[]={1,5,7,8,3,9,12,56};
                              int n=arr.length;
                              Arrays.sort(arr);

                              for(int i=0; i<arr.length;i++)
                              {
                                             System.out.println(arr[i]);
                              }


                              System.out.println("Second largest element is :"+arr[n-2]);
               }
               
}
