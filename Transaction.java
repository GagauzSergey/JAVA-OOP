package aCcount;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by user on 11.12.2016.
 */
class Transaction extends Thread {
    private Account account;
    private int withdraw;
    private ReentrantLock locker;

    public Transaction(Account account, int withdraw, ReentrantLock lock) {
        this.account = account;
        this.withdraw = withdraw;
        this.locker=lock;
    }

    public void run() {
        try { // спим для эмуляции реального многопоточного доступа к ресурсу
            locker.lock();
            Thread.sleep(System.currentTimeMillis() % 50);
      //  synchronized (account) { // снимаем деньги со счета
            int total = account.get();
            if (total >= withdraw)
                account.set(total - withdraw);
 //       }
        } catch (InterruptedException e) {}
        finally {
            locker.unlock();
        }
    }
}