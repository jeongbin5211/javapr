package 프로그래밍언어응용;

public class Ex2_Array {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1, 3, 4, 25, 124, 41 ,2};
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}

	}

}
