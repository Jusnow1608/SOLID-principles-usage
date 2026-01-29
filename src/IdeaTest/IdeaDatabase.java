package IdeaTest;

import java.time.LocalDate;

public class IdeaDatabase {

    public IdeaDatabase() {
    }

    public void saveToDatabase(String ideaName, double finalScore, String recommendation) {
        System.out.println("Connecting to database...");
        System.out.println("Executing: INSERT INTO idea_tests (name, score, recommendation, timestamp) VALUES ('"
                + ideaName + "', " + String.format("%.1f",finalScore) + ", '"
                + recommendation + "', '"
                + LocalDate.now() + "')");
        System.out.println("Data saved successfully.");
    }
}
