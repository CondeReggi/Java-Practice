import java.util.Iterator;
import java.util.Scanner; // Importamos el scanner

import javax.swing.JOptionPane;

public class First {
	
	static int sumarNumeros (int a , int b) {  // Siempre tiene que tener el static
		
		return a + b;
		
	}
	
	static String mayorAB ( int a, int b ) {
		String result = "";
		
		result = a > b ? a + " es mayor que " + b : b + " es mayor que " + a ; // Operador ternario igual que javascript
		
		return result;
	}
	
	static void mostrarNombre () {
		String cadena;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena de texto");
		
		JOptionPane.showMessageDialog(null, "Hola " + cadena);
	}
	
	static Double areaCirculo( Double radio ) {
		
		Double pi = 3.14;
		
		return pi * Math.pow(radio, 2);
	}
	
	static String AdivisibleEntreB ( int a , int b ) {
		
		return ( a % b == 0 ) ? a + " es divisible entre " + b : a + " no es divisible entre " + b ;
		
	}
	
	static char toASCII ( int number ) {
		return (char)number;
	}
	
	static int asciiToInteger ( String caracter ) {
		return (int)caracter.charAt(0); // Convierte el string a char
	}
	
	static Double calcularIVA ( Double price ) {
		Double iva = 0.21;
		return price * (1 + iva) ;
	}
	
	static void mostrarDesdeAtoB ( int a , int b , int multiplo ) { 
		
		int auxA , auxB;
		
		if ( b > a ) {
			auxA = a; auxB =b;
		}else {
			auxA = b; auxB =a;
		}
		
		while ( auxA != auxB ) {
			if ( auxA % multiplo == 0 ) {
				System.out.println(auxA);
			}
			auxA++;
		}
		System.out.println(auxB % 2 == 0 ? auxB : "");
		
	}
	
	static void calcularRaices( Double a , Double b , Double c ) {
				
		if ( (Math.pow(b, 2) - 4*a*c) >= 0  ) {
			
			System.out.println("Una raiz es: " + (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a));
			
			if ( (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a) != (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a) ) {
				System.out.println("Y otra es: " + (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a));
			}else {
				System.out.print("Y es doble");
			}
		}else {
			System.out.println("Tiene raices imaginarias");
		}
		
	}
	
	static Double CalculadoraPolacaInversaApp ( Double a , Double b , String signo ) {
		
		Double result = 0.0; 
		
		switch (signo) {
			case "+": {
				result = a + b;
				break;
			}
			case "-": {
				result = a - b;
				break;
			}
			case "/": {
				result = a / b;
				break;
			}
			case "*": {
				result = a * b;
				break;
			}
			case "^": {
				result = Math.pow(a, b);
				break;
			}
			case "%": {
				result = a % b;
				break;
			}
		}
		
		return result;
		
	}
	
	static int sumatoria( int hasta ) {
		
		int result = 0;
		
		if ( hasta < 0 ) {
			result = -1;
		}else {
			for ( int i = 1 ; i <= hasta ; i ++  ) {
				result += i;
			}
		}
		
		return result;
	}
	
	static int numerosIntroducidos() {
		Scanner sc =  new Scanner(System.in);
		int cantidad = 0;
		int num = 0;
		
		while ( num != -1 ) {
			num = sc.nextInt();
			cantidad++;
		}
		return cantidad - 1;
	}
	
	static String eliminarEspacios( String frase ) {
		String[] parts = frase.split(" ");
		String result = "";
		
		for (int i = 0; i < parts.length; i++) {
			result += parts[i];
		}
		
		return result;
	}
	
	static String convertUpperOrLower ( String cadena , boolean Upper ) {
		
		if ( Upper ) {
			return cadena.toUpperCase();
		}else {
			return cadena.toLowerCase();
		}
		
	}
	
	
	static String cuartaQuinta ( String cadena ) { 
		
		String result;
		
		String[] arr = cadena.split(" ");
				
		result = cadena.substring( cadena.indexOf(arr[3]) , cadena.indexOf(arr[4]) +  arr[4].length() );
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		// mostrarNombre(); // Muestra el nombre mediante JOptionPane
		
		Scanner sc =  new Scanner(System.in); // Le pido al Scanner que tenga en cuenta lo que entre por consola
				
		// int a,b,suma;
		// a = 3;
		// b = 4;
		
		/* System.out.println("Ingrese primer numero");
		
		String num1 = sc.nextLine(); // Pide un string
		
		int num2;
		
		System.out.println("Ingrese segundo numero");
		
		num2 = sc.nextInt(); // Pide un integer
				
		System.out.println("La suma es: " + sumarNumeros( Integer.parseInt(num1) , num2) );
		System.out.println("entonces => " + mayorAB( Integer.parseInt(num1) , num2) );  */
		
		/*
		System.out.println("Ingrese un radio");
		
		String radio = sc.nextLine();
		System.out.println("El area del circulo de radio " + radio + " es: " + areaCirculo( Double.parseDouble(radio) )  );
		*/
		
		/*
		System.out.println("Ingrese dos numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println( AdivisibleEntreB ( a , b ) );
		*/
		
		// System.out.println( toASCII( sc.nextInt() ) );
		
		// System.out.println( asciiToInteger ( sc.next() ) );
		
		// System.out.println( calcularIVA( sc.nextDouble() ) );
		
		// mostrarDesdeAtoB( 1 , -10 , 2);
		
		// calcularRaices( sc.nextDouble() , sc.nextDouble() , sc.nextDouble() );
		
		//System.out.println( CalculadoraPolacaInversaApp( 385.0 , 2.0 , "as" ) );
		
		/*
		int hasta;
		
		do {
			hasta = sc.nextInt();
		} while ( sumatoria( hasta ) == -1 );
		
		System.out.println( sumatoria( hasta ) );
		*/
		
		// System.out.println( numerosIntroducidos() );
		
		// System.out.println( eliminarEspacios("Hola mi nombre es lUcas Conde  ") );
		
		// System.out.println( convertUpperOrLower( "ke loco LA BIDA" , false ) );
		
		// System.out.println("Hola como estas".split("").length); // El string como cadena de texto no se puede usar directamente length
		
		// System.out.println( "Hola".equals( "Holsa" ) ); // Con .equals puedo comparar 2 cadenas
		
		System.out.println( cuartaQuinta( "Hola como estas todo bien" ) );

	}

}
