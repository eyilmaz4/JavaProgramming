package inheritence;

public class PlannerTest {
    public static void main(String[] args) {
        PlannerDuran myPlanner= new PlannerDuran();

        myPlanner.addEvent("april 10", "java strings");

        myPlanner.addEvent("may 12", "java collections");
myPlanner.deleteEvent("april 10");

ExpoPlanner myExp=new ExpoPlanner();
myExp.listAll();
String [] checkList={"a", "b","c", "d","a", "b","c", "d","e","f"};
myExp.modifiedCheckList("may 12", checkList);
myExp.listAll();
    }
}
