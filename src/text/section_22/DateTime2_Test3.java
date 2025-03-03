package text.section_22;

import java.time.LocalDateTime;

public class DateTime2_Test3 {

	public static void main(String[] args) {
		// 現在日時を取得する
		LocalDateTime datetime1 = LocalDateTime.now();
		//現在日時を出力する
		System.out.println(datetime1);
		
		//指定する日時を取得する
		LocalDateTime datetime2 = LocalDateTime.of(1999, 1, 2, 5, 10, 20);
		//指定する日時を出力する
		System.out.println(datetime2);

	}

}
