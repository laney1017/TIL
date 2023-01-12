package me.jungsuk.ch08;

import java.io.File;

public class Ex8_16 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception{
        if (fileName==null || fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않습니다.");
        File f = new File(fileName);        // File클래스의 객체를 만든다.
        // File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
        f.createNewFile();
        return f;       // 생성된 객체의 참조를 반환한다.
    }
}
/* 예외가 발생한 createFile메서드에서 예외를 처리하고,
   호출한 main메서드에게 예외가 발생했음을 알려서 파일이름을 다시 입력받도록 한다.
 */