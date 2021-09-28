public class Main {
    public static void main(String[] args) {
        CryptoExchange Binance = new CryptoExchange();
        Binance.addCrypto(1, new Coin("BTC", 44000));
        Binance.addCrypto(2, new Coin("FTM", 1.09));
        Binance.addCrypto(3, new Coin("AXS", 65.31));


        Binance.registerUser(new User("Adil"));
        Binance.registerUser(new User("Maksat"));
        Binance.registerUser(new User("Joram"));
        
        Binance.addCrypto(6, new Coin("SUSHI", 23.11));
        Binance.addCrypto(3, new Coin("COMP", 365.11));
    }
}
