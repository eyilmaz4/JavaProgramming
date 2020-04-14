package inheritence;

import java.util.Arrays;

public class ExpoPlanner extends Planner {

    String expoName;
    String[][] checkList;

    ExpoPlanner() {
        super();
        this.expoName = "default";
        this.checkList = new String[10][4];
    }

    void listAll() {
        System.out.println("Date\t\t Event\t\t\t Check List");
        for (int i = 0; i < this.datesEvents.length; i++) {
            System.out.print(super.datesEvents[i][0] + "\t\t" + super.datesEvents[i][1]);
            for (int j = 0; j < this.checkList[i].length; j++) {
                System.out.print(this.checkList[i][j] + "\t");
            }
            System.out.println();
        }
    }
    void modifiedCheckList(String date, String checkList[]){
        int index=0;
        for(int i=0; i<super.datesEvents.length; i++){
            if(super.datesEvents[i][0].equalsIgnoreCase(date)){
                index=i;

            }
        }
        this.checkList[index]=checkList;
}





//
//    public ExpoPlanner(){
//        int totalNumOfCheckList=this.checkList.length;
//    }
//    public void listOfEventsList(){
//        System.out.println(Arrays.toString(super.datesEvents));
//        System.out.println(Arrays.toString(this.checkList));
//
//    }
//}
}