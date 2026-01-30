package MarketingPlanner;

public class AIStrategyInsight extends PlannerElement{

    public AIStrategyInsight(String content) {
        super(content);
    }

    @Override
    public void markAsDone() {
        throw new UnsupportedOperationException(
                "CRITICAL ERROR: AI Recommendation (" + title + ") doesn't have completion state!"
        );
    }

    @Override
    public void display() {
        System.out.println("[i] AI INSIGHT: " + title);
    }
}

