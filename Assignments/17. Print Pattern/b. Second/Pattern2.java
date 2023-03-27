class Pattern2{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}