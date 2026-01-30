package MarketingPlanner;

import java.time.LocalDate;

public class CalendarEvent extends PlannerElement{

    private LocalDate date;
    private boolean confirmed = false;

    public CalendarEvent(String title, LocalDate date) {
        super(title);
        this.date = date;
    }

    @Override
    public void markAsDone() {
        this.confirmed = true;
        System.out.println("CONFIRMED: Date of '" + title + "' marked in calendar.");
    }

    @Override
    public void display() {
        System.out.println("[ " + (confirmed ? "V" : " ") + " ] CALENDAR (" + date + "): " + title);

    }
}
