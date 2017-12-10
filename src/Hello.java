import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        list.add("d");
        list.add("c");

        Map<String, String> map = new HashMap<String,String>();
        for (String s : list) {
            System.out.println(s);
        }


    }
}
