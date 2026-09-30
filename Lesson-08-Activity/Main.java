class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }

  void print(String msg){
	System.out.println(msg);
  }

  double FtoC(double F){
	double result = (F-32)*(5.0/9);
	return result;
  }
 
double sphereVolume(double r){
	double result = (4.0/3)*Math.PI*Math.pow(r,3);
	return result;
}

double coneVolume(double r, double h){
	double result = Math.PI*(r*r)*(h/3.0);
	return result;
}

double distance(double x1, double y1, double x2, double y2){
	double result = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	return result;
}

}