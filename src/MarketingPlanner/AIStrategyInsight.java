package MarketingPlanner;

public class AIStrategyInsight extends PlannerElement{

    public AIStrategyInsight(String content) {
        super(content);
    }

    @Override
    public void display() {
        System.out.println("[i] AI INSIGHT: " + title);
    }
}

