package com.company;

import java.util.ArrayList;

public class BoxOfSweets implements Box{
    private ArrayList<Sweet> sweets = new ArrayList<>();

    public BoxOfSweets() {
    }

    @Override
    public void add(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void delete(int index) {
        sweets.remove(index);

    }

    @Override
    public void deleteLast() {
        sweets.remove(sweets.size() - 1);

    }

    @Override
    public double weight() {
        double sum = 0;
        for (Sweet sweet : sweets) {
            sum += sweet.getWeight();
        }
        return sum;

    }

    @Override
    public double price() {
        double sum = 0;
        for (Sweet sweet : sweets) {
            sum += sweet.getPrice();
        }
        return sum;
    }

    @Override
    public void reduceWeight(double minWeight) {
        double boxWeight = weight();
        if(boxWeight < minWeight)
            return;
        while(boxWeight > minWeight){
            int index = findMinWeight();
            delete(index);
            boxWeight = weight();
        }
    }

    @Override
    public void reducePrice(double minPrice) {
        double boxPrice = price();
        if(boxPrice < minPrice)
            return;
        while(boxPrice > minPrice){
            int index = findMinPrice();
            delete(index);
            boxPrice = price();
        }

    }

    private int findMinPrice(){
        int index = 0;
        for(int i = 1; i < sweets.size(); ++i)
        {
            if(sweets.get(i).getPrice() < sweets.get(index).getPrice())
                index = i;
        }
        return index;
    }

    private int findMinWeight(){
        int index = 0;
        for(int i = 1; i < sweets.size(); ++i)
        {
            if(sweets.get(i).getWeight() < sweets.get(index).getWeight())
                index = i;
        }
        return index;
    }

    @Override
    public void printSweets() {
        for (Sweet sweet : sweets) System.out.println(sweet.toString());
    }
}
