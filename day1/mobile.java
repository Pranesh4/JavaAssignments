package week1.day1;

public class mobile {
	public void sendMessage() {
		System.out.println("sendMessage");
	}
public void shareDocument() {
	System.out.println("shareDocument");
}
public void makeCall(){
	System.out.println("makeCall");
}
public static void main(String[] args) {
   mobile iphone =new mobile();
   iphone.sendMessage();
   iphone.shareDocument();
   iphone.makeCall();
}
}
