import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CryptoExchange implements Subject {
    private Map<Integer, Coin> cryptoCurrencies = new HashMap();
    private List<Observer>  subscribers = new ArrayList<>();
    public void addCrypto(int ID, Coin coin) {
        if (isExist(ID)){
            Coin existsCoin = this.cryptoCurrencies.get(ID);
            System.err.println("We already have cryptocurrency with ID: " + ID + ". Coin is " + existsCoin.toString() +"\nPlease, input another ID.");
            return;
        }
        this.cryptoCurrencies.put(ID, coin);
        notifyAllUsers();
    }
    private boolean isExist(int ID){
        if (this.cryptoCurrencies.containsKey(ID)){
            return true;
        }
        return false;
    }
    public  void removeCrypto(int ID) {
        this.cryptoCurrencies.remove(ID);
        notifyAllUsers();
    }

    @Override
    public void registerUser(Observer user) {
        this.subscribers.add(user);
    }

    @Override
    public void removeUser(Observer user) {
        this.subscribers.add(user);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer user: subscribers){
            user.update(this.cryptoCurrencies);
        }

    }
}
