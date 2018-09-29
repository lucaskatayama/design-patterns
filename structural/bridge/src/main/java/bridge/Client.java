package bridge;

import bridge.accumulator.Accumulator;
import bridge.accumulator.MonthlyAccumulator;
import bridge.accumulator.AnnuallyAccumulation;
import bridge.calculator.Calculator;
import bridge.calculator.AverageCalculator;
import bridge.calculator.SumCalculator;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

public class Client {

  public static void main(String[] args) {
    Collection<Event> events = new LinkedList<Event>();
    events.add(new Event(2018,1,1, 1.0));
    events.add(new Event(2018,2,1, 1.0));
    events.add(new Event(2018,3,1, 1.0));
    events.add(new Event(2018,4,2, 1.0));
    events.add(new Event(2018,5,1, 1.0));
    events.add(new Event(2018,6,3, 1.0));
    events.add(new Event(2018,7,1, 1.0));
    events.add(new Event(2018,8,1, 1.0));
    events.add(new Event(2018,1,1, 2.0));
    events.add(new Event(2018,2,1, 2.0));
    events.add(new Event(2018,3,1, 2.0));
    events.add(new Event(2018,4,2, 2.0));
    events.add(new Event(2018,5,3, 2.0));
    events.add(new Event(2018,6,1, 2.0));
    events.add(new Event(2019,7,2, 2.0));
    events.add(new Event(2019,8,3, 2.0));


    Accumulator monthlyAccumulator = new MonthlyAccumulator();
    Accumulator annuallyAccumulator = new AnnuallyAccumulation();

    Calculator calculator;
    Map<String, Double> calculateResult;

    // average with montlhy
    calculator = new AverageCalculator(monthlyAccumulator);
    calculateResult = calculator.calculate(events);
    System.err.println(calculateResult);

    // Sum with monthly
    calculator = new SumCalculator(monthlyAccumulator);
    calculateResult =  calculator.calculate(events);
    System.err.println(calculateResult);


    // Average with annually
    calculator = new AverageCalculator(annuallyAccumulator);
    calculateResult =  calculator.calculate(events);
    System.err.println(calculateResult);

    // Sum with annually
    calculator = new SumCalculator(annuallyAccumulator);
    calculateResult = calculator.calculate(events);
    System.err.println(calculateResult);
  }
}
