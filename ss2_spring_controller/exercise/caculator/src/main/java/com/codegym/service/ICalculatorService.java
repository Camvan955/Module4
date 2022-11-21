package com.codegym.service;

import org.springframework.ui.Model;

public interface ICalculatorService {
    double Calculator(double number_one, double number_two, String calculus);
}
