package check;

public class Pet {
	//フィールド
    private String name;
    private String masterName;
    //コンストラクタ→インスタンス生成時に呼ばれる
    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }
    //現在のクラスとサブクラスからアクセス可能なアクセス修飾子。
    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}
//Petクラスを継承したRobotPetクラス（サブクラス）
class RobotPet extends Pet {
	//コンストラクタ
    public RobotPet(String name, String masterName) {
    	//スーパークラスのコンストラクタの呼び出し
    	//※サブクラスをインスタンス化する際は、明示的にスーパークラスのコンストラクタを呼び出す必要がある。
        super(name, masterName);
    }
    //introduceメソッドをオーバーライド（上書き）
    public void introduce() {

        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}