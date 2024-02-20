


/**
 * TriplateSmallelerXsum
 */
public class TriplateSmallelerXsum {

               public static void main(String[] args) {
                              
                      int count=0;
                        int  sum = 2;
                     int arr[] = {-2, 0, 1, 3};
                     int n=arr.length;

                                     for(int i=0; i<n-2; i++)
                              {
                                             for(int j=i+1; j<n-1; j++)
                                             {
                                                 for(int k=j+1; k<n; k++)
                                                 {
                                                     if(arr[i]+arr[j]+arr[k]<sum)
                                                     count++;
                                                 }
                                             }
                                         }
                                         System.out.println(count);
                                      







               }
}