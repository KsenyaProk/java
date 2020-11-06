import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        gameValue();
        gameWord();
    }

    private static void gameWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int n = (int)(Math.random()*words.length);
        String compWord = words[n];

        System.out.println("Угадайте загаданное слово");
        Scanner scan = new Scanner(System.in);
        String gamerWord;

        do {
            String answer = "";
            gamerWord = scan.next();
            outerLoop:for (int i = 0; i < compWord.length(); i++) {
                for (int j = 0; j < gamerWord.length(); j++) {
                    if (i == j && gamerWord.charAt(j) == compWord.charAt(i)) {
                        answer += compWord.charAt(i);
                    }
                    if (i == j && gamerWord.charAt(j) != compWord.charAt(i)) {
                        break outerLoop;
                    }
                }
            }
            System.out.println(answer+"###############");
        }while (!Objects.equals(gamerWord, compWord));
        System.out.println("Вы угадали!!!");
    }

    public static void gameValue(){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 9;
        int r = random.nextInt(10);
        int n;
        int counter = 0;
        System.out.println("Угадайте число от " + min + " до " + max);
        do {
                n = scan.nextInt();
                if (n < r) {
                    System.out.println("Загаданное число больше");
                    counter+=1;
                }

                if(n==r){
                    System.out.println("ПОБЕДА!!!");
                    break;
                }

               if(n>r)  {
                    System.out.println("Загаданное число меньше");
                   counter+=1;
                }
        } while (n < min || n > max||counter!=3);

        if(counter==3){
            System.out.println("ПРОИГРЫШ");
            System.out.println("Было загадано число "+r);
        }
        repeatGame();
    }

    public static void repeatGame(){
        System.out.println("Повторить игру ещё раз?\n1 - да / 0 - нет");
        Scanner scan = new Scanner(System.in);
        int yesNo = scan.nextInt();
        if (yesNo==1){
            gameValue();
        }
        else {
            System.out.println("Игра окончена");
        }
    }
}
