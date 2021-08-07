package by.vsulab;

/*
Создать программу обработки текста учебника по программированию с использованием классов (по необходимости) для представления:
символа, слова, предложения, знака препинания и др. Во всех задачах с формированием текста заменять табуляции и
последовательности пробелов одним пробелом. Программа должна обрабатывать адреса электронной почты и
номера телефонов в формате +XXX(XX)XXX-XX-XX как отдельные слова.

Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        TextLoader textLoader = new TextLoader("/Users/sergeypodkolzin/Documents/GitHub/by.vsulab.task2/resources/warAndPeace.txt");

        FilterTxt filterTxt = new FilterTxt();

        filterTxt.setSentence(textLoader);


        List<String> sentences = new ArrayList<String>(Arrays.asList(filterTxt.getSentence()));
        List<String> interrogativeSentences = new ArrayList<>();
        int wordLength = 3;
        LinkedHashSet<String> answer = new LinkedHashSet<>();






        // поиск вопросительных предложений


        for (int i = 0; i < sentences.size(); i++) {
            if (sentences.get(i).charAt(sentences.get(i).length() - 1) == '?') {
                interrogativeSentences.add(sentences.get(i).trim());
                //System.out.println(sentences.get(i).charAt(sentences.get(i).length() - 1));

            }
        }

        String[] temp = interrogativeSentences.toArray(new String[interrogativeSentences.size()]);

        for (int i = 0; i < temp.length; i++){
            System.out.println(temp[i]);
            System.out.println("888888");
            temp[i] = temp[i].replaceAll("\\p{Punct}", "");
            String[] strings = temp[i].split(" ");

            for (String string: strings){
                if(string.length() == wordLength){
                    answer.add(string);
                }
            }
        }
        System.out.println(answer.toString());

        for (String interrogativeSentence : interrogativeSentences) {
//            if(interrogativeSentence.length() == wordLength){
//                System.out.println(interrogativeSentence);;
//            }
//            System.out.println(interrogativeSentence);
//            System.out.println(interrogativeSentence.length());
//            System.out.println("*******");

        }

        for (int i = 0; i < interrogativeSentences.size(); i++){
            for (int j = i; j < interrogativeSentences.get(i).length(); j++){
//                if(interrogativeSentences.get(j).length() > 40){
//                    System.out.println(interrogativeSentences.get(j));
//                }
//                temp.add(j,interrogativeSentences.get(i));
            }
        }


    }
}
