package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FieldOfDreams {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String word = "doctor";

        char [] massive = word.toCharArray();
        char [] massive2 = new char[word.length()];

        for(int i = 0; i < massive.length; i++){
            massive2[i] = '*';
        }


        while (!Arrays.equals(massive2, massive)){
            int count = 0;

                System.out.println("Назовите букву:");
                char wordOfUser = scanner.next().charAt(0);
                for (int i = 0; i < massive.length; i++) {
                    if (wordOfUser == massive[i]) {
                        massive2[i] = wordOfUser;
                        count = 1;
                    }
                }
                if(count >= 1){
                    System.out.println(massive2);
                }else{
                    System.out.println("Нет такой буквы!");
                }

                if(Arrays.equals(massive2, massive)){
                    System.out.println("Победа!");
                }

        }



    }


}


