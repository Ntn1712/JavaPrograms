class SumEvenOdd{
    public static void main(String args[]){
        System.out.print("Enter the total amount of numbers you want to enter: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("Please type the numbers");
        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++){
            int a = new java.util.Scanner(System.in).nextInt();
            if(a%2==0){
                even = even + a;
            } else {
                odd = odd + a;
            }
        }
        System.out.print("Sum of even numbers is: " + even + " and odd numbers is: " + odd);
    }
}