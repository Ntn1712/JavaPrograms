class Hcf{
    public static void main(String args[]){
        System.out.print("Enter First Number: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter Second Number: ");
        int b = new java.util.Scanner(System.in).nextInt();
        int c = a > b ? b : a;
        int hcf = 0;
        for(int i=1;i <= c;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF is: " + hcf);
    }
}