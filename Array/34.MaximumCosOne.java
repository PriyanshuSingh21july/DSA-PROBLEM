public class MaximumCosOne {

             public static void main(String[] args) {
               

               int arr[]={1, 1, 0, 1, 1, 1};
               int maxi=0;
               int count=0;
               for(int i=0; i<arr.length; i++)
               {
                              if(arr[i]==1)
                              {
                                             count++;
                              }
                              else
                              {
                                             count=0;
                              }
               }
               int result=Math.max(maxi, count);
               System.out.println("Result :"+result);

             }  
               
}
