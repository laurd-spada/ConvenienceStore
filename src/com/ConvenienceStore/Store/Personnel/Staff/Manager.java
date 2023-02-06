package com.ConvenienceStore.Store.Personnel.Staff;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private int id;
    private String name;
    static List<Cashier> List_of_cashier = new ArrayList<>();
    static List<Cashier> employedCashiers = new ArrayList<>();


    public Manager(){}
    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * @return id of manager
     * */
    public int getId() {
        return id;
    }
    /**
     * @return name of manager
     * */
    public String getName() {
        return name;
    }

    public void getCashierList(List<Cashier> cashierList){
        this.List_of_cashier = cashierList;
    }
    public static void hireCashier(String cashier_name){
        for(Cashier a: List_of_cashier){
            if(a.getName().equals(cashier_name)) {
                var newApplicant = new Cashier(a.getId(), a.getName(), a.getSalary());
                employedCashiers.add(newApplicant);
            }
        }

    }
    public static void fireCashier(String cashier_name){
        for(Cashier a: employedCashiers){
            if(a.getName().equals(cashier_name)){
                employedCashiers.remove(a);
            }
        }
    }
    public static void check(){
        for(Cashier staff: employedCashiers){
            System.out.println(staff.getName());
        }
    }
}
