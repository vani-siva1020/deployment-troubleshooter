import java.util.*;

public class ErrorAnalyzer {

    public HashMap<String, ArrayList<Integer>>
    analyze(List<String> logs) {

        HashMap<String, ArrayList<Integer>>
                errorMap = new HashMap<>();

        for(int i = 0; i < logs.size(); i++) {

            String line = logs.get(i);

            if(line.startsWith("ERROR")) {

                String error =
                        line.substring(6);

                errorMap.putIfAbsent(
                        error,
                        new ArrayList<>());

                errorMap.get(error)
                        .add(i + 1);
            }
            if(line.contains("CrashLoopBackOff")) {
    map.putIfAbsent("CrashLoopBackOff",
            new ArrayList<>());
    map.get("CrashLoopBackOff").add(i + 1);
}

if(line.contains("ImagePullBackOff")) {
    map.putIfAbsent("ImagePullBackOff",
            new ArrayList<>());
    map.get("ImagePullBackOff").add(i + 1);
}

if(line.contains("OOMKilled")) {
    map.putIfAbsent("OOMKilled",
            new ArrayList<>());
    map.get("OOMKilled").add(i + 1);
}

if(line.contains("ErrImagePull")) {
    map.putIfAbsent("ErrImagePull",
            new ArrayList<>());
    map.get("ErrImagePull").add(i + 1);
}
        }

        return errorMap;
    }
}
