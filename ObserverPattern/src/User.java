import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User  implements Observer{
    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(Map<Integer, Coin> cryptocurrencies) {
        Coin lastElement = null;
        for (Map.Entry<Integer, Coin> item: cryptocurrencies.entrySet()){
            lastElement = item.getValue();
        }
        System.out.println("Hey " + this.name + ", we have added new crypto: " + lastElement + "\nNow our market looks like: ");
        for (Map.Entry<Integer, Coin> item: cryptocurrencies.entrySet()){
            System.out.printf("ID: %s - %s \n", item.getKey(), item.getValue());
        }
        System.out.println();

    }

}
