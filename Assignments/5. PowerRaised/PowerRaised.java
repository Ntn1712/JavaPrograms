class PowerRaised{
    public static void main(String args[]){
        System.out.print("Enter first number: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter Second number: ");
        int b = new java.util.Scanner(System.in).nextInt();
        int num = 1;
        for(int i=0;i<b;i++){
            num = num * a;
        }
        System.out.print("A power B is: " + num);
    }
}