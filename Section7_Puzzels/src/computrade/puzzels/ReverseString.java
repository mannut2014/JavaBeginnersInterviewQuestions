package computrade.puzzels;

public class ReverseString {
	
	public String reverseStringBuilder(String source) {
	    int i, len = source.length();
	    StringBuilder dest = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        dest.append(source.charAt(i));
	    }

	    return dest.toString();
	}
	
	
	public  String reverseJava(String input){
		return new StringBuilder(input).reverse().toString();
	}
	
	
	
	// the most efficeint - go only on half of the char.
	public String reverseChar(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	
	public String  reverseStringRecursive(String input) {

	   return reverse(input, input.length()-1);
	}

	public String reverse(String stringToReverse, int index){
	    if(index == 0){
	        return stringToReverse.charAt(0) + "";
	    }

	    char letter = stringToReverse.charAt(index);
	    return letter + reverse(stringToReverse, index-1);
	}
	
	public static void main(String [] args){
		
		
		ReverseString rs = new ReverseString();
		
		System.out.println("Revers Java: " + rs.reverseJava("ABCDE"));
		System.out.println("Revers StringBuilder: " + rs.reverseStringBuilder("ABCDE"));
		System.out.println("Revers Char: " + rs.reverseChar("ABCDE"));
		System.out.println("Revers recursive: " + rs.reverseStringRecursive("ABCDE"));
		
	}
	
	

}