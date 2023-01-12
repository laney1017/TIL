package me.jungsuk.ch08;

public class Ex8_20 {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);    // 예외가 발생하지 않는다.
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e){
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);     // 예외가 발생하지 않는다.
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ")가 호출됨");

        if (exception)
            throw new WorkException("WorkException발생!!!");
    }
    public void close() throws CloseException {
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseException발생!!!");
    }
}

class WorkException extends Exception {
    WorkException(String msg) { super(msg);}
}
class CloseException extends Exception {
    CloseException(String msg) { super(msg);}
}
//실행결과
//exceptionWork(false)가 호출됨
//close()가 호출됨
//me.jungsuk.ch08.CloseException: CloseException발생!!!
//	at me.jungsuk.ch08.CloseableResource.close(Ex8_20.java:33)
//	at me.jungsuk.ch08.Ex8_20.main(Ex8_20.java:7)

//exceptionWork(true)가 호출됨
//close()가 호출됨
//me.jungsuk.ch08.WorkException: WorkException발생!!!
//	at me.jungsuk.ch08.CloseableResource.exceptionWork(Ex8_20.java:29)
//	at me.jungsuk.ch08.Ex8_20.main(Ex8_20.java:15)
//	Suppressed: me.jungsuk.ch08.CloseException: CloseException발생!!!
//		at me.jungsuk.ch08.CloseableResource.close(Ex8_20.java:33)
//		at me.jungsuk.ch08.Ex8_20.main(Ex8_20.java:14)