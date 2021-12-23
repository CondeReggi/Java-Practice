
public class Second {
	
	/*
	Complete the function that accepts a string parameter, and reverses each word in the string. 
	All spaces in the string should be retained.
	*/
	
	public static String reverseWords(final String original){
	  String[] arr  = original.split(" ");
	    
	  if ( arr.length == 0 ) {
	    return original;
	  }
	    
	  String resultado = ""; 
	    
	  for ( String word : arr ) {
	    StringBuilder input = new StringBuilder();
	    resultado += input.append(word).reverse().toString() + " ";
	  }
	    
	  return resultado.trim();
	}

	/*
	 A square of squares
	You like building blocks. You especially like building blocks that are squares. And what you even like more, 
	is to arrange them into a square of square building blocks!

	However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! 
	Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! 
	You just have to check if your number of building blocks is a perfect square.
	*/
	
	public static boolean isSquare(int n) {        
	      
	      if ( n < 0 ) {
	        return false;
	      }
	      
	      Double raiz = Math.sqrt( n );
	      
	      if ( raiz % 1 == 0 ){
	        return true;
	      }else{
	        return false;
	      }
	            
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
