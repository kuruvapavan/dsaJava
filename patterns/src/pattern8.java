public class pattern8 {
    public static void main(String[] args) {
        //printStarPattern(10);
        pat9(5);
        pat11(5);
        pat12(5);
    }

    static void printStarPattern(int n) {
        for (int i = 1; i <= n; i += 2) {

            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void pat9(int n){
        for (int i = 0; i <n ; i++) {
            for (int j =(n-i); j>=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 static void pat11(int n) {
     for (int i = 0; i < 2 * n; i++) {
         int totalColsInRows = i > n ? 2 * n - i : i;
         int noOfSpaces = n - totalColsInRows;
         for (int j = 0; j < noOfSpaces; j++) {
             System.out.print(" ");
         }
         for (int j = 0; j < totalColsInRows; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
 static void pat12(int n){
     for (int i = 0; i <n ; i++) {
         for (int j = 0; j <n-i-1 ; j++) {
             System.out.print(" ");
         }
         int num=1;
         for (int j = 0; j <=i ; j++) {
             System.out.print(num+ " ");
             num=num*(i-j)/(j+1);
         }
         System.out.println();
     }
 }
}
