import pkg.*;
import java.util.*;
import java.io.*;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) throws FileNotFoundException {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		File file = new File("users.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine())
		{
			String full = scan.nextLine();
			String name = full.substring(0, full.indexOf(" "));
			String pass = full.substring(full.indexOf(" ")+1, full.length());
			System.out.print(name+" ");
			System.out.println(pass);
		}
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
