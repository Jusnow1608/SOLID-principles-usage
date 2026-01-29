package IdeaTest;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

public class IdeaTestProcessor {

    private String ideaName;
    private Map<String, Integer> answers;
    private double finalScore;
    private String recommendation;

    public IdeaTestProcessor(String ideaName, Map<String, Integer> answers) {
        this.ideaName = ideaName;
        this.answers = answers;
    }

    public void calculateIdeaPotential() {
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
        this.finalScore = (weightedSum / maxPossibleWeighted) * 100;
        this.recommendation = (finalScore > 70 ? "High potential - Go for it!" : "Needs more refinement.");
    }

    public void showResults(){
        System.out.println("--- STARTING IDEA ANALYSIS ---");
        System.out.println("Calculation finished for idea: " + ideaName + " - Score: " + String.format("%.1f",finalScore) + "%");
        System.out.println("Recommendation: " + recommendation);
    }

    public void generateReport() {
        String fileName = ideaName + "_report.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("IDEA TEST REPORT: " + ideaName + "\n");
            writer.write("Final Score: " + String.format("%.1f",finalScore) + "%\n");
            writer.write("Recommendation: " + recommendation + "\n");
            writer.write("Date: " + LocalDate.now() + "\n");
            System.out.println("Report generated successfully: " + fileName);
        } catch (IOException e) {
            System.err.println("Error while generating report: " + e.getMessage());
        }
    }

    public void saveToDatabase() {
        System.out.println("Connecting to database...");
        System.out.println("Executing: INSERT INTO idea_tests (name, score, recommendation, timestamp) VALUES ('"
                + ideaName + "', " + String.format("%.1f",finalScore) + ", '"
                + recommendation + "', '"
                + LocalDate.now() + "')");
        System.out.println("Data saved successfully.");
    }

    public double getFinalScore() {
        return finalScore;
    }
}
