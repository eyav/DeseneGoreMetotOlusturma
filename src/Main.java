import java.util.Scanner;
public class Main {

    static void pattern(int number){
        pattern(number, number, false);
    }

    static void pattern(int number, int firstNumber, boolean isNegative){
        int i = number;

        if(!isNegative){

            if (i > 0){
                System.out.print(i + " ");
                pattern(i-5, firstNumber, isNegative);
            }if (i <= 0){
                isNegative = true;
                System.out.print(i + " ");
                pattern(i, firstNumber,isNegative);
            }
        }else{
            if(i < firstNumber) {
                i += 5;
                System.out.print(i + " ");
                if(i != firstNumber){
                    pattern(i, firstNumber, isNegative);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Desen için sayı gir: ");
        int number = scan.nextInt();

        pattern(number);


    }
}