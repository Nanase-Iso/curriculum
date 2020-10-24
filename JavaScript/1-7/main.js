class Taiyaki {
    //コンストラクタ
    constructor(taste) {
        this.taste = taste;
    }
    talk() {
        console.log('中身は' + this.taste + 'です');
    }

}
//インスタンス化（名前をつけて保存）
let anko = new Taiyaki('あんこ');
anko.talk();
let cream = new Taiyaki('クリーム');
cream.talk();
let cheese = new Taiyaki('チーズ');
cheese.talk();
