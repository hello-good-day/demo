import java.util.ArrayList;
import java.util.List;

public class Hello {


    public String a;


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        hello();
    }







    public static void hello(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        for (String s : list) {
            System.out.println(s);
        }


    }
}
