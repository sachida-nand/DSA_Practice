package arrayTwoBasic;

public class TrappingRainWater {
	
	
	public static int trappingRainWater(int[] a) {
		int n = a.length;
		int[] l = new int[n];
		int[] r = new int[n];
		int waterTrap = 0;
		
		l[0] = a[0];
		r[n-1] = a[n-1];
		for(int i=1; i<n; i++) {
			l[i] = Math.max(a[i], l[i-1]);
		}
		
		for(int i=n-2; i>=0; i--) {
			r[i] = Math.max(a[i], r[i+1]);
		}
		
		for (int i=0; i<n; i++) {
			waterTrap += Math.min(l[i], r[i])-a[i];
		}
				
		return waterTrap;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		int water = trappingRainWater(arr);
		
		System.out.println(water);

	}

}
