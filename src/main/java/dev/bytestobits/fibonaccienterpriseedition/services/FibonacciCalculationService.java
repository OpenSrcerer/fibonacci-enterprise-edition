package dev.bytestobits.fibonaccienterpriseedition.services;

import dev.bytestobits.fibonaccienterpriseedition.dto.FibonacciCalculationDto;
import dev.bytestobits.fibonaccienterpriseedition.fib.IEnterpriseFibonacciCalculator;
import dev.bytestobits.fibonaccienterpriseedition.models.ThreadSafeFibonacciModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FibonacciCalculationService {
    private final IEnterpriseFibonacciCalculator<FibonacciCalculationDto> enterpriseFibonacciCalculator;
    private final ThreadSafeFibonacciModel threadSafeFibonacciModel;

    public FibonacciCalculationService(
            IEnterpriseFibonacciCalculator<FibonacciCalculationDto> enterpriseFibonacciCalculator,
            ThreadSafeFibonacciModel threadSafeFibonacciModel
    ) {
        this.enterpriseFibonacciCalculator = enterpriseFibonacciCalculator;
        this.threadSafeFibonacciModel = threadSafeFibonacciModel;
    }

    public void calculateFibonacci() {
        try {
            this.threadSafeFibonacciModel.grabPermission();
            log.info("Calculating fibonacci number...");
            log.info(String.format("Fibonacci number is: %s", enterpriseFibonacciCalculator.calculate()));
            log.info("Thank you for using Fibonacci enterprise edition...");
        } catch (Exception ex) {
            log.error("Failed to calculate fibonacci!", ex);
        }
    }
}
