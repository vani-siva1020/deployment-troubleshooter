import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {

            LogReader reader = new LogReader();

            List<String> logs =
                    reader.readLogs("deployment.log");

            ErrorAnalyzer analyzer =
                    new ErrorAnalyzer();

            HashMap<String, ArrayList<Integer>> result =
                    analyzer.analyze(logs);

            SuggestionEngine engine =
                    new SuggestionEngine();

            for(String error : result.keySet()) {

                System.out.println("Error : " + error);

                System.out.println("Lines : "
                        + result.get(error));

                System.out.println("Suggestion : "
                        + engine.getSuggestion(error));

                System.out.println("------------------");
            }

        } catch(Exception e) {

            System.out.println(
                    "Error : " + e.getMessage());
        }
    }
}
