package Main;

import Decoding.StringDecoding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.println("Введите закодированную строку");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            s= StringDecoding.decode(s);
            System.out.println(s);
        }

    }
