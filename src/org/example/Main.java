package org.example;

import java.util.Scanner;

public class Main {
    public static final int FIND_FREQUENCY_OF_WORDS_IN_SENTENCE=1;
    public static final int FIND_FREQUENCY_OF_WORDS_IN_PARAGRAPH=2;
    public static final int EXIT=0;
    MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
    MyLinkedHashMap<String,Integer>myLinkedHashMap=new MyLinkedHashMap<>();
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Main main=new Main();
        while (true){
            System.out.println("\n0. Exit\n1. Find frequency of words in sentence.\n2. Find frequency of words in Paragraph\n");
            System.out.print("Enter Your Choice : ");
            switch (main.sc.nextInt()){
                case FIND_FREQUENCY_OF_WORDS_IN_SENTENCE:
                    main.addSentence();
                    main.findFrequencyOfWordsInSentence();
                    break;
                case FIND_FREQUENCY_OF_WORDS_IN_PARAGRAPH:
                    main.addParagraph();
                    main.findFrequencyOfWordsInParagraph();
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private void findFrequencyOfWordsInParagraph() {
        System.out.print("\nEnter word which you want to check frequency : ");
        int frequency = myLinkedHashMap.get(sc.next());
        System.out.println("Frequency is : " + frequency);
    }

    public void addParagraph(){
        String paragraph="\n\tParanoids are not paranoid because they are \n" +
                "paranoid but because they keep putting themselves \n" +
                "deliberately into paranoid avoidable situations";
        System.out.println("Added Paragraph : "+paragraph);
        String[] words = paragraph.toLowerCase().split(" ");
        for(String word : words){
            Integer value=myLinkedHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word,value);
        }
    }

    public void findFrequencyOfWordsInSentence() {
        System.out.print("\nEnter word which you want to check frequency : ");
        int frequency = myHashMap.get(sc.next());
        System.out.println("Frequency is : " + frequency);
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
}
