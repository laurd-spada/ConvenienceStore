package com.ConvenienceStore.Store.Personnel.Staff;

import com.ConvenienceStore.Store.Product.Product;
import com.ConvenienceStore.Store.Store;

import java.util.ArrayList;
import java.util.List;

public class Cashier extends Store{
    // Creating a constructor
    /**
     * This constructor is responsible for creating new teachers object.
     * @param id id for the cashier. not going to change id, if its set
     * @param name name of the cashier. not going to change name, if its set
     * @param salary salary of the cashier. going to change id, if it's a promotion
     * **/
    private int id;
    private String name;
    private int salary;
    static List<Product> customerProducts = new ArrayList<>();
    public Cashier(){}

    public Cashier(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    /**
     * @return id of cashier
     * */
    public int getId() {
        return id;
    }
    /**
     * @return name of cashier
     * */
    public String getName() {
        return name;
    }
    /**
     * @return salary of cashier
     * */
    public int getSalary() {
        return salary;
    }

    public void sellProduct(List<Product> orderedProduct){
        for(Product a: orderedProduct){
            for(Product x: getProduct()){
                if(a.getName().equals(x.getName())){
                    customerProducts.add(a);
                }
            }
        }
    }
    public void dispenseReceipt(){
        System.out.println(customerProducts.toString());
    }
}
