package MarketingPlanner;

import MarketingPlanner.MarketingElements.AIStrategyInsight;
import MarketingPlanner.MarketingElements.CalendarEvent;
import MarketingPlanner.MarketingElements.MarketingTask;
import MarketingPlanner.MarketingElements.PlannerElement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){
        List<PlannerElement> todayPlanner = new ArrayList<>();

       MarketingTask marketingTask = new MarketingTask("Buying domain .pl");
       CalendarEvent calendarEvent =  new CalendarEvent("ZUS payment deadline", LocalDate.of(2026, 2, 10));
       AIStrategyInsight aIStrategyInsight = new AIStrategyInsight("Focus on marketing on LinkedIn");

        todayPlanner.add(marketingTask);
        todayPlanner.add(calendarEvent);
        todayPlanner.add(aIStrategyInsight);

        System.out.println("--- YOUR PLAN FOR TODAY ---");

        for(PlannerElement plannerElement: todayPlanner){
            plannerElement.display();
        }

        List<Actionable> actionableItems = new ArrayList<>();
        actionableItems.add(marketingTask);
        actionableItems.add(calendarEvent);


        System.out.println("\n--- RUNNING: COMPLETE ALL ---");
            for (Actionable actionableItem : actionableItems) {
                actionableItem.markAsDone();
            }
    }
}
