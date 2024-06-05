import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("F:\\SQA FILE\\PROJECTS\\Internship Projects\\Mahfil - Steadfast IT\\Coding\\word.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        Map<String, Integer> map = new HashMap<>();

        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\W+");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (!word.isEmpty()) {
                    word = word.toLowerCase();
                    int count = map.getOrDefault(word, 0);
                    map.put(word, count + 1);
                }
            }
        }

        reader.close();

        List<String> alphabeticOrder = new ArrayList<>(map.keySet());
        Collections.sort(alphabeticOrder);

        for (int i = 0; i < alphabeticOrder.size(); i++) {
            String word = alphabeticOrder.get(i);
            System.out.println(word + ": " + map.get(word));
        }
    }
}