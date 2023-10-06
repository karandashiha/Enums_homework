package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            getOutput(getResult(getData()));
        } catch (Exception e) {
            getOutput("Exception: " + e.getMessage());
        }
    }

    private static TrafficLight getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one of RED, YELLOW, GREEN: ");
        return TrafficLight.valueOf(scanner.nextLine().trim().toUpperCase());
    }

    private static String getResult(TrafficLight color) {
        switch (color) {
            case RED:
                return "If the traffic light is red = STOP!";
            case YELLOW:
                return "If the traffic light is yellow = GET READY!";
            case GREEN:
                return "If the traffic light is green = GO!";
            default:
                return "Wrong.";
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
