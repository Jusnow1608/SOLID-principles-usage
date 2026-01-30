package MarketingPlanner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){
        List<PlannerElement> todayPlanner = new ArrayList<>();

        todayPlanner.add(new MarketingTask("Buying domain .pl"));
        todayPlanner.add(new CalendarEvent("ZUS payment deadline", LocalDate.of(2026, 2, 10)));

        System.out.println("--- YOUR PLAN FOR TODAY ---");

        for(PlannerElement plannerElement: todayPlanner){
            plannerElement.display();
        }
        System.out.println("\n--- RUNNING: COMPLETE ALL ---");
        try {
            for (PlannerElement plannerElement : todayPlanner) {
                plannerElement.markAsDone();
            }
        } catch (Exception e) {
            System.err.println("Application stops to work!");
            System.err.println("Reason: " + e.getMessage());
        }

    }
}
