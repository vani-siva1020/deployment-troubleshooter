public class SuggestionEngine {

    public String getSuggestion(String error) {

        if(error.equals("Maven dependency not found")) {
            return "Run mvn clean install";
        }

        else if(error.equals("Docker build failed")) {
            return "Check Dockerfile syntax";
        }

        else if(error.equals("Docker registry authentication failed")) {
            return "Verify Docker Hub credentials";
        }

        else if(error.equals("Kubernetes deployment failed")) {
            return "Check pod logs and deployment.yaml";
        }

        else if(error.equals("Slack webhook failed")) {
            return "Verify webhook URL";
        }

        else if(error.equals("Test cases failed")) {
            return "Review failing unit tests";
        }

        else if(error.equals("DB_URL missing")) {
            return "Check application.properties";
        }

        else if(error.equals("API_KEY missing")) {
            return "Check environment variables";
        }

        else if(error.equals("Docker Pull Failed")) {
            return "Check Docker credentials";
        }

        return "No suggestion available";
    }
}
