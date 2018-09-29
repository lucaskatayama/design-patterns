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
    Calculator sumCalculator = new SumCalculator();
    Calculator averageCalculator = new AverageCalculator();

    // Monthly with Mean
    Map<String, Collection<Event>> accumulateResult = monthlyAccumulator.accumulate(events);
    Map<String, Double> calculateResult = averageCalculator.calculate(accumulateResult);
    System.err.println(calculateResult);

    // Monthly with Sum
    calculateResult = sumCalculator.calculate(accumulateResult);
    System.err.println(calculateResult);


    // Yearly with mean
    accumulateResult = annuallyAccumulator.accumulate(events);
    calculateResult = averageCalculator.calculate(accumulateResult);
    System.err.println(calculateResult);

    // Yearly with mean
    calculateResult = sumCalculator.calculate(accumulateResult);
    System.err.println(calculateResult);
  }
}
