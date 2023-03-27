class Prime{
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}