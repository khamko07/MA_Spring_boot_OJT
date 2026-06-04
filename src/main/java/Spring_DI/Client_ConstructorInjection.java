package Spring_DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client_ConstructorInjection {

    private final MessageService messageService;

    public Client_ConstructorInjection(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String msg, String receiver) {
        System.out.println("  -- [Constructor Injection Client] --");
        messageService.sendMessage(msg, receiver);
    }
}
