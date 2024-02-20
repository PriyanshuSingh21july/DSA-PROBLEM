public class equlibriumpoint {
               

               public static void main(String[] args) {
                              
                          
                              int A[] = {1,3,5,2,2} ;
                            int n=A.length;
                            int lsum=0;
                            int rsum=0;

                      for(int i=1; i<n; i++)
                      {

                              for(int j=i-1; j>=0; j--)
                              {
                            lsum+=A[j];

                              }
                              for(int k=i+1; k<n; k++)
                              {
                                             rsum+=A[k];
                              }
                              if (lsum==rsum) {
                                             System.out.println("Equribrium point"+i);
                                             
                              }
                              else
                              {
                                 System.out.println("Not persent eqribrium point");
                              }

                      }



               }
}
