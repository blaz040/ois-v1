public class Gravitacija {
	public static void main(String[] agrgs){
			System.out.println("OIS, je zakon!");
			izpis(0.0);
			izpis(10.0);
			izpis(1000.0);
			izpis(100000.0);

	}    
    //B
 	public static double izracunGravitacije(double visina){
		double C = 6.674e-11;
		double M = 5.972e24;
		double r = 6.371e6;
		return (C * M) / Math.pow(r + visina, 2.0);
		
	}
	public static void izpis (double visina){
		System.out.printf("Gravitacijski pispsek na %.2f km nadmorske visine je %.2f m/s\n", visina, izracunGravitacije(visina * 1000));
	
	}
}
