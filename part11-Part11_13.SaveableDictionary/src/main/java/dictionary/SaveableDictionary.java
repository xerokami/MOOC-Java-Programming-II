package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> saveableDictionary;
    private String fileToRead;

    public SaveableDictionary() {
        this.saveableDictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.fileToRead = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.fileToRead))
                    .map(line -> line.split(":"))
                    .forEach(parts -> {
                        add(parts[0], parts[1]);
                    });
            return true;
        } catch (IOException error) {
            return false;
        }
    }

    public void add(String words, String translation) {
        saveableDictionary.putIfAbsent(words, translation);
        saveableDictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return saveableDictionary.get(word);
    }

    public void delete(String word) {
        String translation = saveableDictionary.get(word);
        saveableDictionary.remove(word);
        saveableDictionary.remove(translation);
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(this.fileToRead));
            saveWords(writer);
            writer.close();
        } catch (Exception error) {
            return false;
        }
        return true;
    }

    public void saveWords(PrintWriter writer) throws IOException {
        ArrayList<String> saved = new ArrayList<>();
        saveableDictionary.keySet()
                .stream()
                .forEach(word -> {
                    if (saved.contains(word)) {
                        return;
                    }

                    String part = word + ":" + saveableDictionary.get(word);
                    writer.println(part);

                    saved.add(word);
                    saved.add(saveableDictionary.get(word));
                });

    }

}
