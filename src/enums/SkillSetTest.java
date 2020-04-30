package enums;

public class SkillSetTest {
    public static void main(String[] args) {
        SkillSet mySkill=SkillSet.SQL;
        switch (mySkill){
            case SQL:
                System.out.println("practice relational database");
                break;
            case SELENIUM:
                System.out.println("prepare your framework");
                break;
            case JAVA:
                System.out.println("solve problem a lot");
                break;
        }
    }
}
