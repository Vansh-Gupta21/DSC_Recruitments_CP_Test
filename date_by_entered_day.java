package DSCcp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class date_by_entered_day {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dayOfYear = scn.nextInt();
        int year = scn.nextInt();

        String formattedDate = convertDayToDate(dayOfYear, year);
        System.out.println(formattedDate);
    }
    static String convertDayToDate(int dayOfYear, int year){
        LocalDate date = LocalDate.ofYearDay(year, dayOfYear);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        return date.format(formatter);
    }
}

