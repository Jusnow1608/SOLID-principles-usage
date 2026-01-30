package AIAssistant;

import AIAssistant.Assistants.BusinessCoach;
import AIAssistant.Assistants.SimpleHelpBot;

public class Main {
    public static void main(String [] args){
    BusinessCoach businessCoach = new BusinessCoach();

    businessCoach.askQuestion("What should I do in case of...");
    businessCoach.generateWeeklyReport();
    businessCoach.learnUserPreferences("taxes");
    System.out.println("---");

    SimpleHelpBot simpleHelpBot = new SimpleHelpBot();

    simpleHelpBot.askQuestion("How can I login to application?");
    }
}
