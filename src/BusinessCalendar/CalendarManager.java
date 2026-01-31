package BusinessCalendar;

public class CalendarManager {
    private EmailNotificationSystem emailNotificationSystem = new EmailNotificationSystem();
    private LocalSQLDatabase localSQLDatabase = new LocalSQLDatabase();

    public void processDailyCalendar() {
        String task = localSQLDatabase.getFormalities();
        System.out.println("Taken from database: " + task);
        emailNotificationSystem.send("Task reminder: " + task);
    }
}
