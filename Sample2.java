public class Sample2 {
	public static void main(String[] args) {
		System.out.println("P196 値渡しと参照渡し");
		
		//変数メソッド→値渡し
		int num = 1;
		System.out.println("変数メソッド\nbefore：" + num);
		showNums(num); //実引数
		System.out.println("after：" + num);
		
		//配列メソッド→参照渡し
		int[] nums = { 1, 2, 3 };
		showNums(nums); //実引数
	
	}
	private static void showNums(int num) { //仮引数 変数メソッド
		num = 11;
	}
	private static void showNums(int[] nums) { //仮引数 配列メソッド
		System.out.println("\n配列メソッド\nbefore：");
		for(int num : nums) {
			System.out.println(num);
		}
		
		nums[0] = 11;
		
		System.out.println("\nafter：");
		for(int num : nums) {
			System.out.println(num);
		}
	}
	
}
