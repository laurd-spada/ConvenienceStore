package com.ConvenienceStore.Store;

import com.ConvenienceStore.Store.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static List<Product> listOfProducts = new ArrayList<>();

    public static void getProduct(List<Product> goods){
        listOfProducts = goods;
    }

}
