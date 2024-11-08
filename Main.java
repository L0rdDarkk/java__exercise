public class Main {

    public static void printStoresBread(Store[] stores, int n) {
        System.out.println("\nYou can find bread at these stores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getnProd(); j++) {
                if (stores[i].getProducts()[j].getName().equals("bread")) {
                    System.out.println("\n" + stores[i]);
                    break;
                }
            }
        }
    }

    public static void updateBreadsCode(Store[] stores, int n, String newCode) {
        System.out.println("\nUpdating bread code to: " + newCode);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getnProd(); j++) {
                if (stores[i].getProducts()[j].getName().equals("bread")) {
                    stores[i].getProducts()[j].setCode(newCode);
                    System.out.println("Updated bread in store: " + stores[i].getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        Store[] stores = new Store[3];
        stores[0] = new Store("Store A", "Address 1", 2);
        stores[1] = new Store("Store B", "Address 2", 3);
        stores[2] = new Store("Store C", "Address 3", 1);

        stores[0].addProduct(new Product("bread", "b111", 50));
        stores[0].addProduct(new Product("milk", "m123", 30));
        stores[1].addProduct(new Product("bread", "b222", 60));
        stores[1].addProduct(new Product("cheese", "c345", 70));
        stores[1].addProduct(new Product("butter", "b555", 40));
        stores[2].addProduct(new Product("bread", "b333", 55));

        printStoresBread(stores, 3);
        updateBreadsCode(stores, 3, "newBreadCode");
        printStoresBread(stores, 3);

        stores[1].removeProduct("cheese");
        System.out.println("\nAfter removing cheese from Store B:");
        System.out.println(stores[1]);
    }
}
