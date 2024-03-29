
public class BitWiseRotate {
	
	public static void rotateRightBy2Bits(int s[]) {
		
		int s2[] = new int[s.length];
		
		System.out.println("Original say: ");
		
		//print decimal number
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ " ");
		}
		
		System.out.println("\n\nOriginal say showing 32 bit binary value: ");
	
		//print binary number 
		for (int i = 0; i < s.length; i++) {
			System.out.print(String.format("%32s", Integer.toBinaryString(s[i])).replace(' ', '0')+ " ");
		}
		
		
		for (int i = 1; i < s.length; i++) {
			
			int lastTwoBits = s[i - 1] & 0b11;  // when i = 1, then s[i -1] = 0 
//			Binary value
//			00000000000000000000000000000010
//			10
		
			s2[i] = s[i] >> 2;
			
//			Binary value 
//			000000000000000000000000000010
			
			s2[i] = (s2[i]) | lastTwoBits << 30;	
			
//			Binary value 
//			100000000000000000000000000010 == 11 
		}
		
		int lastTwoBits = s[s.length - 1] & 0b11;
		
		s2[0] = s[0] >> 2;
		s2[0] = (s2[0]) | lastTwoBits << 30;
	
		System.out.println("\n\nAfter rotation say showing 32 bit binary value: ");
		
		for (int i = 0; i < s2.length; i++) {
			System.out.print(String.format("%32s", Integer.toBinaryString(s2[i])).replace(' ', '0')+ " ");
		}
		
		System.out.println("\n\nAfter rotation say: ");
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		
		
		int s[] = {10, 11, 12, 13};
				  //0   1   2   3	
			       
		rotateRightBy2Bits(s);
		
	}
	
}
