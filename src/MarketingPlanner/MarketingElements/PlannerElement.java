package MarketingPlanner.MarketingElements;

public abstract class PlannerElement {

    protected String title;

    public PlannerElement(String title) {
        this.title = title;
    }

    public abstract void display();
}
