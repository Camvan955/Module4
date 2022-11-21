package com.codegym.service.impl;

import com.codegym.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {


    @Override
    public double Calculator(double number_one, double number_two, String calculus) {

        switch (calculus) {
            case "addition":
                return number_one + number_two;
            case "subtraction":
                return number_one - number_two;
            case "multiplication":
                return number_one * number_two;
            case "division":
                return number_one / number_two;
            default:
                return 0;
        }

    }
}