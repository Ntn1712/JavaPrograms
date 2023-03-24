class EvenOdd{
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        int a = new java.util.Scanner(System.in).nextInt();
        if(a%2==0){
            System.out.println("Even Number");
        } else {
            System.out.println("Even Odd");
        }
    }
}