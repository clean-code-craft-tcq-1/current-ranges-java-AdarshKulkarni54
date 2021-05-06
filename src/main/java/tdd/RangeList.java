package tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RangeList
{
  private List<Integer> currentSampleList;
  private List<Range> detectedRange;

  public void addAllRanges(final List<Integer> currentSampleList)
  {
    this.currentSampleList = currentSampleList;
  }

  public List<Integer> getAllRanges()
  {
    Collections.sort(this.currentSampleList);
    return this.currentSampleList;
  }

  public boolean isEmpty()
  {
    return false;
  }

  public void detectRange()
  {
    int start = 0;
    int readings = 0;
    List<Integer> sortedList = getAllRanges();
    List<Range> ranges = new ArrayList<>();
    for (int i = 1; i < sortedList.size(); i++)
    {
      readings++;
      if (sortedList.get(i - 1) + 1 != sortedList.get(i) && sortedList.get(i - 1) != sortedList.get(i))
      {
        ranges.add(new Range(sortedList.get(start), sortedList.get(i - 1), readings));
        readings = 0;
        start = i;
      }
    }
    ranges.add(new Range(sortedList.get(start), sortedList.get(sortedList.size() - 1), readings));
    this.detectedRange = ranges;
    displayRangeReadings();
  }

  public List<Range> getDetectedRange()
  {
    return this.detectedRange;
  }

  public void displayRangeReadings()
  {
    System.out.println(this);
  }

  @Override
  public String toString()
  {
    StringBuilder heading = new StringBuilder("Range, Reading");
    for (Range range : getDetectedRange())
    {
      heading.append("\n").append(range);
    }
    return heading.toString();
  }
}
