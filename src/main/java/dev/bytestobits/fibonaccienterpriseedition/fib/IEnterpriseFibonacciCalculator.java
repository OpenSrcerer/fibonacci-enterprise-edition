package dev.bytestobits.fibonaccienterpriseedition.fib;

import dev.bytestobits.fibonaccienterpriseedition.dto.FibonacciCalculationDto;

public interface IEnterpriseFibonacciCalculator<T extends FibonacciCalculationDto> {
    T calculate();
}
