import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Race gibby = new Dragonborn(30, "true-neutral", "GOld");

        ArrayList<String> res = gibby.getResits();

        for(int i = 0; i < res.size(); i++){
            System.out.println(res.get(i));
        }




    }
}
