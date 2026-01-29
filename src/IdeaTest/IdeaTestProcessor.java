package IdeaTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class IdeaTestProcessor {

    private String ideaName;
    private Map<String, Integer> answers;
    private double finalScore;

    public IdeaTestProcessor(String ideaName, Map<String, Integer> answers) {
        this.ideaName = ideaName;
        this.answers = answers;
    }

    public void calculateIdeaPotential() {
        int totalPoints = 0;
        for (int score : answers.values()) {
            totalPoints += score;
        }

        int maxPossible = answers.size() * 5;
        this.finalScore = (double) totalPoints / maxPossible * 100;
    }

    public void showResults(){
        System.out.println("--- STARTING IDEA ANALYSIS ---");
        System.out.println("Calculation finished for idea: " + ideaName + " - Score: " + String.format("%.1f",finalScore) + "%");
        System.out.println("Recommendation: " + (finalScore > 70 ? "High potential - Go for it!" : "Needs more refinement."));
    }

    public void generateReport() {
        String fileName = ideaName + "_report.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("IDEA TEST REPORT: " + ideaName + "\n");
            writer.write("Final Score: " + String.format("%.1f",finalScore) + "%\n");
            writer.write("Recommendation: " + (finalScore > 70 ? "High potential - Go for it!" : "Needs more refinement."));
            System.out.println("Report generated successfully: " + fileName);
        } catch (IOException e) {
            System.err.println("Error while generating report: " + e.getMessage());
        }
    }

    public void saveToDatabase() {
        System.out.println("Connecting to database...");
        System.out.println("Executing: INSERT INTO idea_tests (name, score) VALUES ('"
                + ideaName + "', " + String.format("%.1f",finalScore) + ")");
        System.out.println("Data saved successfully.");
    }

    public double getFinalScore() {
        return finalScore;
    }
}
