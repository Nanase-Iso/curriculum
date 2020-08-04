package Lesson_java;

public class Lesson_1 {

	public static void main(String[] args) {
		//練習問題1-1
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println(c);
		//練習問題1-2
		boolean result = true;
		String kanzi = "駆";
		double pi = 3.14;
		long number = 314159265835979L;
		String msg = "ミナトの攻撃！敵に15Pのダメージを与えた！";
		System.out.println(result);
		System.out.println(kanzi);
		System.out.println(pi);
		System.out.println(number);
		System.out.println(msg);
		//練習問題2-1
		int x = 5;
		int y = 10;
		//文字列の中にオペランドを含むとその他の値も文字列に変換されてしまうため、()で囲む。
		String ansu = "xとyは" + (x + y);
		System.out.println(ansu);
		//練習問題3-1
		//(weight == 60)
		//((age1 + age2) * 2 > 60)
		//(age %3)
		//(name.equals("湊"))
		//練習問題3-3
		int seibetsu = 0;
		int age = 26;
		System.out.println("こんにちは");
		if (seibetsu == 0) {
			System.out.println("私は男です");
		} else {
			System.out.println("私は女です");
		}
		if(seibetsu == 0) {
			System.out.println(age + "歳です。");
			System.out.println("よろしくお願いします。");
		}
		//練習問題3-4
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		}else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}
		//練習問題3-5
		System.out.print
		("[メニュー] 1：検索 2：登録 3：削除 4：変更＞");

		//int selected = new java.util.Scanner (System.in).nextInt();
		int selected = 2;
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
			default:
				System.out.println("エラーです");

		}
		//練習問題3-6
		System.out.println("数当てゲーム");
		int ans = new java.util.Random().nextInt(10);
		for(int i = 0; i < 5; i++ ) {
			System.out.println("画面に0～9の数字を入力してください。");
			int num = 5;
			if(num == ans) {
				System.out.println("アタリ！");
			}else{
				System.out.println("違います。");
			}

		}
				System.out.println("ゲームを終了します。");

	}

}
