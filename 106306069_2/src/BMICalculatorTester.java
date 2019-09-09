import java.util.Scanner;
 
public class BMICalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		boolean doloop = true;
		while(doloop) {
			System.out.println("Please enter your weight and height: ");
			double weight = in.nextDouble();
			double height = in.nextDouble();
			BMICalculator bmiCalculator = new BMICalculator(weight, height);
			bmiCalculator.calculateBMI();
			System.out.println("The weight input: "+ bmiCalculator.getWeight() + " kg.");
			System.out.println("The height input: "+ bmiCalculator.getHeight() + " cm.");
			System.out.println(bmiCalculator.getSensibleBMIMessage());
			
			}in.close();
		}
		
		
	

}
