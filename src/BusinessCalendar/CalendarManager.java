package BusinessCalendar;

public class CalendarManager {
    private EmailNotificationSystem emailNotificationSystem = new EmailNotificationSystem();
    private LocalSQLDatabase localSQLDatabase = new LocalSQLDatabase();
    private GoogleCalendarClient googleCalendarClient = new GoogleCalendarClient();
    private SmsGateway smsGateway = new SmsGateway();

    public void processDailyCalendar(String contactInfo) {
        String sqlTask = localSQLDatabase.getFormalities();
        System.out.println("Taken from SQL database: " + sqlTask);
        emailNotificationSystem.sendEmail("Task reminder: " + sqlTask);

        System.out.println("---------------------------");

        String googleEvent = googleCalendarClient.fetchRemoteEvents();
        System.out.println("Taken from Google: " + googleEvent);
        smsGateway.sendSms(contactInfo, "Event reminder: " + googleEvent);


    }
}
