class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println("Enter tickets");
	  int tickets = Input.readInt();

    double totalCost = groupSavings(tickets);
    System.out.println("Total is $" + totalCost);

    System.out.println("Enter total grocery amount");
    double total = Input.readDouble();

    System.out.println("Enter number of cans of beans");
    int cans = Input.readInt();

    double savings = groceryDiscount(total, cans);
    System.out.println("Your savings is $" + savings);
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
   double groupSavings(int tickets){
    if (tickets>=1 && tickets<=8){
      return 11.0*tickets;
    }else if (tickets>=9 && tickets<=16){
      return 10.50*tickets;
    }else if (tickets>16){
      return 8.50*tickets;
    }else{
      return 0.0;
    }
   }

  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
double groceryDiscount(double total, int cans){
  if (total>=100.0 && total<=200.0 && cans>=3){
    return 10.0;
  }else if (total>200 && cans>4) {
    return 25.0;
  }else{
    return 0.0;
}
}
}