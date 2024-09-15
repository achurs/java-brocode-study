import java.util.ArrayList;

public class foreloop{
    public static void main(String[] args) {
        //normal array
        String animals[] = {"cat","dog","cow"};
        for (String i : animals) {
            System.out.println(i);
        }
        //arrayList
        ArrayList<String> ani = new ArrayList<String>();
        ani.add("cat");
        ani.add("dog");
        ani.add("bird");
        for (String i : ani) {
            System.out.println(i);
        }
    }
}
