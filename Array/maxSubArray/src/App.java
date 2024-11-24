import java.util.Scanner;

public class App {
    public static void maxSubArray(int arr[]){
        int count=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length; j++){
                int end=j;
                count =0;
            for(int k=start;k<=end;k++){
                count+=arr[k];
            }    
            System.out.println(count);
            if(count>max){
                max = count;
            }
            }
        }
        System.out.println("Max sum is : "+ max);
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
        maxSubArray(arr);

        scanner.close();
    }
}
