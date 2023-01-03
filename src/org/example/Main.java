package org.example;

import java.util.Scanner;

public class Main {
    public static final int FIND_FREQUENCY_OF_WORDS_IN_SENTENCE=1;
    public static final int EXIT=0;
    MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Main main=new Main();
        while (true){
            System.out.println("\n0. Exit\n1. Find frequency of words\n");
            System.out.print("Enter Your Choice : ");
            switch (main.sc.nextInt()){
                case FIND_FREQUENCY_OF_WORDS_IN_SENTENCE:
                    main.addSentence();
                    main.findFrequencyOfWords();
                    break;
                case EXIT:
                    return;
            }
        }
    }

    public void addSentence() {
        String sentence = "To be or not to be";
        System.out.println("Added sentence : "+sentence);
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
    }

    public void findFrequencyOfWords() {
        System.out.print("\nEnter word which you want to check frequency : ");
        int frequency = myHashMap.get(sc.next());
        System.out.println("Frequency is : " + frequency);
    }
}
