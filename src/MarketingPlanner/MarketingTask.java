package MarketingPlanner;

public class MarketingTask extends PlannerElement{
    private boolean completed = false;

    public MarketingTask(String title) {
        super(title);
    }

    @Override
    public void markAsDone() {
        this.completed = true;
        System.out.println("SUCCESS: Task '" + title + "' marked as completed.");
    }

    @Override
    public void display() {
        System.out.println("[ " + (completed ? "X" : " ") + " ] Task: " + title);
    }
}
