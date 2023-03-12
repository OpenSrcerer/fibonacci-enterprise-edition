package dev.bytestobits.fibonaccienterpriseedition.fib;


import dev.bytestobits.fibonaccienterpriseedition.dto.FibonacciCalculationDto;
import org.springframework.stereotype.Component;

@Component
public class EnterpriseFibonacciCalculatorFactory {
    public IEnterpriseFibonacciCalculator<FibonacciCalculationDto> build(int startFrom){
        return new EnterpriseFibonacciCalculatorImpl(startFrom);
    }
}
