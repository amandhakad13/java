class Table1 {
    void printTable(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n+" X "+i+" = "+n*i);
            try {
                Thread.sleep(200);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 extends Thread {

    Table1 t;
    int n;

    MyThread2(int n, Table1 t) {
        this.n = n;
        this.t = t;
    }

    public void run() {
        synchronized(this.t) {
            t.printTable(n);
        }
    }
}

class Test4 {
    public static void main(String[] args) {
        System.out.println("Main method start");
        Table1 t = new Table1();
        MyThread2 ob1 = new MyThread2(2, t);
        MyThread2 ob2 = new MyThread2(5, t);
        MyThread2 ob3 = new MyThread2(10, t);

        ob1.start();
        ob2.start();
        ob3.start();
        System.out.println("Main method close");
    }
}