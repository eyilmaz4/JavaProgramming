package last_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstanceAssignment {
    public static void main(String[] args) {
        List<Pen> list=new ArrayList<>();
        list.add(new Pen());
        list.add(new Crayola());
        list.add(new Pen());
        list.forEach(element->{
            if(element instanceof Crayola){
            ((Crayola)element).color();
        }
            else {
                element.write();
            }
            });



    }
}
class Pen{
    void write(){
        System.out.println("writing");
    }
}
class Crayola extends Pen{
    void color(){
        System.out.println("coloring");
    }
}
