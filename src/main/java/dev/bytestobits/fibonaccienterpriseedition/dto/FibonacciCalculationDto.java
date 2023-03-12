package dev.bytestobits.fibonaccienterpriseedition.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@AllArgsConstructor
public class FibonacciCalculationDto {
    private int value;

    @Override
    public String toString() {
        return "" + value;
    }
}
