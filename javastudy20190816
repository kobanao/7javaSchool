public class Sample1 {
	public static void main(String[] args) {
		System.out.println("「配列」");
		
//変数
//		int num = 3; //ローカル変数：int num
//int型の変数numを宣言し、値3で初期化する

//配列 複数型(～sを付ける)にする
		int[] nums = new int[3];
//int型の配列変数numsを宣言し、要素数3の配列を用意する

//配列に値の格納
		nums[0] = 10;
		nums[1] = 11;
		nums[2] = 12;

//格納した値を取得(取り出す)
		for(int i = 0; i < nums.length; i++){
			System.out.println(i + "：" + nums[i]); //i：0, 1, 2
		}

//String型の配列
		String[] names = new String[3];

		names[0] = "なお";
		names[1] = "なお";
		names[2] = "なお";
		
		for(int i = 0; i < names.length; i++){
			System.out.println(i+1 + "人目の名前：" + names[i]); //i：0, 1, 2
		}
		
		System.out.println("\n拡張for文");
		
		for (int num : nums){ //ブロック変数：int num
			System.out.println(num);
		}
	}
}

/*
C:\javastudy20190816\array>java Sample1.java
「配列」
0：10
1：11
2：12
1人目の名前：なお
2人目の名前：なお
3人目の名前：なお
*/
