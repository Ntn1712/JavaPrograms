class NumberTable{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}