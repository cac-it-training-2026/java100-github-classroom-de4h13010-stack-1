/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)\n");

		System.out.println("シトロン	>");
		String sitoron = reader.readLine();
		int buysitoron = Integer.parseInt(sitoron);

		System.out.println("ショコラ	>");
		String syokora = reader.readLine();
		int buysyokora = Integer.parseInt(syokora);

		System.out.println("ピスターシュ	>");
		String pisutasyu = reader.readLine();
		int buypisutasyu = Integer.parseInt(pisutasyu);

		System.out.println("\nシトロン	" + buysitoron + "個");
		System.out.println("ショコラ	" + buysyokora + "個");
		System.out.println("ピスターシュ	" + buypisutasyu + "個\n");

		//先にそれぞれの計算を変数として作り入れるほうがきれい！
		//ex. int totalcount=(buy~~~)

		System.out.println("合計個数" + (buysitoron + buysyokora + buypisutasyu) + "個");
		System.out.println("合計金額" + (buysitoron * 250 + buysyokora * 280 + buypisutasyu * 320) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}
