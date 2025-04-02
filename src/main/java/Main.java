
public class Main {
    public static void main(String[] args) {
        int height = 5;  // You can change this value to adjust triangle size
        
        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = height; k > i; k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
