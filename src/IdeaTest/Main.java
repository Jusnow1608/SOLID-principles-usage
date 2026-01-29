package IdeaTest;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> answers = new HashMap<>();
        answers.put("Do you know your target audience?", 3);
        answers.put("Does your product solve a real problem?", 4);
        answers.put("Is the market size sufficient?", 3);
        answers.put("Do you know your competition?", 5);
        answers.put("Do you have a starting budget?", 5);

        IdeaTestProcessor ideaTestProcessor = new IdeaTestProcessor();
        ideaTestProcessor.processIdeaTest("Personal trainer", answers);

    }
}
