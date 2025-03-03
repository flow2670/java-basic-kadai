package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test1 {

	public static void main(String[] args) {
		// 現在の日付を取得する
		LocalDate date1 = LocalDate.now();
		//現在の日付を出力する
		System.out.println(date1);
		
		//指定する日付を取得する
		LocalDate date2 = LocalDate.of(1999, 1, 2);
		//指定する日付を出力する
		System.out.println(date2);

	}

}
