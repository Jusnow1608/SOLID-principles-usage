package AIAssistant;

public class SimpleHelpBot implements FullAIAssistant{
    @Override
    public void askQuestion(String query) {
        System.out.println("HelpBot: To login, write your email...");
    }

    @Override
    public void generateWeeklyReport() {
        throw new UnsupportedOperationException("This bot doesn't have an access to statistics.");
    }

    @Override
    public void learnUserPreferences(String topic) {
        throw new UnsupportedOperationException("This bot doesn't have a preferences database.");
    }
}
