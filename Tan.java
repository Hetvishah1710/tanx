package main;
import java.util.*;
import java.math.*;

import java.text.DecimalFormat;

/**
 * This is the main tangent class which implements the functionalities such as calculation of sin value, cos value and tan value
 * and it also validates the input values depending on domain. 
 * @author Hetvi
 *
 */
public class Tan {
	static int i;
	
	
	
	
	
	/**
	 * This is Default constructor.
	 */
    public Tan() {
	}
    
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Tan t =new Tan();
		System.out.println("Enter the value of x in degree :");
		//float x = sc.nextFloat();
		
		double x = Double.parseDouble(sc.next());
		while(!(t.validateValue(x)))
		{
			System.out.println("Enter the value of x in degree : ");
			x= Double.parseDouble(sc.next());
		}
		double tan_value;
		double tan ;
		
		
		tan_value = t.tanf(x);
		System.out.println("value of tan is" + tan_value);
	}
	
	
	/**
	 * This is validation method which tests input value is within the function's domain or not using exception handling. 
	 * @param x input value
	 * @return true if it is properly defined otherwise returns false
	 */
	public boolean validateValue(double x)
	{
		
		try{ 
			for(int i=1;i<9999;i=i+2)
			{
				double temp = 90*i;
				if(temp==x || temp == -x)
				{
					System.out.println("Value of x should be within its domain!!");
					return false;
				}
			}
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * This is the tangent method which calculates tan value of input using sin and cosine value.
	 * @param r input value  
	 * @return result of tan value of r
	 */
	public double tanf(double r) {
		double sin_value = sinf(r);
		//value of sin
		System.out.println("value of sin" + sin_value);
		double cos_value = cosf(r);
		//value of cos
		System.out.println("value of cos" + cos_value);
		double output = sin_value/cos_value;
		DecimalFormat df = new DecimalFormat(".#####");
		output = Double.parseDouble(df.format(output));
		return output;
	}
	
	/**
	 * This method calculates cosine value 
	 * @param r input 
	 * @return result of cosine value using maclaurin's series
	 */
	public  double cosf(double r) {
		double pi = Math.PI;
		//converting it to radian
		r = (r/180) * pi;
		boolean flag = true;
		double output =0;
		int i=1;
		for(i=0;i<7;i++) {
			int n =2*i;
			if(i%2==0)
			{
				output+= (power(r,n))/fact(n);
			}
			else
			{
				output-=(power(r,n))/fact(n);
			}
//			if(flag) {
//				output = output + (power( r ,  i) / fact( r)) ;//- (power( r ,  i+2) / fact( r)) + (power( r ,  i+4) / fact( r)) - (power( r ,  i+6) / fact( r));
//				flag = false;
//			}
//			else {
//				output -=  (power( r ,  i) / fact( r));
//				flag = true;
//			}
		}
		DecimalFormat df = new DecimalFormat(".#####");
		output = Double.parseDouble(df.format(output));
		return output;
	}
	
	/**
	 * This method calculates sine value 
	 * @param r input 
	 * @return result of sine value using maclaurin's series
	 */
	public double sinf(double r) {
		double pi = Math.PI;
		//converting it to radian
		r = (r/180) * pi;
		boolean flag = true;
		double output =0;
		int i=1;
		for(i=0;i<7;i++) {
			int n =2*i+1;
			if(i%2==0)
			{
				output+= (power(r,n))/fact(n);
			}
			else
			{
				output-=(power(r,n))/fact(n);
			}
//			if(flag) {
//				output = output + (power( r ,  i) / fact( r)) ;//- (power( r ,  i+2) / fact( r)) + (power( r ,  i+4) / fact( r)) - (power( r ,  i+6) / fact( r));
//				flag = false;
//			}
//			else {
//				output -=  (power( r ,  i) / fact( r));
//				flag = true;
//			}
		}
		DecimalFormat df = new DecimalFormat(".#####");
		output = Double.parseDouble(df.format(output));
		return output;
	}
		 //public static float sine1(float r){
		/*        float sin=0.0f;
		        long fact;
		        for(int i=1; i<=10; i++){
		            fact=1;
		            for(int j=1; j<=2*i-1; j++){
		                fact=fact*j;
		            }
		            if(i%2==1){
		                sin=sin+(float)(power(r,2*i-1)/fact);
		            }else{
		                sin=sin-(float)(power(r,2*i-1)/fact);
		            }
		        }
		        return sin;
		    }*/
//	public static double cosf(double sin_value) {
//		double sin2 = sin_value * sin_value;
//		double cos2 = 1- sin2;
//		System.out.println(cos2);
//		double cosv = Math.sqrt(cos2);
//		System.out.println(cosv);
//		return cosv;
//	}
	
	
	/**
	 * This method calculates power value 
	 * @param r base value 
	 * @param i exponent value
	 * @return result of r raised to the power i.
	 */
	public double power(double r , int i) {
		    double output = 1;
	        for (int j=i;j != 0; j--)
	        {
	            output *= r;
	        }
	       // System.out.println("Answer = " + result);

			DecimalFormat df = new DecimalFormat(".#####");
			output = Double.parseDouble(df.format(output));
	        return output;
	    }
		
	/**
	 * This is factorial implementation using iteration method
	 * @param r input value
	 * @return result of factorial
	 */
	public double fact(double r) {
		
		 int fact=1;  
		 if(r==0)
			 return fact;
		  double number = r;//It is the number to calculate factorial    
		  for(int k=1;k<=number;k++){    
		      fact=fact*k;    
		  }    
		  //System.out.println("Factorial of "+number+" is: "+fact);
		return fact;
	}
}

