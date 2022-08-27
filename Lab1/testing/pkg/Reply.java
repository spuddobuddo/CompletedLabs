package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {
	
	private String subject;
	private String body;
	private int id;
	private String author;
	private ArrayList<Message> childList;

	// Default Constructor
	public Reply() {
		super();
	}

	// Parameterized Constructor
	public Reply(String auth, String subj, String bod, int i) {
		super(auth, subj, bod, i);
	}

	public boolean isReply(){
		return true;
	}
	
}
