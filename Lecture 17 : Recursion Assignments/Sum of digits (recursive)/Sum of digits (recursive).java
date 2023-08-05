
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
		if(input<10)
			return input;
		return input%10+sumOfDigits(input/10);

	}
}
