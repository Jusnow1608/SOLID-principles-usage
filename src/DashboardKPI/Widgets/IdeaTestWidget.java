package DashboardKPI.Widgets;

public class IdeaTestWidget implements DashboardWidget {
    @Override
    public void render() {
        System.out.println("Module: Idea Test");
        System.out.println("Activity: You have performed 3 Idea Tests this week.");
        System.out.println("Status: Highest potential found: 85% ('Mobile App' project).");
        System.out.println("Recommendation: Focus on your marketing plan now!");
    }
}
