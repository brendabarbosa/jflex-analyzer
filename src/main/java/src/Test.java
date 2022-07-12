package src;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Test {
	
	public static void main(String[] args) throws IOException{
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/main/java/src/";
		Path file = Path.of(rootPath + subPath +"text.txt");
		String text = Files.readString(file, StandardCharsets.ISO_8859_1); 
		Analyzer lexical = new Analyzer(new StringReader(text));
		lexical.yylex();
	}

}
