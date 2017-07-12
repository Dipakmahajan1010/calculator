class Calculator
{

	public static int addNumber(int number1,int number2)
	{
		

		return number1+number2;
	}
	public float mulNumber(float fNumber1, float fNumber2)
	{
		
		return fNumber1*fNumber2;
	}
	public double subNumber(double dNumber1,double dNumber2)
	{
		
		return dNumber1-dNumber2;
	}	
	
public static void main(String []args)
{


	Calculator calculator=new Calculator();
	
	int addition=calculator.addNumber(10,20);
	System.out.println("addition is="+addition);
	
	float  multiplication=calculator.mulNumber(10.2f,20.3f);
	System.out.println("multiplication is="+multiplication);

	double substraction=calculator.subNumber(200,125);
	System.out.println("substraction is"+substraction);
}
}
