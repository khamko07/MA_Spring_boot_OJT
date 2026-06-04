package Spring_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Client_FieldInjection {

    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;

    public void processMessage(String msg, String receiver) {
        System.out.println("  -- [Field Injection Client] --");
        messageService.sendMessage(msg, receiver);
    }
}
