package com.codegym.marketplace;

public class MarketplaceApp {

    public static void main(String[] args) {


        Customer customer = new Customer();
        customer.setAddressShipping("01 Hàm Nghi, Hà Nội");

        Product tshirt = new Product();
        Payment momo = new Payment();
        Store zara = new Store();

        zara.buy(customer, tshirt, momo);

    }
}
