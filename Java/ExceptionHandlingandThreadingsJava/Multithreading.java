package Java.ExceptionHandlingandThreadingsJava;
//import java.util.*;
class MyThread1 extends Thread{
    public void run(){
        for(int i = 1; i <= 3; i++){
    System.out.println("Main thread starting "+i);
    try{
        Thread.sleep(500);
    }catch(Exception e){
        System.out.println("thread interrupted");
    }
}
}
}
class MyThread3 extends Thread{
    public void run(){
        System.out.println("thread 2 is running");
    }
}

class MyRunnable implements Runnable {

    public void run(){
        for(int i = 1; i <= 3; i++){
    System.out.println("Main thread starts"+i);
    try{
        Thread.sleep(500);
    }catch(Exception e){
        System.out.println("thread interrupted");
    }
}
}
}

public class Multithreading{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
 
        
        MyThread3 t3 = new MyThread3();
        t3.start();
        
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("the main thread ends");

         MyRunnable obj = new MyRunnable();

        Thread t = new Thread(obj);

        t.start();



    }
}
