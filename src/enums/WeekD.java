package enums;

public class WeekD {
    enum Week{
        SUNDAY("Sunday Funday", true),
        MONDAY("MArketing monday"),
        TUESDAY("trendy Tuesday"),
        WEDNESDAY("Wellness wednesday"),
        THURSDAY("thankful thursday"),
        FRIDAY("Foody friday"),
        SATURDAY(" Social saturday",true);
        private String dayGreeting;
        private boolean isWeekend;
        Week(final String dayGreeting){
            this.dayGreeting=dayGreeting;
        }
        Week(final String dayGreeting, final boolean isWeekend){
            this(dayGreeting);
            this.isWeekend=isWeekend;
        }
        public String getDayGreeting(){
            return dayGreeting;
        }
        public boolean isWeekend(){
            return isWeekend;
        }


    }


    }

