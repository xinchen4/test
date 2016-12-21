package hash;

public class Word {
	public static final int LETTERS=26;
	public static final int WORDS=LETTERS*LETTERS;
	private String word;
	public int hashCode(){
		return LETTERS*(word.charAt(0)-'a')+(word.charAt(1)-'a');
	}
	public Word(String word) {
		super();
		this.word = word;
	}
	

}
