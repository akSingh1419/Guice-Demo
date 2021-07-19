public class MockMessageService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String recipient) {
        return true;
    }
}
