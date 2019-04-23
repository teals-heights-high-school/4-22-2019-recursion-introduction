public class Run {
	public static void main(String[] args) {
		recursionOne(10);
		System.out.println();
		recursionTwo(10);
	}
	
	public static void recursionOne(int count) {
		System.out.println(count);
		if(count > 1) {
			recursionOne(count - 1);
		}
	}
	
	public static void recursionTwo(int count) {
		if(count > 1) {
			recursionTwo(count - 1);
		}
		System.out.println(count);
	}
}