package com.ConvenienceStore;

import com.ConvenienceStore.Store.Personnel.Personnel;
import com.ConvenienceStore.Store.Personnel.Staff.Cashier;
import com.ConvenienceStore.Store.Personnel.Staff.Manager;
import com.ConvenienceStore.Store.Product.Product;
import com.ConvenienceStore.Store.Store;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cashier staff1 = new Cashier(123, "Daniel O", 1_5000_000);
//        Cashier staff2 = new Cashier(356, "Felix A", 1_250_000);
//
//        List<Cashier> applicants = new ArrayList<>();
//        applicants.add(staff1);
//        applicants.add(staff2);

        Product goods1 = new Product(111, "Bag of RIce", 25000);
        Product goods2 = new Product(543, "Indomie", 15000);
        Product goods3 = new Product(131, "Plantain", 8000);

        List<Product> totalGoods = new ArrayList<>();
        totalGoods.add(goods1);
        totalGoods.add(goods2);
        totalGoods.add(goods3);

        Store st = new Store();
        st.setProduct(totalGoods);

        Product prod1 = new Product(111, "Bag of RIce", 25000);
        Product prod2 = new Product(543, "Indomie", 15000);
        List<Product> order = new ArrayList<>();
        order.add(prod1);
        order.add(prod2);


//        Manager mg = new Manager();
//        mg.getCashierList(applicants);

        //Personnel staffs = new Personnel(applicants);
//        mg.hireCashier("Daniel O");
//        mg.hireCashier("Felix A");
//        mg.check();
//        mg.fireCashier("Daniel O");
//        mg.check();
        Cashier work = new Cashier();
        work.sellProduct(order);

        work.dispenseReceipt();
    }
}