public class StoreProductProject {
    public static void printStoresBread(Store[] stores, int n) {
        System.out.println("\nYou can find bread at these stores:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getnProd(); j++) {
                if (stores[i].getProducts()[j].equals(new Product("bread", "b111", 10))) {
                    System.out.println("\n" + stores[i]);
                }
            }
        }
    }

    public static void updateBreadsCode(Store[] stores, String newCode) {
        for (Store store : stores) {
            for (int i = 0; i < store.getnProd(); i++) {
                Product product = store.getProducts()[i];
                if (product.getName().equals("bread")) {
                    product.setCode(newCode);
                    product.setPrice(110.0);
                }
            }
        }
    }

    public static void main(String[] args) {
        Store[] stores = new Store[3];
        for (int i = 0; i < stores.length; i++) {
            stores[i] = new Store();
            stores[i].input();
        }

        System.out.println("Initial data about the stores:");
        for (Store store : stores) {
            System.out.println(store);
        }

        printStoresBread(stores, stores.length);

        Product newProduct = new Product("milk", "m001", 5.0);
        Product productToRemove = new Product("bread", "cs222", 100);

        for (Store store : stores) {
            store.addProduct(newProduct);
            store.removeProduct(String.valueOf(productToRemove));
        }

        updateBreadsCode(stores, "b999");

        System.out.println("\nUpdated data about the stores:");
        for (Store store : stores) {
            System.out.println(store);
        }
    }
}
