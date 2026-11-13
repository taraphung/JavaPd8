class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print(allowance(5.00));
    addTwoNumbers();
    System.out.println("The GCF is " + GCF(10,20));
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

//Challenge #1
int allowance(double target){
  double total = 0.0;
  int days = 0;

  while (total<target){
    total += 0.01*Math.pow(2,days);
    days++;
  }
  return days;
}

//Challenge #2
void addTwoNumbers(){
  int num1 = (int)(Math.random()*10);
  int num2 = (int)(Math.random()*10);
  int answer;

  System.out.println(num1 + "+" + num2 + "?");
  answer=Input.readInt();

  while(answer!=num1+num2){
    System.out.println("Try again.");
    answer=Input.readInt();
  }
  System.out.println("Correct.");
}

//Challenge #3
int GCF(int a, int b){
  int gcf=1;
  int x=1;

  while (x<=a && x<=b){
    if (a%x==0 && b%x==0){
      gcf=x;
    }
    x++;
  }
  return gcf;
}

}

