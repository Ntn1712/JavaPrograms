class Bonus{
    public static void main(String args[]){
        System.out.print("Enter Salary: ");
        int salary = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter Years of service: ");
        int service = new java.util.Scanner(System.in).nextInt();
        if(service > 5){
            int totalBonus = salary/2;
            System.out.println("You are getting a bonus of " + totalBonus + "rs.");
        } else {
            System.out.println("You are not getting any bonus");
        }
    }
}