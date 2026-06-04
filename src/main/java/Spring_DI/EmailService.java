package Spring_DI;

import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("    [EmailService] Gui email toi " + receiver + " voi noi dung: " + msg);
    }
}
