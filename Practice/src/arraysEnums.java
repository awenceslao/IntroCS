import java.util.Random;

public class arraysEnums {
	static arraysEnums ae = new arraysEnums();
	static Random r;
	
	
	public static void main(String[] args) {
		
		Cars[] carLot = new Cars[100];	
		
		for (int i = 0; i < carLot.length; i++) {
			r = new Random();
			int carType = r.nextInt(4);
			carLot[i] = Cars.values()[carType];
			System.out.println(carLot[i]);
		}
		
		
		
		

	}

}
