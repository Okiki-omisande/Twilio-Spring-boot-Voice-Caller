package com.example.SpringbootTwiliovoicecall;

import com.twilio.Twilio;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioConfig {
    public static String MY_ACCT_SID= "";
    public static String MY_AUTH_TOKEN = "";
    public static String MY_TWILIO_PHONE_NUMBER = "";
    public static String VOICE_CALL_RECEIVING_NUMBER = "";

    static {
        Twilio.init(MY_ACCT_SID,MY_AUTH_TOKEN);
    }
}
