class Armstrong {

  public static void main(String args[]) {
    System.out.println("Armstrong Numbers till 500: ");
    for (int i = 1; i < 500; i++) {
      int temp, digits = 0, last = 0, sum = 0;
      temp = i;
      while (temp > 0) {
        temp = temp / 10;
        digits++;
      }
      temp = i;
      while (temp > 0) {
        last = temp % 10;

        sum += (Math.pow(last, digits));
        
        temp = temp / 10;
      }
      
      if (i == sum) 
        System.out.println(i);
    }
  }
}
