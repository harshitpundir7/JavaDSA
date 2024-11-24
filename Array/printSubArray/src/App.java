import java.util.Scanner;

public class App {
    public static void subArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length+1; j++){
                int k =i;
                System.out.print("(");
                while(k!=j){
                    System.out.print(arr[k]);
                    k++;
                }
                System.out.print(") ");
            }
            System.out.println();
        }
        //second Method is given Below: 
        
        // for(int i=0; i<arr.length; i++){
        //     int start =i;
        //     for(int j=0; j<arr.length; j++){
        //         int end =j;
        //         for(int k=start; k<=end; k++){
        //             System.out.print(arr[k]+" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int size = scanner.nextInt();
    int arr[] = new int [size];
    System.out.println(" Enter the Elments in the Array: ");
    for(int i=0; i<arr.length; i++){
        arr[i]= scanner.nextInt();
    };
    subArray(arr);
    }
}
