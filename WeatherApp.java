package com.WeatherApp;
import java.util.HashMap;
import java.util.Scanner;

public class WeatherApp {
    // Simulated API to store weather data
    private static HashMap<String, WeatherData> weatherDataAPI = new HashMap<>();

    // WeatherData class to store temperature, wind speed, and pressure
    private static class WeatherData {
        double temperature;
        double windSpeed;
        double pressure;

        WeatherData(double temperature, double windSpeed, double pressure) {
            this.temperature = temperature;
            this.windSpeed = windSpeed;
            this.pressure = pressure;
        }
    }

    public static void main(String[] args) {
        initializeWeatherDataAPI();

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            switch (option) {
                case 1:
                    getWeather(scanner);
                    break;
                case 2:
                    getWindSpeed(scanner);
                    break;
                case 3:
                    getPressure(scanner);
                    break;
                case 0:
                    System.out.println("Program Terminated!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Select an option:");
        System.out.println("1. Get weather");
        System.out.println("2. Get Wind Speed");
        System.out.println("3. Get Pressure");
        System.out.println("0. Exit");
    }

    private static void getWeather(Scanner scanner) {
        System.out.print("Enter the date(yyyy-mm-dd)(only 2023 june and july available): ");
        String date = scanner.nextLine();

        if (weatherDataAPI.containsKey(date)) {
            double temperature = weatherDataAPI.get(date).temperature;
            System.out.println("Temperature on " + date + ": " + temperature + " degrees Celsius");
        } else {
            System.out.println("No data available for the provided date.");
        }
    }

    private static void getWindSpeed(Scanner scanner) {
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();

        if (weatherDataAPI.containsKey(date)) {
            double windSpeed = weatherDataAPI.get(date).windSpeed;
            System.out.println("Wind Speed on " + date + ": " + windSpeed + " m/s");
        } else {
            System.out.println("No data available for the provided date.");
        }
    }

    private static void getPressure(Scanner scanner) {
        System.out.print("Enter the date: ");
        String date = scanner.nextLine();

        if (weatherDataAPI.containsKey(date)) {
            double pressure = weatherDataAPI.get(date).pressure;
            System.out.println("Pressure on " + date + ": " + pressure + " hPa");
        } else {
            System.out.println("No data available for the provided date.");
        }
    }

    private static void initializeWeatherDataAPI() {
    	weatherDataAPI.put("2023-06-01", new WeatherData(28.5, 8.2, 1013.2));
    	weatherDataAPI.put("2023-06-02", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-03", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-04", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-06-05", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-06", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-07", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-06-08", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-09", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-10", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-06-11", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-12", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-13", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-06-14", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-15", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-16", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-06-17", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-18", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-19", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-06-20", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-21", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-22", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-06-23", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-24", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-25", new WeatherData(27.9, 6.5, 1010.5));
        weatherDataAPI.put("2023-06-26", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-06-27", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-28", new WeatherData(27.9, 6.5, 1010.5));
        weatherDataAPI.put("2023-06-29", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-06-30", new WeatherData(27.9, 6.5, 1010.5));
        weatherDataAPI.put("2023-06-31", new WeatherData(28.5, 8.2, 1013.2));
    	weatherDataAPI.put("2023-07-01", new WeatherData(28.5, 8.2, 1013.2));
    	weatherDataAPI.put("2023-07-02", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-03", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-04", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-07-05", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-06", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-07", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-07-08", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-09", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-10", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-07-11", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-12", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-13", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-07-14", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-15", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-16", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-07-17", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-18", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-19", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-07-20", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-21", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-22", new WeatherData(27.9, 6.5, 1010.5));
    	weatherDataAPI.put("2023-07-23", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-24", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-25", new WeatherData(27.9, 6.5, 1010.5));
        weatherDataAPI.put("2023-07-26", new WeatherData(28.5, 8.2, 1013.2));
        weatherDataAPI.put("2023-07-27", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-28", new WeatherData(27.9, 6.5, 1010.5));
        weatherDataAPI.put("2023-07-29", new WeatherData(30.1, 7.8, 1012.1));
        weatherDataAPI.put("2023-07-30", new WeatherData(27.9, 6.5, 1010.5));
        weatherDataAPI.put("2023-07-31", new WeatherData(28.5, 8.2, 1013.2));
    }
}
