class Factorial{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("Factorial is: " + fact);
    }
}