package enums;

public class Months {
    enum MonthNames {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;


    }

    public static void main(String[] args) {
        MonthNames myMonth = MonthNames.DECEMBER;
        if (myMonth == MonthNames.DECEMBER) {
            System.out.println("snow time");
        } else if (myMonth == MonthNames.MARCH) {
            System.out.println("Welcome Spring");
        } else if (myMonth == MonthNames.JUNE) {
            System.out.println("Summer time");
        } else if (myMonth == MonthNames.SEPTEMBER) {
            System.out.println("leaves fall");
        }
    }
}
