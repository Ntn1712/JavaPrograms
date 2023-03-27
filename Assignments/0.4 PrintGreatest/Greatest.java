class Greatest{
    public static void main(String args[]){
        System.out.print("Enter A: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter B: ");
        int b = new java.util.Scanner(System.in).nextInt();
        if(a>b){
            System.out.println("A is bigger than B");
        } else if(a==b){
            System.out.println("A is equal to B");
        } else {
            System.out.println("B is bigger than A");
        }
    }
}