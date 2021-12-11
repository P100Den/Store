package ru.store;

public class Product {
    public String name;
    public int price;
    public  String item;

    public  void putOnTheShelf(){
        System.out.println("Продукт был положен на полку");
        }
    public void takeFromTheShelf(){
            System.out.println("Продукт был взят с полки");
        }

    public void choiceProduct(){
            System.out.println("Продукт был выбран");
        }

    public  void buy(){
            System.out.println("Продукт куплен");
        }


    }

