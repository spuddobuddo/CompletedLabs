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
		
		// while(scan.hasNext())
		// {
			// String full = scan.nextLine();
			// String name = full.substring(0, full.indexOf(" "));
			// String pass = full.substring(full.indexOf(" ")+1, full.length());
			// userList.add(new User(name, pass));
		// }
		
		// for (int i = 0; i < userList.size(); i++)
		// {
			// System.out.println(userList.get(i).getUsername());
			// System.out.println(userList.get(i).getPword());
		// }		

		// Topic bruh = new Topic("henry", "subject", "body", 1);
		// Reply monke = new Reply("bennett", "Re: subject", "body", 2);
		// Reply monke2 = new Reply("rohin", "Re: subject2", "body2", 3);
		// Reply monke3 = new Reply("liam", "Re: subject3", "body3", 4);
		
		// ArrayList<Message> list = new ArrayList<Message>();
		// list.add(bruh);
		// list.add(monke);
		// list.add(monke2);
		// list.add(monke3);
		
		// list.get(0).addChild(list.get(1));
		// list.get(0).addChild(list.get(2));
		// list.get(1).addChild(list.get(3));
		// list.get(0).print(0);
		
		BBoard myBoard = new BBoard("Gaming BBoard");          // Feel free to change the name.
        myBoard.loadUsers("users.txt");
        myBoard.run();
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
