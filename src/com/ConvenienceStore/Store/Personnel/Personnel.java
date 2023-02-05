package com.ConvenienceStore.Store.Personnel;



import com.ConvenienceStore.Store.Personnel.Staff.Cashier;
import com.ConvenienceStore.Store.Personnel.Staff.Manager;

import java.util.List;

public class Personnel {
    private List<Cashier> cashiersList;
    private List<Manager> managers;

    public Personnel(List<Cashier> cashiersList, List<Manager> managers){
        this.cashiersList = cashiersList;
        this.managers = managers;
    }

    public List<Cashier> getCashiersList() {
        return cashiersList;
    }

    public void addToCashiersList(Cashier cashier) {
        cashiersList.add(cashier);
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void addToManagers(Manager manager) {
        managers.add(manager);
    }
}
