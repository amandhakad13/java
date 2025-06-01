class Table {
    synchronized void printTable(int n) {
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

class MyThread1 extends Thread {

    Table t;
    int n;

    MyThread1(int n, Table t) {
        this.n = n;
        this.t = t;
    }

    public void run() {
        t.printTable(n);
    }
}

class Test3 {
    public static void main(String[] args) {
        System.out.println("Main method start");
        Table t = new Table();
        MyThread1 ob1 = new MyThread1(2, t);
        MyThread1 ob2 = new MyThread1(5, t);
        MyThread1 ob3 = new MyThread1(10, t);

        ob1.start();
        ob2.start();
        ob3.start();
        System.out.println("Main method close");
    }
}