class Nprimenumber {

  public static void main(String args[]) {
    System.out.print("Enter the number of prime numbers: ");
    int n = new java.util.Scanner(System.in).nextInt();
    int count = 0;
    for (int i = 1;; i++) {
        int count2 = 0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count2++;
            }
        }
        if(count2==2){
            System.out.println(i);
            count++;
        }
      if (count == n) break;
    }
  }
}
