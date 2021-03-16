
/*
This is the simple Java program to demonstrate the high level functioning
of an 8 to 3 encorder digital circuit , the version for a low level logical
implementation of an 8 to 3 encorder will come later stay tuned.

Developed by : Erick I Shemdoe
Date : 16th March 2021

 */
import java.util.Scanner;

public class Encorder_8_3 {



    public static void main(String[] args) {
        String result = null;

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO 8:3 ENCORDER");
        System.out.println("PLEASE PROVIDE 8 BIT PATTERN TO ENCODE TO 3 BITS");
        String userInput = input.nextLine();


        for (int i = 7 ; i > -1 ; i--) {


             char[] ch  =   userInput.toCharArray();
            int testValue =  ch[(i)];



            if (testValue == 49) {


                result = Integer.toBinaryString(i);

                if(result.equals("0")){

                    result = "000";

                }

              
            }

        }
        System.out.println("You entered "+userInput);
        System.out.println("The output is :    "+result);

  }
}
