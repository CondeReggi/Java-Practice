
public class TestConde {
	
	public static int[] ordenarArray( int[] arr ) {	
		
		for ( int i = 0 ; i < arr.length - 1 ; i++ ) {		
			for ( int j = 0 ; j < arr.length - 1 ; j++ ) { 		
				if( arr[j] > arr[ j + 1 ] ) {
					
					int aux = arr[ j + 1 ];					
					arr[ j + 1 ] = arr[j];					
					arr[ j ] = aux;
		
				}
			}
		}
		
		return arr;
	}
	
	public static void mostrarArray( int[] arr ) {
		
		for ( int i = 0 ; i < arr.length ; i++ ) {
			System.out.print( arr[i] + " ," ) ;
		}
		
		System.out.println("");
	}
	
	public static String seEncuentran( int[] arr ) {
		boolean desc = true;
		boolean asc = true;
		
		for ( int i = 1 ; i < arr.length && ( desc || asc ) ; i++ ) {
			if ( arr[ i - 1 ] < arr[ i ] ) desc = false;
			if ( arr[ i -1 ] > arr[ i ] ) asc = false;
			
		}
		if ( desc || asc ) {
			if ( desc && asc ) {
				return "Son todos iguales";
			}
			return desc ? "Descendiente" : "Ascendente";
		}
		return "Todos mezclados";
	}
	
	public static boolean esPerfecto( int num ) {
		int suma = 0;

		for ( int i = 1 ; i < num ; i++ ) { 
			if ( num % i == 0 ) {
				suma += i;
			}
		}
		return num == suma ;
	}
	
	public static boolean esPalindromo ( String cadena ) {
		
		StringBuilder str = new StringBuilder( cadena );
		
		return cadena.toLowerCase().equals( str.reverse().toString() );
	}
	
	public static String esCompuestaPor( String cadena ) { 
		
		if ( cadena.toLowerCase().replaceAll( "[a-z]" , "" ).length() == 0 ) return "Solo letras";
		if ( cadena.toLowerCase().replaceAll( "[0-9]" , "" ).length() == 0 ) return "Solo numeros";
				
		return "Es compuesta de varios tipos de caracteres";
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,58,7,85,6,1,5,96};
		
		mostrarArray( array );
		
		System.out.println( seEncuentran( array ) );

		mostrarArray( ordenarArray( array ) );
		
		System.out.println( seEncuentran( array ) );
		
		System.out.println( esPerfecto( 7 ) );
		
		System.out.println( esPalindromo( "asddsa" ) );
		
		System.out.println( esCompuestaPor( "asdasdasdSDASDasd" ) );
		
	}

}
