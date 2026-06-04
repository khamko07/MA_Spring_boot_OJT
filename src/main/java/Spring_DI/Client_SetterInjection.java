package Spring_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client_SetterInjection {

    private MessageService messageService;

    @Autowired
    public void setMessageService(@Qualifier("smsService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String msg, String receiver) {
        System.out.println("  -- [Setter Injection Client] --");
        messageService.sendMessage(msg, receiver);
    }
}
