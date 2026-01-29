package DashboardKPI;

public class InternalStatistics {
    public void displayInternalStatistics (InternalModule internalModule){

        System.out.println("\nYOUR ACTIVITY SUMMARY");
        switch (internalModule) {
            case InternalModule.IDEATEST:
                System.out.println("Module: Idea Test");
                System.out.println("Activity: You have performed 3 Idea Tests this week.");
                System.out.println("Status: Highest potential found: 85% ('Mobile App' project).");
                System.out.println("Recommendation: Focus on your marketing plan now!");
                break;
            case InternalModule.AIASISTANT:
                System.out.println("Module: AI Assistant FAQ");
                System.out.println("Activity: You asked 12 questions to AI this week.");
                System.out.println("Top Topics: Marketing (6), Pricing (3), Legal (3).");
                System.out.println("Recommendation: Add these topics to your Marketing Planner.");
                break;
            case InternalModule.BUSINESSCALENDAR:
                System.out.println("Module: Business Calendar");
                System.out.println("Upcoming Tasks: 2 (VAT Settlement, CEIDG Update)");
                System.out.println("Status: 1 task overdue! Check your deadlines.");
                break;
            default: System.out.println("Status: No internal activity recorded today.");
                break;
        }
    }
}
