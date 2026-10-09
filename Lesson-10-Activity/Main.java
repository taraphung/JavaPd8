
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println("Enter raw gpa:");
		double rawGpa = Input.readDouble();
		System.out.println("GPA:" + gpa(rawGpa));
		System.out.println();
		
		System.out.println("Enter grade level:");
		int grade = Input.readInt();
		System.out.println("Enter credits earned:");
		double credits= Input.readDouble();
		

		if(isGraduating(grade, credits)){
			System.out.println("Student is Graduating");
		}else{
			System.out.println("Student is NOT Graduating");
		}
		System.out.println();

		System.out.println("Enter weight in pounds:");
		double weight=Input.readDouble();
		System.out.println("Enter height in inches:");
		double height = Input.readDouble();
		System.out.println("BMI:" + BMI(weight, height));
		System.out.println();

		System.out.println("Enter package weight:");
		double pkgweight=Input.readDouble();
		System.out.println("Total shipping cost: $" + shippingCost(pkgweight));
		System.out.println();

		System.out.println("Enter light frequency in THz:");
		double frequency=Input.readDouble();
		System.out.println("Is it either blue or violet?:" + blueOrViolet(frequency));
		System.out.println();

  }

 
 double gpa(double gpa){
	if(gpa>90){
		return gpa*1.1;
	}else{
		return gpa;
	}
 }

 boolean isGraduating(int gradelvl, double credits){
	if(gradelvl==12 && credits>=44){
		return true;
	}else{
		return false;
	}
 }

 String BMI(double weight, double height){
	double yourBmi = (weight/(height*height))*703;

	if(yourBmi <=18.4){
		return "Underweight";
	}else if(yourBmi>=18.5 && yourBmi <= 24.9){
		return "Normal";
	}else if(yourBmi>=25.0 && yourBmi <= 39.9){
		return "Overweight";
	}else{
		return "Obese";
	}
 }
  
double shippingCost(double weight){
	if(weight<=10.0){
		return 0.00;
	}else if(weight >10.0 && weight <=15.0){
		return 5.00;
	}else if(weight >15.0 && weight<=25.0){
		return 10.00;
	}else{
		return 10.00 + ((weight-25.0)*0.02);
	}
}

boolean blueOrViolet(double frequency){
	if((frequency>=600 && frequency<=670) || (frequency>=700 && frequency<=750)){
		return true;
	}else{
		return false;
	}
}

}