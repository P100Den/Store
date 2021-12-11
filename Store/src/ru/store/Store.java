package ru.store;

import Sport.Ball1;
import Sport.SportGoods;

public class Store<prise> {
    public static void main(String[] args) {
        Adidas p = new Adidas();
        p.checkBrand();

        SportGoods a1 = new SportGoods();
        a1.name();

        Ball1 D1 = new Ball1();
        System.out.println(D1.prise);


        SportGoods a2 = new SportGoods();
        a2.checkTheOutputOnTheShelf();
    }
}