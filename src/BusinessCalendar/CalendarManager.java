package BusinessCalendar;

public class CalendarManager {
    private EmailNotificationSystem emailNotificationSystem;
    private LocalSQLDatabase localSQLDatabase;
    private GoogleCalendarClient googleCalendarClient;
    private SmsGateway smsGateway;

    public CalendarManager() {
        this.emailNotificationSystem = new EmailNotificationSystem();
        this.localSQLDatabase  = new LocalSQLDatabase();
        this.googleCalendarClient = new GoogleCalendarClient();
        this.smsGateway = new SmsGateway();
    }

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
