import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
	}
	public static void editFile(String file_name) {
		Path path = Paths.get(file_name);
		Charset charset = StandardCharsets.UTF_8;
		String content = "";
		try {
			content = new String(Files.readAllBytes(path), charset);
			content = content.replaceAll("a", "");
			content = content.replaceAll("e", "");
			content = content.replaceAll("i", "");
			content = content.replaceAll("o", "");
			content = content.replaceAll("u", "");
			content = content.replaceAll("A", "");
			content = content.replaceAll("E", "");
			content = content.replaceAll("I", "");
			content = content.replaceAll("O", "");
			content = content.replaceAll("U", "");
			Files.write(path, content.getBytes(charset));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 	}
}