package com.codegym.marketplace;

public class Store {
    Warehouse warehouse1 = new Warehouse();
    Warehouse warehouse2 = new Warehouse();


    Shipper grap = new Shipper();
    Shipper be = new Shipper();
    Shipper goViet = new Shipper();

    boolean buy(Customer customer, Product product, Payment payment) {

        boolean isValid = false;
        if (customer.getAddressShipping().contains("Hà Nội")) {
            isValid = warehouse1.checkValid(product);
        } else {
            isValid = warehouse2.checkValid(product);
        }

        if (isValid) {
            // get shipper

            return true;
        }


        return false;
    }

}
