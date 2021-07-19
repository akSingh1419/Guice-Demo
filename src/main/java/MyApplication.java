import javax.inject.Inject;

public class MyApplication {
    private MessageService messageService;

    @Inject
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean sendMessage(String msg, String recipient) {
        return messageService.sendMessage(msg, recipient);
    }
}
