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

        else if(error.equals("Git authentication failed")) {
            return "Check Git credentials or access token";
        }

        else if(error.equals("Port already in use")) {
            return "Stop the process using the port or change the port";
        }

        else if(error.equals("JWT_SECRET missing")) {
            return "Configure JWT_SECRET environment variable";
        }

        else if(error.equals("Database connection failed")) {
            return "Verify database URL, username and password";
        }

        else if(error.equals("Jenkins agent disconnected")) {
            return "Check Jenkins agent status and network connectivity";
        }

        else if(error.equals("SonarQube quality gate failed")) {
            return "Review code quality issues in SonarQube";
        }

        else if(error.equals("Docker daemon not running")) {
            return "Start Docker Desktop or Docker service";
        }

        else if(error.equals("Kubernetes pod crashloopbackoff")) {
            return "Check pod logs and application startup errors";
        }

        else if(error.equals("Resource quota exceeded")) {
            return "Increase cluster resources or optimize workload";
        }

        else if(error.equals("Connection timeout")) {
            return "Verify network connectivity and firewall rules";
        }
        if(error.equals("CrashLoopBackOff")) {
    return "Check application startup logs and health probes";
}

if(error.equals("ImagePullBackOff")) {
    return "Verify image name and registry credentials";
}

if(error.equals("OOMKilled")) {
    return "Increase container memory limits";
}

if(error.equals("ErrImagePull")) {
    return "Check image repository and tag";
}

        return "Investigate log manually";
    }
}
