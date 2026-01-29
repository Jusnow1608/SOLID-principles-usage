package IdeaTest;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String [] args){

        Map<String, Integer> answers = new HashMap<>();
        answers.put("Do you know your target audience?", 3);
        answers.put("Does your product solve a real problem?", 4);
        answers.put("Do you know your competition?", 5);
        answers.put("Do you have a starting budget?", 5);

        IdeaTestProcessor ideaTestProcessor = new IdeaTestProcessor("Online shop with homemade cakes", answers);

        ideaTestProcessor.calculateIdeaPotential();
        ideaTestProcessor.showResults();
        ideaTestProcessor.saveToDatabase();
        ideaTestProcessor.generateReport();
    }
}
