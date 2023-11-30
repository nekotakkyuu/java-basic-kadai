package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	public String rock = "r";
	public String scissors = "s";
	public String paper = "p";

	public String mine;
	public String com;

	public String getMyChoice() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		while (true) {
			String input = scanner.next();

			if (rock.equals(input)) {
				mine = input;
				break;
			} else if (scissors.equals(input)) {
				mine = input;
				break;
			} else if (paper.equals(input)) {
				mine = input;
				break;
			} else {
				System.out.println("正しい手ではありません");
				System.out.println("再度自分のじゃんけんの手を入力しましょう");
			}
		}
		return mine;
	}

	public String getRandom() {

		String[] jyankenArray = new String[3];
		jyankenArray[0] = "r";
		jyankenArray[1] = "s";
		jyankenArray[2] = "p";

		int num = (int) Math.floor(Math.random() * (jyankenArray.length));

		com = jyankenArray[num];

		return com;

	}

	public void playGame(String mine, String com) {

		HashMap<String, String> jyankenPlay = new HashMap<String, String>();

		jyankenPlay.put("r", "グー");
		jyankenPlay.put("s", "チョキ");
		jyankenPlay.put("p", "パー");

		System.out.println("自分の手は" + jyankenPlay.get(mine) + ",対戦相手の手は" + jyankenPlay.get(this.com));

		if (mine.equals(com)) {
			System.out.println("あいこです");

		} else if ((mine.equals("r") && com.equals("p"))
				|| ((mine.equals("s") && (com.equals("r")) || ((mine.equals("p") && (com.equals("s"))))))) {
			System.out.println("自分の負けです");
		} else {
			System.out.println("自分の勝ちです");
		}
	}

}
