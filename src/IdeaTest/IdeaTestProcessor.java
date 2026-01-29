package IdeaTest;
import java.util.Map;

public class IdeaTestProcessor {

    private final IdeaScorer ideaScorer = new IdeaScorer();
    private final ReportGenerator reportGenerator = new ReportGenerator();
    private final IdeaDatabase ideaDatabase = new IdeaDatabase();

    public IdeaTestProcessor() {
    }

    public void processIdeaTest (String ideaName, Map<String, Integer> answers){
        double finalScore = ideaScorer.calculateIdeaPotential(answers);
        String recommendation = ideaScorer.getRecommendation(finalScore);

        reportGenerator.printToConsole(ideaName, finalScore,recommendation);
        reportGenerator.generateReport(ideaName, finalScore,recommendation);

        ideaDatabase.saveToDatabase(ideaName, finalScore,recommendation);
    }
}
