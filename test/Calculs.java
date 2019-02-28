package test;

public class Calculs 
{ 
	private final int operande1; 
	private final int operande2; 
	
	public Calculs(int operande1, int operande2)
	{ 
		this.operande1 = operande1; 
		this.operande2 = operande2; 
	} 
	
	public int multiplier() 
	{ 
	  return operande1 * operande2; 
	} 

	public int additionner() 
	{ 
		return operande1 + operande2; 
	} 

	public int diviser() 
	{ 
		return operande1 / operande2; 
	} 

	public int soustraire() 
	{ 
		return operande1 - operande2; 
	} 
	
	public static void main(String[]args) {
		//System.out.println("Nique Ta Mere va ecouteur du Chavex 18 c'est mieux");
		Calculs calc = new Calculs(10,8);
		Calculs calc2 = new Calculs(6,3);
		Calculs calc3 = new Calculs(180,10);
		Calculs calc4 = new Calculs(20,2);
		Calculs calc5 = new Calculs(18,1);
		
		LancerTest(calc);
		LancerTest(calc2);
		LancerTest(calc3);
		LancerTest(calc4);
		LancerTest(calc5);		
	}

	public static void LancerTest(Calculs calc)
	{
		System.out.println("Addition : " + calc.additionner());
		System.out.println("Soustraction " + calc.soustraire());
		System.out.println("Multiplication " + calc.multiplier());
		System.out.println("Division " + calc.diviser());
		System.out.println("--------------------------------------");
	}
	
}