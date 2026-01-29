package DashboardKPI.Widgets;

public class GoogleAdsWidget implements DashboardWidget {
    @Override
    public void render() {
        double clicks = 1250.0;
        double spend = 300.0;
        System.out.println("Source: Google Ads");
        System.out.println("Clicks = " + clicks + ", Spend = " + spend + " PLN");
    }
}
