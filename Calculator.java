
public class Calculator{

	public static double  Division(double fristvalue, double secondvalue){
        
        try{
            double ans = fristvalue/secondvalue;
			return ans;
        }
		catch (ArithmeticException aExp) { 
             System.out.println("Division by zero.");
            return 0;
        }
	}

	public static void main(String args[]){
		double number1=10,number2=5;
		System.out.println(Addition(number1,number2));
		System.out.println(Subtraction(number1,number2));
		System.out.println(Multiplication(number1,number2));
		System.out.println(Division(number1,number2));
	}

	
}