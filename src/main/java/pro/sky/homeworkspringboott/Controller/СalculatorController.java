package pro.sky.homeworkspringboott.Controller;


import pro.sky.homeworkspringboott.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class СalculatorController {

    private final CalculatorService calculatorService;

    public СalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/plus")
    public String plusCalculate(@RequestParam(value = "num1", required = false) Integer firstInt,
                                @RequestParam(value = "num2", required = false) Integer secondInt) {
        try {
            return "Результат: " + calculatorService.plusCalculate(firstInt, secondInt);
        } catch (IllegalArgumentException | ArithmeticException e) {
            return e.getMessage();
        }
    }

    @GetMapping(path = "/minus")
    public String minusCalculate(@RequestParam(value = "num1", required = false) Integer firstInt,
                                 @RequestParam(value = "num2", required = false) Integer secondInt) {
        try {
            return "Результат: " + calculatorService.minusCalculate(firstInt, secondInt);
        } catch (IllegalArgumentException | ArithmeticException e) {
            return e.getMessage();
        }
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculate(@RequestParam(value = "num1", required = false) Integer firstInt,
                                    @RequestParam(value = "num2", required = false) Integer secondInt) {
        try {
            return "Результат: " + calculatorService.multiplyCalculate(firstInt, secondInt);
        } catch (IllegalArgumentException | ArithmeticException e) {
            return e.getMessage();
        }
    }

    @GetMapping(path = "/divide")
    public String divideCalculate(@RequestParam(value = "num1", required = false) Integer firstInt,
                                  @RequestParam(value = "num2", required = false) Integer secondInt) {
        try {
            return "Результат: " + calculatorService.divideCalculate(firstInt, secondInt);
        } catch (IllegalArgumentException | ArithmeticException e) {
            return e.getMessage();
        }
    }
}
