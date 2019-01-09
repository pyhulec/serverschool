package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import java.time.DayOfWeek;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author MWYPYCH
 *
 */
@Embeddable
public class TimeFrameEmbedded {
  // implements TimeFrame {

  private DayOfWeek startDay;

  @Min(0)
  @Max(24)
  private Integer startHour;

  private DayOfWeek endDay;

  @Min(0)
  @Max(24)
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
   * @return startHour
   */
  public Integer getStartHour() {

    return this.startHour;
  }

  /**
   * @param startHour new value of {@link #getstartHour}.
   */
  public void setStartHour(Integer startHour) {

    this.startHour = startHour;
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
