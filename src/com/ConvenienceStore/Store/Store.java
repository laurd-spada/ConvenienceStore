package com.ConvenienceStore.Store;

import com.ConvenienceStore.Store.Personnel.Personnel;
import com.ConvenienceStore.Store.Personnel.Staff.Cashier;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args){
        Cashier staff1 = new Cashier(123, "Daniel O", 1_5000_000);
        Cashier staff2 = new Cashier(356, "Felix A", 1_250_000);
        Cashier staff3 = new Cashier(356, "Jida A", 1_3000_000);
        Cashier staff4 = new Cashier(356, "Chrise A", 1_200_000);

        List<Cashier> cashierList = new ArrayList<>();
        cashierList.add(staff1);
        cashierList.add(staff2);
        cashierList.add(staff3);
        cashierList.add(staff4);

        System.out.println();
    }
}
