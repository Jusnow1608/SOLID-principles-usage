package BusinessCalendar.Plugins;

public class SmsGateway implements NotificationDispatcher {
    public void dispatch(String message, String destination) {
        System.out.println("[Sms Gateway] API token authorization... Sending to " + destination + ": " + message);
    }
}
