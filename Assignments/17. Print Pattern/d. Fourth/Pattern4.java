class Patter4{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) { 
                System.out.print(" "); 
            }
            for (int j = 0; j <= i; j++) { 
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}