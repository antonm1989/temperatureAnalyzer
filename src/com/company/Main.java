package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input temperature in the following format: ‘+26C’:");
        String temperatureInput = in.nextLine();



        if (testStringFormat(temperatureInput)) {
            System.out.println(temperatureAnalyzer(parseTemperatureValue(temperatureInput)));
        } else System.out.println("Temperature format is not correct! Please try again.");
    }

    public static int parseTemperatureValue(String temperatureInput) {

        return Integer.parseInt(temperatureInput.substring(0, temperatureInput.indexOf('C')));
    }

    public static String temperatureAnalyzer(int temperature) {

        String answer = (temperature >= -50) && (temperature <= -1) ? "It’s super cold today. Be sure you dressed well!" : "Please re-check results in 5 mins";
        answer = (temperature >= 0) && (temperature <= 10) ? "It’s windy outside, but we are sure you will enjoy your day!" : answer;
        answer = (temperature >= 11) && (temperature <= 30) ? "It’s time for outdoor walking!" : answer;
        answer = (temperature >= 31) && (temperature <= 40) ? "It's so hot outside!" : answer;
        answer = (temperature >= 41) && (temperature <= 50) ? "Welcome to hell!" : answer;
        return answer;
    }

    public static boolean testStringFormat(String testString) {

        Pattern p = Pattern.compile("^(\\+|-)\\d+C$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}

//        switch (temperature) {
//            case -50:
//            case -49:
//            case -48:
//            case -47:
//            case -46:
//            case -45:
//            case -44:
//            case -43:
//            case -42:
//            case -41:
//            case -40:
//            case -39:
//            case -38:
//            case -37:
//            case -36:
//            case -35:
//            case -34:
//            case -33:
//            case -32:
//            case -31:
//            case -30:
//            case -29:
//            case -28:
//            case -27:
//            case -26:
//            case -25:
//            case -24:
//            case -23:
//            case -22:
//            case -21:
//            case -20:
//            case -19:
//            case -18:
//            case -17:
//            case -16:
//            case -15:
//            case -14:
//            case -13:
//            case -12:
//            case -11:
//            case -10:
//            case -9:
//            case -8:
//            case -7:
//            case -6:
//            case -5:
//            case -4:
//            case -3:
//            case -2:
//            case -1:
//                answer = "answer1";
//                break;
//        }


//

