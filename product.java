import java.util.Objects;
import java.util.Scanner;

public class Product {
    private String name;
    private String code;
    private double price;

    public Product() {
        this("bread", "cs222", 100);
    }
    public Product(String name, String code, double price) {
        //this.name = name;
        setName(name);
        //this.code = code;
        setCode(code);
        //this.price = price;
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = (price>0?price:10);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;

        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.code, other.code);
    }


    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the product name, code, price: ");
        name=in.next();
        code=in.next();
        setPrice(in.nextDouble());
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }


}

