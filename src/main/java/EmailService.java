public class EmailService implements MessageService {
    @Override
    public boolean sendMessage(String msg, String recipient) {
        // Some code to send mail
        System.out.println("Email Message sent to " + recipient + "with message = " + msg);
        return true;
    }
}
