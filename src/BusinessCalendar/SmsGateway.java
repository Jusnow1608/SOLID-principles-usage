package BusinessCalendar;

public class SmsGateway {
    public void sendSms(String phone, String text) {
        System.out.println("[Sms Gateway] API token authorization... Sending to " + phone + ": " + text);
    }
}
