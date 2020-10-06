package com.capgemini.dailysession;

@FunctionalInterface
interface MathFunction {
	int calculate(int a, int b);

	static void printResult(int a, int b, String function, MathFunction calObj) {
		System.out.println("Result of " + function + " = " + calObj.calculate(a, b));
	}
}

interface MyFunctionalInterface {
	public String sayParam();
}

public class MathOperationApp {

	public static void main(String[] args) {
		MathFunction add = (int a, int b) -> a + b;
		MathFunction multiply = (a, b) -> a * b;
		MathFunction divide = (a, b) -> {
			if (b == 0) {
				return 0;
			} else {
				return a / b;
			}
		};

		MyFunctionalInterface msg = () -> "Hello";

		System.out.println("Returned message : " + msg.sayParam());
		System.out.println("Add : " + add.calculate(5, 10));
		System.out.println("Multiply : " + multiply.calculate(89, 78));
		System.out.println("Divide : " + divide.calculate(8, 2));

		MathFunction.printResult(10, 5, "Addition", add);
		MathFunction.printResult(10, 5, "Multiplication", multiply);
		MathFunction.printResult(10, 0, "Division", divide);
	}
}
