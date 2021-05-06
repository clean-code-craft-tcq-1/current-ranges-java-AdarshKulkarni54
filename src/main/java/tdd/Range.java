package tdd;

public class Range
{
  private int startRange;
  private int endRange;
  private int readings;

  public Range(final int startRange, final int endRange, final int readings)
  {
    this.startRange = startRange;
    this.endRange = endRange;
    this.readings = readings;
  }

  public int getStartRange()
  {
    return this.startRange;
  }

  public int getEndRange()
  {
    return this.endRange;
  }

  @Override
  public String toString()
  {
    return String.format("%d-%d, \t%d", this.startRange, this.endRange, this.readings);
  }

  /**
   * @return the readings
   */
  public int getReadings()
  {
    return this.readings;
  }
}
