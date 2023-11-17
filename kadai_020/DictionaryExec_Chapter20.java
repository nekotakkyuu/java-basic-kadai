package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();

		String[] search = { "apple", "banana", "grape", "orange" };

		for (int i = 0; i < search.length; i++) {

			dictionary.dictionaryJudge(search[i]);

		}
	}

}
