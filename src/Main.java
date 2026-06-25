import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {

           Scanner sc = new Scanner(System.in);

System.out.println("Enter Pod Name:");

String podName = sc.nextLine();

KubernetesLogFetcher fetcher =
        new KubernetesLogFetcher();

List<String> logs =
        fetcher.fetchLogs(podName);
            ErrorAnalyzer analyzer =
                    new ErrorAnalyzer();

            HashMap<String, ArrayList<Integer>> result =
                    analyzer.analyze(logs);

            SuggestionEngine engine =
                    new SuggestionEngine();

            for(String error : result.keySet()) {

                System.out.println("Error : " + error);
                System.out.println("Count : "
        + result.get(error).size());

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
