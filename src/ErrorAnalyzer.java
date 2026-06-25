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
    errorMap.putIfAbsent(
            "CrashLoopBackOff",
            new ArrayList<>());
    errorMap.get(
            "CrashLoopBackOff")
            .add(i + 1);
}

if(line.contains("ImagePullBackOff")) {
    errorMap.putIfAbsent(
            "ImagePullBackOff",
            new ArrayList<>());
    errorMap.get(
            "ImagePullBackOff")
            .add(i + 1);
}

if(line.contains("OOMKilled")) {
    errorMap.putIfAbsent(
            "OOMKilled",
            new ArrayList<>());
    errorMap.get(
            "OOMKilled")
            .add(i + 1);
}

if(line.contains("ErrImagePull")) {
    errorMap.putIfAbsent(
            "ErrImagePull",
            new ArrayList<>());
    errorMap.get(
            "ErrImagePull")
            .add(i + 1);
}
            if(line.contains("CrashLoopBackOff")) {
    errorMap.putIfAbsent("CrashLoopBackOff",
            new ArrayList<>());
     errorMap.get("CrashLoopBackOff").add(i + 1);
}

if(line.contains("ImagePullBackOff")) {
     errorMap.putIfAbsent("ImagePullBackOff",
            new ArrayList<>());
     errorMap.get("ImagePullBackOff").add(i + 1);
}

if(line.contains("OOMKilled")) {
    errorMap.putIfAbsent("OOMKilled",
            new ArrayList<>());
   errorMap.get("OOMKilled").add(i + 1);
}

if(line.contains("ErrImagePull")) {
     errorMap.putIfAbsent("ErrImagePull",
            new ArrayList<>());
   errorMap.get("ErrImagePull").add(i + 1);
}
        }

        return errorMap;
    }
}
