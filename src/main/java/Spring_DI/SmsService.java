package Spring_DI;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SmsService implements MessageService {
    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("    [SmsService] Gui tin nhan toi " + receiver + " voi noi dung: " + msg);
    }
}
