public class array {
    public static void main(String args[]){
       int arr[]={1,2,3,4,5};
       
       for(int i=0;i<5;i++){
        System.out.println(arr[i]);
       }

       System.out.println("Multidimensional array");
       int M_arr[][]={{1,2},
                       {3,4},
                       {5,6},
                     };
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(M_arr[i][j]+ " ");
            }
            System.out.println();
        }

       
    }
}
