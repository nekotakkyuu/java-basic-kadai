package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	HashMap<String, String> fruitsName = new HashMap<String, String>();

	public String name = "";

	public void dictionaryJudge(String n) {

		name = n;
		fruitsName.put("apple", "りんご");
		fruitsName.put("peach", "桃");
		fruitsName.put("banana", "バナナ");
		fruitsName.put("lemon", "レモン");
		fruitsName.put("pear", "梨");
		fruitsName.put("kiwi", "キウィ");
		fruitsName.put("strawberry", "いちご");
		fruitsName.put("grape", "ぶどう");
		fruitsName.put("muscat", "マスカット");
		fruitsName.put("cherry", "さくらんぼ");

		if (fruitsName.containsKey(n)) {
			System.out.println(n + "の意味は" + fruitsName.get(n));
		} else {
			System.out.println(n + "は辞書に存在しません");

		}

	}

}
