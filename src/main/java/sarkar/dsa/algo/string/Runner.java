package sarkar.dsa.algo.string;

public class Runner {

	public static void main(String[] args) {
		String text = "bbabccccabbbbcbabcaaa";
		String str = "abc";

		System.out.println(NaiveStringMatcher.findWord(text, str));
	}

}
