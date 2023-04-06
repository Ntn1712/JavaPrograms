class PrintCount{
    public static void main(String args[]){
        System.out.print("Enter the total amount of numbers you want to enter: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("Please type the numbers");
        int cPos = 0; 
        int cNeg = 0;
        int cZero = 0;
        for(int i=0;i<n;i++){
            int a = new java.util.Scanner(System.in).nextInt();
            if(a<0) cNeg++;
            else if(a>0) cPos++;
            else if(a==0) cZero++; 
        }
        System.out.println("Total Number of Positive Integers: " + cPos);
        System.out.println("Total Number of Negative Integers: " + cNeg);
        System.out.println("Total Number of Zeros: " + cZero);
    }
}