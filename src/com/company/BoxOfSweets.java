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

    // удаляем самые легкие, пока вес  больше переданного
    @Override
    public void reduceWeight(double minWeight) {

        ArrayList<Sweet> temp = new ArrayList<>();
        temp.addAll(sweets);

        double boxWeight = weight();
        if(boxWeight < minWeight)
            return;
        while(boxWeight > minWeight){
            int index = findMinWeight();
            delete(index);
            boxWeight = weight();
        }
        System.out.println("\n\nПодарок после изменения веса:");
        double weight = this.weight();
        double price = this.price();
        System.out.printf("Общий вес подарка: %.2f%n", weight);
        System.out.printf("Общая цена подарка: %.2f%n", price);
        printSweets();
        sweets = temp;
    }

    // удаляем самые легкие, пока цена больше переданной
    @Override
    public void reducePrice(double minPrice) {
        ArrayList<Sweet> temp = new ArrayList<>();
        temp.addAll(sweets);
        double boxPrice = price();
        if(boxPrice < minPrice)
            return;
        while(boxPrice > minPrice){
            int index = findMinWeight();
            delete(index);
            boxPrice = price();
        }
        System.out.println("\n\nПодарок после изменения цены:");
        double weight = this.weight();
        double price = this.price();
        System.out.printf("Общий вес подарка: %.2f%n", weight);
        System.out.printf("Общая цена подарка: %.2f%n", price);
        printSweets();
        sweets = temp;

    }

//    // удаляем самые дешевые, пока цена больше переданной
//    @Override
//    public void reducePrice(double minPrice) {
//        ArrayList<Sweet> temp = new ArrayList<>();
//        for (Sweet sweet : sweets)
//            temp.add(sweet);
//        double boxPrice = price();
//        if(boxPrice < minPrice)
//            return;
//        while(boxPrice > minPrice){
//            int index = findMinPrice();
//            delete(index);
//            boxPrice = price();
//        }
//        System.out.println("\n\nПодарок после изменения цены:");
//        double weight = this.weight();
//        double price = this.price();
//        System.out.printf("Общий вес подарка: %.2f%n", weight);
//        System.out.printf("Общая цена подарка: %.2f%n", price);
//        printSweets();
//        sweets = temp;
//
//    }

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
