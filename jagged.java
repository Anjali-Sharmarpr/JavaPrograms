//creating jagged arrays 
//jagged arrays are where no of columns are different

public class jagged {
    public static void main(String args[]){
        int arr[][]= new int[3][];

        arr[0]=new int[4];
        arr[1]=new int[3];
        arr[2]=new int[2];

        for(int i =0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
               arr[i][j]=(int)(Math.random()*10);
               //System.out.print(arr[i][j] + " ");
            }
            //System.out.println();
        }
        for(int i =0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
               //arr[i][j]=(int)(Math.random()*10);
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced loop
        
        System.out.println();
        
        for(int i[] : arr){
           for(int j : i){
            System.out.print(j+ " ");
           }
           System.out.println();
        }

    }
}
