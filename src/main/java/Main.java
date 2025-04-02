
public class Main {
    public static void main(String[] args) {
        int height = 5;  
        
        for (int i = 0; i < height; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            
            for (int k = height; k > i; k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
