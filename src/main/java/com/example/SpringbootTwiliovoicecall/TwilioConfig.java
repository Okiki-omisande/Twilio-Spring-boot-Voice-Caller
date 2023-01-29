package com.example.SpringbootTwiliovoicecall;

import com.twilio.Twilio;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioConfig {
    public static String MY_ACCT_SID= "AC6398478828dcf8701e9cb410f05a7291";
    public static String MY_AUTH_TOKEN = "69006dfca6d645f3108c4c2e5a1bf8b6";
    public static String MY_TWILIO_PHONE_NUMBER = "+14632634373";
    public static String VC_RECEIVING_NUMBER = "+2347087870938";

    static {
        Twilio.init(MY_ACCT_SID,MY_AUTH_TOKEN);
    }
}
