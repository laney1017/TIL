package me.jungsuk_basic.ch12;

import java.util.ArrayList;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv>  tvList = new ArrayList<Tv>();
//      ArrayList<Product>  tvList = new ArrayList<Tv>();   // 타입 불일치 에러(Product, Tv)
//      List<Tv> tvList = new ArrayList<Tv>();   // OK. 다형성( List Tv 조상, ArrayList Tv 자손)

        productList.add(new Tv());  // public boolean add(Product e) Product와 그 자손 OK (다형성)
        productList.add(new Audio());

        tvList.add(new Tv()); // public boolean add(Tv e)
        tvList.add(new Tv());
//      tvList.add(new Audio()); // ERROR (Tv와 Audio는 관계가 없다(조상,자손관계가 아님))

        printAll(productList);
//      printAll(tvList);   // 컴파일 에러 발생
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list)
            System.out.println(p);
    }
}

// 실행 화면
// Tv@1e643faf
// Audio@6e8dacdf
