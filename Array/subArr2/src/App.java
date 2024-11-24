import java.util.Scanner;

public class App {
    public static void maxSubArray(int arr[]){
        int count;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<arr.length;i++){
            int start =i;
            for(int j=i; j<arr.length;j++){
                int end =j;
                count = start==0 ? prefix[end] :  prefix[end] - prefix[start-1];
                System.out.println(count);
                if(count>max){
                    max = count;
                }
            }
        }
        System.out.println("Maximum Number is : "+ max);
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
