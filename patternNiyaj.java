public class patternNiyaj {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            //N
            for (int j = 0; j < n; j++) {
                if(j == 0 || j == n-1 || i == j) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            //I
            for(int j = 0; j < n-1; j++){
                if(i ==0 || i == n-1 || j == (n-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            //W
            for (int j = 0; j < n; j++) {
                if(j == (n-1)/2 && i >= n/2 || i == j && i < n/2 || i+j == n-2 && i < n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            // A
            for (int j = 0; j < n-2; j++) {
                if(i == 0 || j==0 || j == n-3 || i == (n-1)/2 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            //J
            for (int j = 0; j < n-1; j++) {
                if(i == 0 || i == n-1 && j < n/2 || j == (n-1)/2 || j == 0 && i > n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
