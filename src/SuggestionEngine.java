public class SuggestionEngine {

    public String getSuggestion(
            String error) {

        if(error.equals(
                "DB_URL missing")) {

            return "Check application.properties";
        }

        else if(error.equals(
                "API_KEY missing")) {

            return "Check environment variables";
        }

        else if(error.equals(
                "Docker Pull Failed")) {

            return "Check Docker credentials";
        }

        return "No suggestion available";
    }
}
