package aCcount;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by user on 11.12.2016.
 */
public class AccountSync {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        ReentrantLock locker = new ReentrantLock();
        Transaction[] transactions = {
                new Transaction(acc, 100, locker),
                new Transaction(acc, 500, locker),
                new Transaction(acc, 200, locker),
                new Transaction(acc, 50, locker),
                new Transaction(acc, 150, locker)
        };


        // запускаем транзакции
        for (Transaction t : transactions)
            t.start();

        // ждем их завершения
        for (Transaction t : transactions) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // на экране 0 или "ерунда" если убрать synchronized
        System.out.println("Total: " + acc.get());
    }
}

