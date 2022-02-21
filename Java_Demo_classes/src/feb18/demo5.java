package feb18;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class main
{
	public static void findFile() {
		try {
		File newFile = new File("test.txt");
		FileInputStream st = new FileInputStream(newFile);
		}catch(FileNotFoundException f) {
			System.out.println(f);
		}
}}
public class demo5 {
	
		public static void main(String[] args) {
		main.findFile();
		System.out.println("print");
		}
}
