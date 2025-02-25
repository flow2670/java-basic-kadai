package kadai_015;

public class Car_Chapter15 {
//フィールド
	private int gear = 1; //1速からの5速のギアを表す
	private int speed = 10; // 初期速度
	
	// コンストラクタ
	public Car_Chapter15() {
		// デフォルトのコンストラクタで特に処理は不要
	}
	
	// ギアを変更し速度を設定
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		this.speed = switch (this.gear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}
	
	// ギア変更後の速度を表示
	public void run() {
		System.out.println("ギア1から" + this.gear + "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
