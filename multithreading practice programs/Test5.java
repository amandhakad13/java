class Atm {
    int balance;

    Atm(int balance) {
        this.balance = balance;
    }

    synchronized public void transaction(int withdraw) {
        balance = balance-withdraw;
        System.out.println(Thread.currentThread().getName()+" Current balance = "+balance+" (-"+withdraw+")");
    }
}

class MyThread3 extends Thread {
    Atm a1;
    int withdraw;

    MyThread3(Atm a1, int withdraw) {
        this.a1 = a1;
        this.withdraw = withdraw;
    }

    public void run() {
        a1.transaction(withdraw);
    }
    
}

class Test5 {
    public static void main(String[] args) {
        Atm a1 = new Atm(10000);
        MyThread3 ob1 = new MyThread3(a1, 2000);
        MyThread3 ob2 = new MyThread3(a1, 2000);
        ob1.setName("User1");
        ob2.setName("User2");
        ob1.start();
        ob2.start();

    }
}