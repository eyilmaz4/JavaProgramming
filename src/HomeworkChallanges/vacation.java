package HomeworkChallanges;
//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form “7:00” indicating when the alarm clock should ring. Weekdays, the alarm should be “7:00" and on the weekend it should be “10:00”. Unless we are on vacation -- then on weekdays it should be “10:00" and weekends it should be “off”.
//alarmClock(1, false) → “7:00"
//alarmClock(5, false) → “7:00”
//alarmClock(0, false) → “10:00"
public class vacation {
    public static void main(String[] args) {
        alarmClock(1,true);
        alarmClock(0,false);
        alarmClock(0,true);
        alarmClock(5,false);
    }
    public static void alarmClock(int day, boolean isVacation){
        if(day>=0 && day<7){
            if(day>=1 && day<=5 && isVacation==false){
                System.out.println("7:00");
            }
            else if(day>=1 && day<=5 && isVacation==true){
                System.out.println("10:00");
            }
           else if ((day==0 || day==6) && isVacation==false){
                System.out.println("10:00");
            }
            else if ((day==0 || day==6) && isVacation==true){
                System.out.println("off");
            }
        }
    }
}
