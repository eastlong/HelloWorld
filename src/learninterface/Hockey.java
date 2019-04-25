package learninterface;

public interface Hockey extends Sports {
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int Period);
    public void overtimePeriod(int ot);
}
