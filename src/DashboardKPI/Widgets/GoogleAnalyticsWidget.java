package DashboardKPI.Widgets;

public class GoogleAnalyticsWidget implements DashboardWidget {
    @Override
    public void render() {
        int sessions = 5000;
        System.out.println("Source: Google Analytics");
        System.out.println("Sessions = " + sessions);
    }
}
