package by.vsulab;

/*
Создать программу обработки текста учебника по программированию с использованием классов (по необходимости) для представления:
символа, слова, предложения, знака препинания и др. Во всех задачах с формированием текста заменять табуляции и
последовательности пробелов одним пробелом. Программа должна обрабатывать адреса электронной почты и
номера телефонов в формате +XXX(XX)XXX-XX-XX как отдельные слова.

Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        TextLoader textLoader = new TextLoader("/Users/sergeypodkolzin/Documents/GitHub/by.vsulab.task2/resources/warAndPeace.txt");
        System.out.println(textLoader.getImportTxt().length());

    }
}
