import java.io.*;
import java.util.*;

public class LogReader {

    public List<String> readLogs(String fileName)
            throws IOException {

        List<String> logs =
                new ArrayList<>();

        BufferedReader br =
                new BufferedReader(
                        new FileReader(fileName));

        String line;

        while((line = br.readLine()) != null) {

            logs.add(line);
        }

        br.close();

        return logs;
    }
}
