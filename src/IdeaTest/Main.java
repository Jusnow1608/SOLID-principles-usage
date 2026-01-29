package IdeaTest;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String [] args){

        Map<String, Integer> answers = new HashMap<>();
        answers.put("Do you know your target audience?", 5);
        answers.put("Does your product solve a real problem?", 4);
        answers.put("Do you know your competition?", 2);
        answers.put("Do you have a starting budget?", 3);

        IdeaTestProcessor ideaTestProcessor = new IdeaTestProcessor("Online Copywriting Course Platform", answers);

        ideaTestProcessor.calculateIdeaPotential();
        ideaTestProcessor.saveToDatabase();
        ideaTestProcessor.generateReport();
    }
}
