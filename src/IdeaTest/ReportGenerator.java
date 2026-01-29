package IdeaTest;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class ReportGenerator {

    public ReportGenerator() {
    }

    public void printToConsole(String ideaName, double finalScore, String recommendation){
        System.out.println("--- STARTING IDEA ANALYSIS ---");
        System.out.println("Calculation finished for idea: " + ideaName + " - Score: " + String.format("%.1f",finalScore) + "%");
        System.out.println("Recommendation: " + recommendation);
    }

    public void generateReport(String ideaName, double finalScore, String recommendation) {
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

}
