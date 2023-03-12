package dev.bytestobits.fibonaccienterpriseedition.hooks;

import dev.bytestobits.fibonaccienterpriseedition.services.FibonacciCalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EnterpriseFibonacciApplicationStartupCalculationHandler implements ApplicationListener<ApplicationReadyEvent> {

    private final FibonacciCalculationService fibonacciCalculationService;

    public EnterpriseFibonacciApplicationStartupCalculationHandler(
            FibonacciCalculationService fibonacciCalculationService
    ) {
        this.fibonacciCalculationService = fibonacciCalculationService;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.warn("Application is ready to begin calculating fibonacci!");
        this.fibonacciCalculationService.calculateFibonacci();
    }
}
