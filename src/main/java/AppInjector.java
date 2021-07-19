import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {
    @Override
    protected void configure() {
//        bind Message Service Class to EmailService Class Implementation
//        bind(MessageService.class).to(EmailService.class);

//        bind Message Service Class to FacebookService Class Implementation
        bind(MessageService.class).to(FacebookService.class);
    }
}
