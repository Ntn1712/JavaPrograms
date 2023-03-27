class NumberReverse{
    public static void main(String args[]){
        System.out.print("Enter the number to be reversed: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int temp;
        int n2 = 0;
        while(n!=0){
            temp = n%10;
            n=n/10;
            n2 = n2*10  + temp;
        }
        System.out.println("Reverse number is : " + n2 );
    }
}