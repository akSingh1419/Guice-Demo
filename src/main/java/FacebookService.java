public class FacebookService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String recipient) {
        // Some code to send facebook message
        System.out.println("Facebook Message sent to " + recipient + "with message = " + msg);
        return true;
    }
}
