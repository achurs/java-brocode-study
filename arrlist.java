import java.util.ArrayList;
public class arrlist {
    public static void main(String[] args) {
        //1d arraylist
        ArrayList<String> food = new ArrayList<String>();
        food.add("Burger");
        food.add("Pizza");
        food.add("Hotdog");

        food.set(0, "chicken burger");
        food.remove(2);

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
        System.out.println(food.isEmpty());

        //2d arraylist
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("pasta");
        System.out.println(bakeryList);

        ArrayList<ArrayList<String>> grocery_list = new ArrayList<>();
        grocery_list.add(bakeryList);
        grocery_list.add(food);
        //getting list
        System.out.println(grocery_list);
        System.out.println(grocery_list.get(0).get(0));
    }
}
