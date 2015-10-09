package homework.hw2_inheritance_examples;

public class Restriction {

	static class Messenger extends VideoMessenger {

		@Override
		public void makeCall() {
			System.out.println("Calling person");
		}

		@Override
		public void sendVideoMessage() {
			System.out.println("Trying to send video message");
			throw new UnsupportedOperationException();
		}
	}

	static class VideoMessenger {

		public void makeCall() {
			System.out.println("Video conference call");
		}

		public void sendVideoMessage() {
			System.out.println("Send video message");
		}
	}

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.makeCall();
		messenger.sendVideoMessage();
	}
}
