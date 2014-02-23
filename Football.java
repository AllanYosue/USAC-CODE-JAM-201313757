import java.util.*;

public class Football {
	public static void main( String args[]){
		
		
		double velocidadinicial = Double.parseDouble(args[0]);
		double anguloradianes = Double.parseDouble(args[1]);
		
		/*double anguloradianes = Math.toRadians(angulogrados);*/
		double velocidadx = Math.cos(anguloradianes) * velocidadinicial;  
		double velocidady = Math.sin(anguloradianes) * velocidadinicial;
		
		double tiempo = ((2*velocidady)/9.8);
		System.out.println( tiempo + "segundos");
		double distancia = (tiempo * velocidadx);
		System.out.println( distancia + "metros"); 




	}
}