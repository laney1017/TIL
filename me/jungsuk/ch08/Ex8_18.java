package me.jungsuk.ch08;

public class Ex8_18 {
    public static void main(String[] args) {
        try {
            startInstall();     // 프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();  // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        }
    }

    static void startInstall() {
        /* 프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/
    }
    static void copyFiles() {
        /* 파일들을 복사하는 코드를 적는다. */
    }
    static void deleteTempFiles() {
        /* 임시파일들을 삭제하는 코드를 적는다. */
    }
}
/* Ex8_17의 예외의 발생여부에 관계없이 실행되어야 할 deleteTempFiles()를 finally블럭으로 변형하였다. */