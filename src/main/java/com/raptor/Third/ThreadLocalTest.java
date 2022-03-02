package com.raptor.Third;

/**
 * @author raptor
 * @description ThreadLocalTest
 * @date 2022/2/27 17:45
 */
public class ThreadLocalTest {
    private String content;

    ThreadLocal<String> local = new ThreadLocal<>();

    public String getContent() {
        //return content;
        return local.get();
    }


    public void setContent(String content) {
        //this.content = content;
        local.set(content);
    }

    public static void main(String[] args) {
        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    threadLocalTest.setContent("线程" + Thread.currentThread().getName() + "的资源");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("线程名：" + Thread.currentThread().getName() + " ----- " + threadLocalTest.getContent());
                    System.out.println("线程名：" + Thread.currentThread().getName() + " ----- " + threadLocalTest.getContent());

                }
            }, String.valueOf(i)).start();
        }
    }
}
