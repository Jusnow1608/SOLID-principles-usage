package DashboardKPI.Widgets;

public class AIAssistantWidget implements DashboardWidget {
    @Override
    public void render() {
        System.out.println("Module: AI Assistant FAQ");
        System.out.println("Activity: You asked 12 questions to AI this week.");
        System.out.println("Top Topics: Marketing (6), Pricing (3), Legal (3).");
        System.out.println("Recommendation: Add these topics to your Marketing Planner.");
    }
}
