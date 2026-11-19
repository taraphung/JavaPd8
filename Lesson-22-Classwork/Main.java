class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String[] friends = {"Isabella", "Maria", "Bob", "James"};
   System.out.println(friends[0]);

   double[] celsiusTemps={20.0, 35.0, 50.0};
   double[] farhenheitTemps=convert(celsiusTemps);
   for(int x=0; x<=farhenheitTemps.length-1; x++){
    print(farhenheitTemps[x] + " F");
   }
  }

  double[] convert(double[] celsius){
    double[] newArray=new double[celsius.length];
    for(int x=0; x<=celsius.length-1; x++){
      newArray[x]=celsiusToFarhenheit(celsius[x]);
    }
    return newArray;
  }
  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}