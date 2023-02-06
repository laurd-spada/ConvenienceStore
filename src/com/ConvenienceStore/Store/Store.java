package com.ConvenienceStore.Store;

import com.ConvenienceStore.Store.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static List<Product> listOfProducts = new ArrayList<>();

    public void setProduct(List<Product> stock){
        this.listOfProducts = stock;
    }
    public static List<Product> getProduct(){
        return listOfProducts;
    }


}
