package AIAssistant.Assistants;

import AIAssistant.Services.AnalyticsService;
import AIAssistant.Services.ChatService;
import AIAssistant.Services.LearningService;

public class BusinessCoach implements ChatService, AnalyticsService, LearningService {

    @Override
    public void askQuestion(String query) {
        System.out.println("AI Coach: Based on your path I suggest...");
    }

    @Override
    public void generateWeeklyReport() {
        System.out.println("AI Coach: I generate report...This week you asked mostly about taxes.");
    }

    @Override
    public void learnUserPreferences(String topic) {
        System.out.println("AI Coach: I remember that you are interested in topic: " + topic);
    }
}
