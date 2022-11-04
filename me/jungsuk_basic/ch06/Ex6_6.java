package me.jungsuk_basic.ch06;

class Data {int x; }
class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
//실행화면
//main() : x = 10
//change() : x = 1000
//After change(d.x)
//main() : x = 10