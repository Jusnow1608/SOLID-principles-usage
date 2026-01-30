package MarketingPlanner;

abstract class PlannerElement {

    protected String title;

    public PlannerElement(String title) {
        this.title = title;
    }

    public abstract void markAsDone();
    public abstract void display();
}
