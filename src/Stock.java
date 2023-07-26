import java.nio.DoubleBuffer;

public class Stock {
    private String symbol;
    private String name;
    private Double price;

    public Stock(String symbol, String name, Double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    public String getSymbol()
    { return symbol; }

    public String getName()
    { return name; }

    public Double getPrice()
    { return price; }

    public void setSymbol(String symbol)
    { this.symbol = symbol; }

    public void setName(String name)
    { this.name =  name; }

    public void setPrice(Double price)
    { this.price = price; }


}
