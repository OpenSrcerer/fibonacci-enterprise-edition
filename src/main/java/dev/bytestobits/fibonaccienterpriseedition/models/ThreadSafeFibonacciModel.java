package dev.bytestobits.fibonaccienterpriseedition.models;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ThreadSafeFibonacciModel {
    public synchronized void grabPermission() {
        log.info("Grabbed lock to calculate fibonacci!");
    }
}
