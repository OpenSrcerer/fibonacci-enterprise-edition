package dev.bytestobits.fibonaccienterpriseedition.configuration;

import dev.bytestobits.fibonaccienterpriseedition.dto.FibonacciCalculationDto;
import dev.bytestobits.fibonaccienterpriseedition.fib.EnterpriseFibonacciCalculatorFactory;
import dev.bytestobits.fibonaccienterpriseedition.fib.IEnterpriseFibonacciCalculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnterpriseFibonacciConfiguration {

    private final EnterpriseFibonacciCalculatorFactory enterpriseFibonacciCalculatorFactory;

    public EnterpriseFibonacciConfiguration(
            EnterpriseFibonacciCalculatorFactory enterpriseFibonacciCalculatorFactory
    ) {
        this.enterpriseFibonacciCalculatorFactory = enterpriseFibonacciCalculatorFactory;
    }

    @Value("${calculate.fibonacci.up.to:45}")
    private int calculateFibonacciUpTo;

    @Bean
    public IEnterpriseFibonacciCalculator<FibonacciCalculationDto> enterpriseFibonacciCalculator() {
        return enterpriseFibonacciCalculatorFactory.build(calculateFibonacciUpTo);
    }
}
