package IdeaTest;

import java.util.Map;

public class IdeaScorer {

    public IdeaScorer() {
    }

    public double calculateIdeaPotential(Map <String, Integer> answers) {
        double weightedSum = 0;
        double maxPossibleWeighted = 0;

        for (Map.Entry<String, Integer> entry : answers.entrySet()) {
            String question = entry.getKey();
            int score = entry.getValue();
            int weight = 1;
            if (question.toLowerCase().contains("market") || question.toLowerCase().contains("target")) {
                weight = 3;
            }
            weightedSum += (score * weight);
            maxPossibleWeighted += (5 * weight);
        }
        return (weightedSum / maxPossibleWeighted) * 100;
    }

    public String getRecommendation(double finalScore) {
        return (finalScore > 70 ? "High potential - Go for it!" : "Needs more refinement.");
    }
}
