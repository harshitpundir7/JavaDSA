import java.util.Scanner;

public class App {
    public static void update(int marks []){
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int marks[] = new int [5];
        for(int i=0; i<marks.length; i++){
            marks[i] = scanner.nextInt();
        }
        System.out.println();
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(" " + marks[i]);
        }
        scanner.close();
    }
}
