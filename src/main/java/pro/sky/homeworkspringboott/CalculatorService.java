package pro.sky.homeworkspringboott;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInter {

    @Override
    public int plusCalculate(Integer num1, Integer num2) {
        validateInput(num1, num2); // Вызов проверки входных данных
        return num1 + num2;
    }

    @Override
    public int minusCalculate(Integer num1, Integer num2) {
        validateInput(num1, num2); // Вызов проверки входных данных
        return num1 - num2;
    }

    @Override
    public int multiplyCalculate(Integer num1, Integer num2) {
        validateInput(num1, num2); // Вызов проверки входных данных
        return num1 * num2;
    }

    @Override
    public int divideCalculate(Integer num1, Integer num2) {
        validateInput(num1, num2); // Вызов проверки входных данных
        if (num2 == 0) {
            throw new ArithmeticException("Ошибка: деление на ноль невозможно.");
        }
        return num1 / num2;
    }

    private void validateInput(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Ошибка: оба числа должны быть указаны.");
        }
    }
}