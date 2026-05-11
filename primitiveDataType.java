public class primitiveDataType{
	public static void main(String[] args){
		byte myAge = 30;
		System.out.printf("Miss mercy is %d years old%n",myAge);
		
	    short quantity = 20000;
		System.out.print("The quantity of iphone ordered is %,d%n",quantity);
		
		int nigeriapopulation = 294848848;
		System.out.printf("The population of nigeria is %,d%n<nigeriaPopulation");
		
		long  worldPopulation = 47474778478474874L;
		System.out.printf("The woorld population is %,d%n",worldPopulation);
		
		float price = 577858.84747F;
		System.out.printf("The price of  each iphone per unit is %,.2f%n",price);
		
		double myBalance = 7464784747747474.8474747;
		System.out.printf("My account balance is %c%,.2f",'$',myBalance);
		
		char symbol = '%';
		System.out.printf("There is an increment in the world's population by 20.5%c%n",symbol);
		
		boolean isJavaFun = true;
		System.out.printf("Do you love java %b",isJavaFun);
	}
}
