package DashboardKPI.Widgets;

public class MarketingPlannerWidget implements DashboardWidget {
    @Override
    public void render() {
        System.out.println("Module: Marketing Planner");
        System.out.println("Campaign: 'Autumn Sale'");
        System.out.println("Progress: Posts: 5/10 | Emails: 2/4 | Ads: 0/3");
        System.out.println("Goal: 30 Sales | Status: In Progress");
    }
}
