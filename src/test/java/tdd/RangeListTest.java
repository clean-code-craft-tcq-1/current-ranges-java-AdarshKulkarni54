package tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RangeListTest
{
  @Test
  public void listIsEmptyThenTrue()
  {
    List<Integer> currentSampleList = new ArrayList<>();
    RangeList range = new RangeList();
    range.addAllRanges(currentSampleList);
    assertTrue(range.isEmpty());
  }

  @Test
  public void listIsNotEmptyThenDetectReadings()
  {
    List<Integer> currentSampleList = Arrays.asList(3, 3, 5, 4, 7, 8, 10, 11, 12);
    RangeList rangeList = new RangeList();
    rangeList.addAllRanges(currentSampleList);
    assertFalse(rangeList.getAllRanges().isEmpty());
    rangeList.detectRange();
    assertFalse(rangeList.getDetectedRange().isEmpty());
  }
}
