public class methords {
    static void hello(){
        System.out.println("hello");
    }
    static void passer(String s){
        System.out.println("hello "+s);
    }
    public static void main(String[] args) {
        hello();
        hello();
        passer("llm");
    }
}
