import java.util.Scanner;

public class Store {
    private String name;
    private String add;
    private int nProd;
    private Product[] products;

    public Store(String name, String add, int nProd) {
        this.name = name;
        this.add = add;
        this.nProd = nProd;
        products= new Product[10];
        for (int i=0; i<10; i++)
            products[i]=new Product();

    }

    public Store() {
        this ("initalStore", "initalAdd", 1);    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setnProd(int nProd) {
        this.nProd = (nProd>=0? nProd:0);
    }

    public void setProducts(Product[] products) {

        if (this.products.length>=products.length)
            for (int i=0; i<10; i++)
                this.products[i]=products[i];
    }

    public void addProduct(Product p)
    {
        this.products[this.nProd]=p;
        this.nProd++;
    }

    public void removeProduct(String productName) {
        for (int i = 0; i < nProd; i++) {
            if (products[i].getName().equals(productName)) {
                products[i] = products[nProd - 1];
                products[nProd - 1] = null;
                nProd--;
                return;
            }
        }
        System.out.println("Product with name " + productName + " not found.");
    }

    @Override
    public String toString() {
        String str= "Store{" + "name=" + name + ", add=" + add + ", nProd=" +
                nProd + ", products=\n";
        for (int i=0; i<nProd; i++)
            str=str+"\n" +products[i].toString();

        str += '}';

        return str;
    }

    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the store name, address, numberProducts: ");
        name=in.next();
        add=in.next();
        setnProd(in.nextInt());
        for (int i=0; i<nProd; i++)
            products[i].input();
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public int getnProd() {
        return nProd;
    }

    public Product[] getProducts() {
        return products;
    }

}
