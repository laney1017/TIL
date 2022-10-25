package me.jungsuk_basic.ch12;

class Ex12_7{
    public static void main(String[] args) {
        class Parent {
            void parentMethod() { }
        }

        class Child extends Parent {
            // 조상의 메서드 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
            @Override
            //void parentmethod() { }    // 조상 메서드의 이름을 잘못 적었음
            void parentMethod() { }
        }
    }
}

// 실행 결과
// error : method does not override or implement a method from a supertype

