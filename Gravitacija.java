public class Gravitacija {
	public static void main(String[] agrgs){
		System.out.println("OIS, kinda mid");
	}
    
    //B
    private double izracunaj(int visina)
    {
        return ((Math.pow(6.674, -11) * Math.pow(5.972, 24)) / Math.pow(Math.pow(6.371, 6) + visina, 2));
    }
}