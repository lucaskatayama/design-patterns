package template;

public abstract class StepsTemplate {

    abstract protected void step1();

    abstract protected void step2();


    void execute() {
        step1();
        step2();
    }
}
