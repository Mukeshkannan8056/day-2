package week1.day2;

public class mobile {
	public void sendMessage() {
		String sendMessage = "Hi How you are Doing";
		System.out.println("SendMessage:"+sendMessage);
	}
	public void shareDocument() {
		String pdfDocument ="Resume";
		System.out.println("pdfDocument:"+pdfDocument);
	}
    public void call() {
    	String callFriend = "Dass";
    	System.out.println("Call Friend:"+callFriend);
    }
    public static void main(String[] args) {
		mobile calling = new mobile();
		calling.sendMessage();
	}
}