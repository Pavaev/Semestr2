package com.springapp.mvc.service;

import com.springapp.mvc.exception.NotValidException;

/**
 * Created by Daniel Shchepetov on 16.03.2016.
 */
public interface ICalculatorService {
    void validate(String op1, String op2) throws NotValidException;
    int calculate(String op1, String op2, String operation) throws NotValidException;
}
