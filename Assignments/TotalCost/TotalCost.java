class TotalCost{
    public static void main(String args[]){
        System.out.print("Enter Quantity: ");
        int a = new java.util.Scanner(System.in).nextInt();
        int totalCost = 10 * a;
        if(a > 1000){
            totalCost = totalCost - totalCost/10;
        }
        System.out.println("Total Cost: " + totalCost + "rs");
    }
}