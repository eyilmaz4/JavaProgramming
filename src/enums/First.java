package enums;

public class First {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    enum Seasons{
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }


    public static void main(String[] args) {
        Level myEnumVar=Level.LOW;
        System.out.println(myEnumVar);

        Seasons mySeason=Seasons.SPRING;
        System.out.println(mySeason);
        Seasons Season2=Seasons.FALL;
        Seasons Season3=Seasons.SUMMER;
        Seasons Season4=Seasons.WINTER;
        System.out.println(" "+mySeason+" "+Season2+" "+Season3+" "+Season4);
    }
}
