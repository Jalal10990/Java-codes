public class Task10b {
    public static void printTopHalf(int n, int i) {
       
        if (i > n) {
            return;
        }

        
        for (int j = 0; j < n - i; j++) {
            System.out.print(" ");
        }
        
        for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();

        printTopHalf(n, i + 1);
    }

    
    public static void printBottomHalf(int n, int i) {
        
        if (i < 1) {
            return;
        }

        
        for (int j = 0; j < n - i; j++) {
            System.out.print(" ");
        }
      
        for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();

        
        printBottomHalf(n, i - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        
        printTopHalf(n, 1);

        
        printBottomHalf(n, n - 1);
    }
}
