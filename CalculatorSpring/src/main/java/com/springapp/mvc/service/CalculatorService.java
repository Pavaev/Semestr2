package com.springapp.mvc.service;

import com.springapp.mvc.exception.NotValidException;

import java.util.regex.Pattern;

/**
 * Created by Daniel Shchepetov on 16.03.2016.
 */
public class CalculatorService implements ICalculatorService {

    @Override
    public int calculate(String op1, String op2, String operation) throws NotValidException {
        validate(op1, op2);
        int result = 0;
        switch (operation) {
            case "+":
                result = Integer.parseInt(op1) + Integer.parseInt(op2);
            case "-":
                result = Integer.parseInt(op1) - Integer.parseInt(op2);
            case "*":
                result = Integer.parseInt(op1) * Integer.parseInt(op2);
            case "/":
                result = Integer.parseInt(op1) / Integer.parseInt(op2);
        }

        return result;
    }

    @Override
    public void validate(String op1, String op2) throws NotValidException {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        if (!pattern.matcher(op1).matches() || !pattern.matcher(op2).matches()) {
            throw new NotValidException("Вы заполнили не все поля или использовали недопустимые символы(разрешены только цифры)");
        }
    }
}
