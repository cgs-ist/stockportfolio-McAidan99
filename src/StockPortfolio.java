import java.util.HashMap;

public class StockPortfolio {
    HashMap<Stock, Integer> stocks = new HashMap<Stock, Integer>();
    
    public void addStock(Stock stock, int amount) {
        stocks.put(stock, amount);
    }

    public void viewPortfolio() {
        for (Stock i : stocks.keySet()) {
            System.out.println("Symbol: " + i.getSymbol() + " Name: " + i.getName() + " Amount: " + stocks.get(i));
          }
    }
}
