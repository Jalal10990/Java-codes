public class Task10 {
    public static void printStars(int n, int i) {
        
        if (i > n) {
            return;
        }
        
        
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();

       
        printStars(n, i + 1);
    }

    
    public static void printInvertedStars(int n, int i) {
       
        if (i == 0) {
            return;
        }

       
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();

        
        printInvertedStars(n, i - 1);
    }
    public static void main(String[] args) {
        int n = 5;

        
        printStars(n, 1);
        System.out.println();

       
        printInvertedStars(n, n);
    }
}
