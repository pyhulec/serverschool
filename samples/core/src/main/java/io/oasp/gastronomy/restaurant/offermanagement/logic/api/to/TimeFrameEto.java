package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.DayOfWeek;

import io.oasp.gastronomy.restaurant.offermanagement.common.api.TimeFrame;

/**
 * @author MWYPYCH
 *
 */
public class TimeFrameEto implements TimeFrame {

  private DayOfWeek startDay;

  private DayOfWeek endDay;

  private Integer startHour;

  private Integer endHour;

  /**
   * @return startDay
   */
  public DayOfWeek getStartDay() {

    return this.startDay;
  }

  /**
   * @param startDay new value of {@link #getstartDay}.
   */
  public void setStartDay(DayOfWeek startDay) {

    this.startDay = startDay;
  }

  /**
   * @return endDay
   */
  public DayOfWeek getEndDay() {

    return this.endDay;
  }

  /**
   * @param endDay new value of {@link #getendDay}.
   */
  public void setEndDay(DayOfWeek endDay) {

    this.endDay = endDay;
  }

  /**
   * @return startingHour
   */
  public Integer getStartHour() {

    return this.startHour;
  }

  /**
   * @param startingHour new value of {@link #getstartingHour}.
   */
  public void setStartHour(Integer startHour) {

    this.startHour = startHour;
  }

  /**
   * @return endHour
   */
  public Integer getEndHour() {

    return this.endHour;
  }

  /**
   * @param endHour new value of {@link #getendHour}.
   */
  public void setEndHour(Integer endHour) {

    this.endHour = endHour;
  }

}
