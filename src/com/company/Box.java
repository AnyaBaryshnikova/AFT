package com.company;

public interface Box {
    void add(Sweet sweet);
    void delete(int index);
    void deleteLast();
    double weight();
    double price();

    void reduceWeight(double minWeight);
    void reducePrice(double minPrice);

    void printSweets();
}
