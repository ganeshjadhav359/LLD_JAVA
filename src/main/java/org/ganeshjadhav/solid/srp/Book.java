package org.ganeshjadhav.solid.srp;

public class Book {
    private String name;
    private String author;
    private String text;

    public void updateWordInText(String word, String replacementWord){
        text = text.replaceAll(word,replacementWord);
    }

    public boolean searchWordInText(String word){
        return text.contains(word);
    }
}
