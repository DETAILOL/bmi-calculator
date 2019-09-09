
public class BMICalculator 
{
    double weight;
	double height;
	double BMI;

/**
 * Calculating the BMI value of the person	
 */
public void calculateBMI()
      {
	this.BMI =Math.round(10.0*weight/Math.pow(0.01*height, 2))/10.0;
	    
      }
/**
 * Getting the BMI of the person
 * @return the BMI of the person
 */
public String getSensibleBMIMessage() 
      {
       return "Your BMI is: " + BMI;
      
      }
	/**set for methods*/
	  
    
    public BMICalculator(double a,double b) 
	   {
        weight=a;
        height=b;
	  
       }
       /**
        * set for BMICalculator
        * @return weight and height
        */
    public double getWeight() {
    	return weight;
    }
    public double getHeight() {
    	return height;
    }	
    public double getBMI() {
    	return BMI;
    }
    /**
     * set for the methods
     */
	
	

}
