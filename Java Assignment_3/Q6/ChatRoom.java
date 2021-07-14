package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatRoom {

	private List<User> ulist= new ArrayList<>();
	private List<Message > chatRoom = new ArrayList<>();

	public void addUser(User u) {
		this.ulist.add(u);
	}
	public void getUsers() {
		for(User e : this.ulist) {
			System.out.println(e);
		}
	}
	public boolean isUserValidated(User u) {
		if(this.ulist.contains(u)) {
			return true;
		}
		else {
			return false;
		}
	}
	public void addMessage(User u,String msg) {
  		Scanner m1= new Scanner(System.in);
  		 msg = m1.nextLine();
		this.chatRoom.add(new Message(u,msg));
		
	}
	public void getChat() {
		for(Message element : chatRoom) {
			System.out.println(element);	
		}	
	}
	public void clearChat() {
		this.chatRoom.clear();
	}
}
