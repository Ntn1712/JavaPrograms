class Square{
    public static void main(String args[]){
        System.out.print("Enter Length: ");
        int length = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = new java.util.Scanner(System.in).nextInt();
        if(length == breadth){
            System.out.println("It is a square");
        } else {
            System.out.println("It is not a square");
        }
    }
}