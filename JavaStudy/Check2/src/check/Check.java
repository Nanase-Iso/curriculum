package check;
//Conctantsクラスをインポート
import constants.Constants;
//Checkクラス
public class Check {
	//フィールド(このクラス内でのみ使用可能。)
	private static String firstName = "磯";
	private static String lastName = "七瀬";
	//メソッド
	private static void printName() {
		System.out.println("printNameメソッド →" + firstName + lastName);
	}

	public static void main(String[]args) {

		//printNameメソッドの呼び出し
		Check.printName();
		//Petクラスのインスタンス生成、Petクラス型の変数petに保持する
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		//Petクラスのintroduceメソッドの呼び出し
		pet.introduce();
		//RobotPetクラスのインスタンス生成、RobotPetクラス型の変数rpに保持する
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		//RobotPetクラスのintroduceメソッドの呼び出し
		rp.introduce();

	}

}
