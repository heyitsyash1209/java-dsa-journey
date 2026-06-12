package Java.ExceptionHandlingandThreadingsJava;
class counter{
    int count = 0;

    public void Increment(){
        count++;
    }
}
class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i ++) {
            if(i%2==0){
                System.out.println("Even : " + i);
            } 
              try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd : " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class thread{
    public static void main(String[] args)throws InterruptedException{
        counter c = new counter();

        Runnable task = () ->{
            for(int i = 1; i <10; i++){
                c.Increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final value of counter is : " + c.count);
        EvenThread t3 = new EvenThread();
        OddThread t4 = new OddThread();

        t3.start();
        t4.start();

    }
}