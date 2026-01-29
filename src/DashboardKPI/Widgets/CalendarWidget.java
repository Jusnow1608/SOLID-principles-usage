package DashboardKPI.Widgets;

public class CalendarWidget implements DashboardWidget {
    @Override
    public void render() {
        System.out.println("Module: Business Calendar");
        System.out.println("Upcoming Tasks: 2 (VAT Settlement, CEIDG Update)");
        System.out.println("Status: 1 task overdue! Check your deadlines.");
    }
}
