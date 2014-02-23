import java.util.Scanner;

public class NumeroAleatorio{
	
	public static void main ( String args[] ){
		Scanner sc = new Scanner(System.in);
		int x=0;
		int num = (int)Math.floor(Math.random()*(1-100+1)+100);
			while( x==0 ){ 
				System.out.println("Ingrese un numero entre 1 y 100");
				int numero = sc.nextInt();
				if ( numero==num){
				x = 1;
				System.out.println ( "GANASTE" );
				}else{
					if (numero < num ){
				System.out.println ( "Tu numero es menor" );
					}
					else{ System.out.println ( "Tu numero es mayor" );
					}
				}		
			}
		
	
	
	
	
	
}
}
	
	