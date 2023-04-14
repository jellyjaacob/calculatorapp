package jacoble.CalculatorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import CalcGUI.java;

@SpringBootApplication
public class CalculatorApp {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApp.class, args);
		CalcGUI calc = new CalcGUI();
	}

}
