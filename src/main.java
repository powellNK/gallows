import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String hiddenWord = reader.nextLine();
        char[] hidden = hiddenWord.toCharArray();
        char[] guessed = new char[hiddenWord.length()];
        for (int index = 0; index<hiddenWord.length();index++){
            guessed[index] = '-';
        }
        while (Arrays.equals(hidden,guessed)==false){
            System.out.println("Введи букву");
            char letter = reader.next().charAt(0);
            for (int index = 0; index<hiddenWord.length();index++){
                char letterHiddenWord = hiddenWord.charAt(index);
                if (letterHiddenWord==letter){
                    guessed[index] = letterHiddenWord;
                }
            }
            System.out.println(Arrays.toString(guessed));
        }
        System.out.println("Ты угадал");
    }
}
