package BusinessCalendar.Plugins;

public interface NotificationDispatcher {

    void dispatch(String message, String destination);
}
