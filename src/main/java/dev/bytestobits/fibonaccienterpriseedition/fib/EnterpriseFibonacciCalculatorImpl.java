package dev.bytestobits.fibonaccienterpriseedition.fib;

import dev.bytestobits.fibonaccienterpriseedition.dto.FibonacciCalculationDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class EnterpriseFibonacciCalculatorImpl implements IEnterpriseFibonacciCalculator<FibonacciCalculationDto> {

    private int start;

    @Override
    public FibonacciCalculationDto calculate() {
        return new FibonacciCalculationDto(calculateEnterpriseFibonacciValue(start));
    }

    private int calculateEnterpriseFibonacciValue(int number) {
        if (number <= 1) return number;
        return calculateEnterpriseFibonacciValue(number - 1) + calculateEnterpriseFibonacciValue(number - 2);
    }
}
