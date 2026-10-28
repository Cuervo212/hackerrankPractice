
import java.util.Scanner;

public class HackerrankPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()){
            int queries = sc.nextInt();
            
            for (int i = 0; i < queries; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                
                int currentTerm = a;
                
                for (int j = 0; j < n; j++) {
                    currentTerm += (int) Math.pow(2, j) * b; // 8// 16 // 32 //64 
                    System.out.print(currentTerm + " ");
                }
                System.out.println();
            }
        }
    }
}
