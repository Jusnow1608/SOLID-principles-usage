package AIAssistant.Assistants;

import AIAssistant.Services.ChatService;

public class SimpleHelpBot implements ChatService {
    @Override
    public void askQuestion(String query) {
        System.out.println("HelpBot: To login, write your email...");
    }
}
