package com.company;

public abstract class Sweet {
    private double price;
    private double weight;
    private String name;

    public Sweet() {
    }

    public Sweet(String name, double weight, double price) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(name + "," + " вес: %.2f, цена: %.2f", weight, price);
    }
}
