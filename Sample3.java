package calcapp.main;
//import calcapp.logics.calcLogic;

public class Sample3 {
	public static void main(String[] args) {
		System.out.println("P223「計算機プログラム」");
		
		int a = 10; int b = 1;
		int total = calcLogic.tasu(a, b);
		int delta = calcLogic.hiku(a, b);
		System.out.println("足すと" + total + "\n引くと" + delta);
	}/*
	public static int tasu(int a,  int b) {
		return (a + b);
	}
	public static int hiku(int a,  int b) {
		return (a - b);
	}
	*/
}

class calcLogic {
	public static int tasu(int a,  int b) {
		return (a + b);
	}
	public static int hiku(int a,  int b) {
		return (a - b);
	}
}
