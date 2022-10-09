import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Chain = "sadfsdhjrkfdasfknagkjasds";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        char characters = scanner.next().charAt(0);
        int count = 0;
        for (int i=0;i<Chain.length();i++){
            if (characters == Chain.charAt(i)){
                count ++;
            }
        }
        if (count > 0){
            System.out.print("The character " + characters +" appears " + count + " times in the string");
        }
        else {
            System.out.println("The character does not appear");
        }

    }
}