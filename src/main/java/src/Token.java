package src;

public class Token {

	private int line;
	private String text;
	private String type;
	
	public Token(int line, String text, String type) {
		this.line = line+1;
		this.text = text;
		this.type = type;
	}
	
	public int getLine() {
		return line;
	}
	
	public String getText() {
		return text;
	}

	public String getType() {
		return type;
	}


}
