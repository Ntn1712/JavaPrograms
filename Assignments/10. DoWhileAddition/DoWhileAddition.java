class DoWhileAddition{
    public static void main(String args[]){
        String answer;
        do{
            System.out.print("Enter first number: ");
            int a = new java.util.Scanner(System.in).nextInt();
            System.out.print("Enter second number: ");
            int b = new java.util.Scanner(System.in).nextInt();
            System.out.println("Total Sum of the two numbers is: " + (a + b));
            System.out.print("Do you want to perform this function again (Type 'Yes' or 'No'): ");
            answer = new java.util.Scanner(System.in).next();
        } while(answer.equals("Yes"));
    }
}