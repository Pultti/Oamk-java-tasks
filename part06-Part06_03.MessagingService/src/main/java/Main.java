public class Main {

    public static void main(String[] args) {
        MessagingService myMessages = new MessagingService();

        Message firstMessage = new Message("Alice", "Hey there!");
        Message secondMessage = new Message("Bob", "Hi Alice, what's up?");
        Message thirdMessage = new Message("Alice", "All good, preparing for the weekend.");

        myMessages.add(firstMessage);
        myMessages.add(secondMessage);
        myMessages.add(thirdMessage);

        System.out.println(myMessages.getMessages());
    }
}
