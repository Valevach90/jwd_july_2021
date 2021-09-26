package com.epam.concurrent_example;

import com.epam.concurrent_example.buyerThread.Buyer;
import com.epam.concurrent_example.buyerThread.RestaurantCashBoxes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Exchanger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Runner {
    private static final Logger logger = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        BlockingQueue<RestaurantCashBoxes> cashBoxes = new ArrayBlockingQueue<>(2, true, List.
                of(new RestaurantCashBoxes(), new RestaurantCashBoxes()));
        logger.info("Кассы созданы");
        Exchanger<Integer>exchanger = new Exchanger<>();
        Buyer buyer1 = new Buyer("Миша", cashBoxes,exchanger);
        Buyer buyer2 = new Buyer("Саша", cashBoxes, exchanger);
        Buyer buyer3 = new Buyer("Артем", cashBoxes, exchanger);
        List<Thread> threads = Stream.of(buyer1, buyer2, buyer3)
                .map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());
        logger.info("Покупатели обслуживаются в кассе");
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
               logger.error("ошибка "+e.getLocalizedMessage());
            }
        }


    }
}
