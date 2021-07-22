package com.company;

public class Main {

    public static void main(String[] args) {
        Chocolate alenka = new Chocolate("Аленка", 250, 100);
        Chocolate milka = new Chocolate("Milka", 300, 300);

        Marmeladka haribo = new Marmeladka("Haribo", 150, 80);
        Marmeladka chervyachok = new Marmeladka("Кислые червячки", 200, 290);

        Biscuit barni = new Biscuit("Barni", 500, 400);
        Biscuit chocopai = new Biscuit("Choco Pai" , 50, 70);

        BoxOfSweets present = new BoxOfSweets();

        present.add(alenka);
        present.add(milka);
        present.add(haribo);
        present.add(chervyachok);
        present.add(barni);
        present.add(chocopai);

        double weight = present.weight();
        double price = present.price();
        System.out.printf("Общий вес подарка: %.2f%n", weight);
        System.out.printf("Общая цена подарка: %.2f%n", price);
        System.out.println("Сладости в подарке: ");
        present.printSweets();


        System.out.println("\n\nПодарок после изменения веса:");
        present.reduceWeight(1300);
        weight = present.weight();
        price = present.price();
        System.out.printf("Общий вес подарка: %.2f%n", weight);
        System.out.printf("Общая цена подарка: %.2f%n", price);
        present.printSweets();



        System.out.println("\n\nПодарок после изменения цены:");
        present.reducePrice(800);
        weight = present.weight();
        price = present.price();
        System.out.printf("Общий вес подарка: %.2f%n", weight);
        System.out.printf("Общая цена подарка: %.2f%n", price);
        present.printSweets(); }

}
