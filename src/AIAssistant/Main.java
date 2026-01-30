package AIAssistant;

public class Main {
    public static void main(String [] args){
    BusinessCoach businessCoach = new BusinessCoach();

    businessCoach.askQuestion("What should I do in case of...");
    businessCoach.generateWeeklyReport();
    businessCoach.learnUserPreferences("taxes");
    }
}
