class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	System.out.println("Enter message");
	String msg = Input.readString();
	print(msg);

	System.out.println("Enter fahrenheit");
	double F = Input.readDouble();
	double C = FtoC(F);
	print("The temperature in celcius is " + C);

	System.out.println("Enter radius");
	double radius = Input.readDouble();
	double r = sphereVolume(r);
	print("The sphere's volume is " + radius);

  }

  void print(String msg){
	System.out.println(msg);
  }

  double FtoC(double F){
	double C = (F-32)*(5.0/9);
	return C;
  }
 
double sphereVolume(double ra){
	double r = (4.0/3)*Math.PI*Math.pow(r,3);
	return r;
}

double coneVolume(double r, double h){
	double result2 = Math.PI*(r*r)*(h/3.0);
	return result2;
}

double distance(double x1, double y1, double x2, double y2){
	double result3 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	return result3;
}

}