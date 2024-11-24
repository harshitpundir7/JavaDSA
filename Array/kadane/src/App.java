import java.util.Scanner;

public class App {
        public static void kadane(int arr[]){
            int max = Integer.MIN_VALUE;
            int count = 0;
            for(int i=0; i<arr.length;i++){
                count+=arr[i];
                if(count <0){
                    count=0;
                }
                max = Math.max(max, count);
            }
            System.out.println("Using Kadane the Biggest is :" + max);
        }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scanner.nextInt();
        int arr[] = new int [size];
        System.out.println(" Enter the Elments in the Array: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        kadane(arr);


        scanner.close();
    }
}
