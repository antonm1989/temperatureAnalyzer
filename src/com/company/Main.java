package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input temperature in the following format: ‘+26C’:");
        String temperatureInput = in.nextLine();
        System.out.println(temperatureAnalyzer(temperatureInput));
    }

    public static int parseTemperatureValue(String temperatureInput) {

        return Integer.parseInt(temperatureInput.substring(0, temperatureInput.indexOf('C')));
    }

    public static String temperatureAnalyzer(String temperatureInput) {

        String answer;
        if (testStringFormat(temperatureInput)) {
            int temperature = parseTemperatureValue(temperatureInput);
            answer = (temperature >= -50) && (temperature <= -1) ? "It’s super cold today. Be sure you dressed well!" : "Please re-check results in 5 mins";
            answer = (temperature >= 0) && (temperature <= 10) ? "It’s windy outside, but we are sure you will enjoy your day!" : answer;
            answer = (temperature >= 11) && (temperature <= 30) ? "It’s time for outdoor walking!" : answer;
            answer = (temperature >= 31) && (temperature <= 40) ? "It's so hot outside!" : answer;
            answer = (temperature >= 41) && (temperature <= 50) ? "Welcome to hell!" : answer;
        } else answer = "Temperature format is not correct! Please try again.";
        return answer;
    }

    public static boolean testStringFormat(String testString) {

        Pattern p = Pattern.compile("^([+-])\\d+C$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
