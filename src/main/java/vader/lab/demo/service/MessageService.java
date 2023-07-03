package vader.lab.demo.service;

import org.springframework.stereotype.Component;
import lombok.NonNull;
import vader.lab.demo.dto.MessageDto;

@Component
public class MessageService {
    public MessageDto getSubscriptionMessage(@NonNull String user) {

        MessageDto message = new MessageDto();
        message.setId(Long.valueOf(1));
        message.setMessage("Hello "+user+", Thanks for the subscription!");

        return message;
    }
}
