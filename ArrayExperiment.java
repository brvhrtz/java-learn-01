public class ArrayExperiment{
     public static int[] NonZeros(int [] A){
         int N=0;  
         int [] B; 
         int i, j;
           
         for(i=0; i<A.length; i++){
             if(A[i] !=0) N++; 
         }
         B = new int [N];
         
         j=0; 
         for(i=0; i<A.length; i++){
             if(A[i] !=0) B[j++] = A[i]; 
         }
         return B; 
     }
     public static void main(String []args){
        int [] A = {1, 0, 2, 0, 3, 0, 4, 0, 5}; 
        int [] B; 
   //      B = NonZeros(A); 
      B = A; 
      
        for(int i=0; i<B.length; i++){
            System.out.print(B[i] + " " ); 
        }
        System.out.println("\n");
     }
     
}
