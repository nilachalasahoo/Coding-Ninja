/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class
	int r,i;
	public ComplexNumbers(int x,int y){
		r=x;
		i=y;
	}
	public void plus(ComplexNumbers obj){
		r=r+obj.r;
		i=i+obj.i;
	}
	public void multiply(ComplexNumbers obj){
		int x=r*obj.r-(i*obj.i);
		int y=r*obj.i+obj.r*i;
		r=x;
		i=y;
	}
	public void print(){
		char sign='+';
		if(i<0){
			i=-1*i;
			sign='-';
		}
		System.out.print(r+" "+sign+" i"+i);
	}
}
