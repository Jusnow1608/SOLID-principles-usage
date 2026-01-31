package BusinessCalendar.Plugins;

public class EmailNotificationSystem implements NotificationDispatcher {
    public void dispatch(String message, String destination) {
        System.out.println("[Email System] " + "To: "+ destination+ ": " + message);
    }
}
