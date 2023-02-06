package com.ConvenienceStore.Store.Personnel;

import com.ConvenienceStore.Store.Personnel.Staff.Cashier;
import com.ConvenienceStore.Store.Personnel.Staff.Manager;

import java.util.List;

public class Personnel {
    private List<Cashier> cashiersList;
    private Manager manager;
    /**
     * A new object is created
     * @param cashiersList a list of cashiers
     * @param manager a list of managers
     * */
    public Personnel(List<Cashier> cashiersList, Manager manager){
        this.cashiersList = cashiersList;
        this.manager = manager;
    }
    public Personnel(List<Cashier> cashiersList){
        this.cashiersList = cashiersList;
    }
    /**
     * @return a list of cashiers in the company
     * */
    public List<Cashier> getCashiersList() {
        return cashiersList;
    }

    public Manager getManagers() {
        return manager;
    }

}
