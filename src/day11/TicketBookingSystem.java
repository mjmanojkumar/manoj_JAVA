package day11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

    class TicketBookingSystem {
    private int availableTickets;
    private Lock lock;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
        this.lock = new ReentrantLock();
    }

    public void bookTickets(int numTickets, String threadName) {
        lock.lock(); // Acquire the lock
        try {
            if (availableTickets >= numTickets) {
                // Simulate some delay to mimic the ticket booking process
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Book the tickets
                System.out.println(threadName + ": Booking " + numTickets + " tickets.");
                availableTickets -= numTickets;
                System.out.println(threadName + ": Tickets booked successfully. Available tickets: " + availableTickets);
            } else {
                System.out.println(threadName + ": Insufficient tickets. Available tickets: " + availableTickets);
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

    class BookingThread implements Runnable {
    private TicketBookingSystem bookingSystem;
    private int numTickets;
    private String threadName;

    public BookingThread(TicketBookingSystem bookingSystem, int numTickets, String threadName) {
        this.bookingSystem = bookingSystem;
        this.numTickets = numTickets;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        bookingSystem.bookTickets(numTickets, threadName);
    }
}


