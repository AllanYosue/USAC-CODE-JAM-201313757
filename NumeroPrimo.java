

public class NumeroPrimo{
	public static void main(String[] args){
		int numero = Integer.parseInt(args[0].toString());
		int y = 1;
		int z = 0;
		int x = 1;
		if ( numero > 0){
			System.out.println( "1");
		}
		for ( x = 1; x <= numero; x++){
			z = 0;
			for ( y = 1 ; y <= x; y++ ){				
				if ( x % y == 0){
					z = z +1;
				}						
								
			}
			
		if ( z == 2 ){
						System.out.println ( + x );
		}					
		}
		
				
	}
}