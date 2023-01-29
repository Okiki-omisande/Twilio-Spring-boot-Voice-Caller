package com.example.SpringbootTwiliovoicecall;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
public class AppRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Call.creator(new PhoneNumber(TwilioConfig.VC_RECEIVING_NUMBER),
                new PhoneNumber(TwilioConfig.MY_TWILIO_PHONE_NUMBER),
                new URI("http://demo.twilio.com/docs/voice.xml")).create();
    }
}
