package BusinessCalendar;

import BusinessCalendar.Plugins.EmailNotificationSystem;
import BusinessCalendar.Plugins.GoogleCalendarClient;
import BusinessCalendar.Plugins.LocalSQLDatabase;
import BusinessCalendar.Plugins.SmsGateway;

import java.util.List;

public class Main {
    public static void main (String [] args){
        CalendarManager emailCalendarManager = new CalendarManager(List.of(new LocalSQLDatabase()),
                new EmailNotificationSystem());
        emailCalendarManager.processDailyCalendar("emailaddress@gmail.pl");

        CalendarManager smsCalendarManager = new CalendarManager(List.of(new GoogleCalendarClient()),
                new SmsGateway());
        smsCalendarManager.processDailyCalendar("500 500 500");
    }
}
