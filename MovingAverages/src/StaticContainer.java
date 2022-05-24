
public class StaticContainer {

	static boolean used = false;
	static long minVal = 0; 
	static long maxVal = 0;
	
	public static long max() {
		return maxVal;
	}
	public static long min(){
		return minVal;
	}
}
