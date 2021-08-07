package by.vsulab;

import java.util.Arrays;

public class FilterTxt extends TextLoader {

    String[] sentence;

    public FilterTxt() {
    }

    public FilterTxt(String readAllBytes) {
        super(readAllBytes);
    }

    public String[] getSentence() {
        return sentence;
    }

    public String getSentenceIndex(int i) {
        return sentence[i];
    }

    public void setSentence(TextLoader textLoader) {
        textLoader.setImportTxt(textLoader.getImportTxt().replaceAll("-- ", ""));
        this.sentence = textLoader.getImportTxt().split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=\\.|\\?)\\s");
    }

    @Override
    public String toString() {
        return "FilterTxt{" +
                "sentence=" + Arrays.toString(sentence) +
                '}';
    }
}
