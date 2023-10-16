
class program1 {

	public static void main(String[] args) {
		
		add(200, 250);
		calculatePersentage(85,95,35,75);
		checkPositiveAndNegativeNumber(20);
		checkEvenOrOdd(17);
		calculateAreaOfCircle(15);
		

	}

	private static void add(int i, int j) {
		
		int sum = i+j;
		System.out.println(sum);
		
	}

	private static void calculatePersentage(int i, int j, int k, int l) {
		
		int total = i+j+k+l;
		float per = total/400.0f*100.0f;
		System.out.println(per);
		
	}

	private static void checkPositiveAndNegativeNumber(int i) {
		
		if(i<0) {
			System.out.println("Negative Number");
	
		}
		if(i>=0) {
			System.out.println("positive Number");
		}
	}

	private static void checkEvenOrOdd(int i) {
		
		if(i%2==0) {
			System.out.println("Even number");
		}
		if(i%2 != 0) {
			System.out.println("Odd Number");
		}
	}

	private static void calculateAreaOfCircle(int i) {
		
		float area = 3.14f * i*i;
		
	}

}
