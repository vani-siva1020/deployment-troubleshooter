import java.io.*;
import java.util.*;

public class KubernetesLogFetcher {

    public List<String> fetchLogs(String podName)
            throws Exception {

        List<String> logs = new ArrayList<>();

        ProcessBuilder pb =
                new ProcessBuilder(
                        "kubectl",
                        "logs",
                        podName
                );

        Process process = pb.start();

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(
                                process.getInputStream()
                        )
                );

        String line;

        while((line = br.readLine()) != null) {
            logs.add(line);
        }

        return logs;
    }
}
