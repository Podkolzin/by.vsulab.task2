package by.vsulab;

/*
Создать программу обработки текста учебника по программированию с использованием классов (по необходимости) для представления:
символа, слова, предложения, знака препинания и др. Во всех задачах с формированием текста заменять табуляции и
последовательности пробелов одним пробелом. Программа должна обрабатывать адреса электронной почты и
номера телефонов в формате +XXX(XX)XXX-XX-XX как отдельные слова.

Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TextLoader textLoader = new TextLoader("/Users/sergeypodkolzin/Documents/GitHub/by.vsulab.task2/resources/warAndPeace.txt");

        FilterTxt filterTxt = new FilterTxt();

        filterTxt.setSentence(textLoader);


        List<String> sentences = new ArrayList<>(Arrays.asList(filterTxt.getSentence()));
        List<String> interrogativeSentences = new ArrayList<>();
        int wordLength = 12;
        LinkedHashSet<String> answer = new LinkedHashSet<>();


        // поиск вопросительных предложений


        for (int i = 0; i < sentences.size(); i++) {
            if (sentences.get(i).charAt(sentences.get(i).length() - 1) == '?') {
                interrogativeSentences.add(sentences.get(i).trim());
            }
        }

        String[] temp = interrogativeSentences.toArray(new String[interrogativeSentences.size()]);


        // разделение предложения на слова и поиск слов с нужным колличеством букв

        for (int i = 0; i < temp.length; i++) {
            temp[i] = temp[i].replaceAll("\\p{Punct}", "");
            String[] strings = temp[i].split(" ");

            for (String string : strings) {
                if (string.length() == wordLength) {
                    answer.add(string);
                }
            }
        }
        System.out.println("Во всех вопросительных предложениях текста найдены следующие слова из " + wordLength + " букв " + answer.toString());


        // поиск почты в тексте

//        String txt = "vitebsk12@mail.ru With reference to your job ad in xxx, I would like to submit my application for \t" +
//                "he position of Web Content Editor in your company.  pop123@tut.by";

        emailSearch.emailSearch(textLoader);
    }
}
