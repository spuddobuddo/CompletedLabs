import pkg.*;
import java.util.*;
import java.io.*;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) throws FileNotFoundException {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		// File file = new File("users.txt");
		// Scanner scan = new Scanner(file);
		// ArrayList<User> userList = new ArrayList<User>();
		
		// while(scan.hasNextLine())
		// {
			// String full = scan.nextLine();
			// String name = full.substring(0, full.indexOf(" "));
			// String pass = full.substring(full.indexOf(" ")+1, full.length());
			// userList.add(new User(name, pass));
		// }
		
		// for (int i = 0; i < userList.size(); i++)
		// {
			// System.out.println(userList.get(i));
		// }		

		Message bruh = new Message("henry", "subject", "body", 1);
		Message monke = new Message("bennett", "Re: subject", "body", 2);
		Message monke2 = new Message("rohin", "Re: subject2", "body2", 3);
		Message monke3 = new Message("liam", "Re: subject3", "body3", 4);
		bruh.addChild(monke);
		bruh.addChild(monke2);
		monke.addChild(monke3);
		bruh.print(0);
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
