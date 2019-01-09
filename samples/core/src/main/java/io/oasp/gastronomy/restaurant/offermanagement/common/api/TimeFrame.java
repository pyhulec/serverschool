package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import java.time.DayOfWeek;

/**
 * @author MWYPYCH
 *
 */
public interface TimeFrame {

  DayOfWeek getStartDay();

  void setStartDay(DayOfWeek dayOfWeek);

  DayOfWeek getEndDay();

  void setEndDay(DayOfWeek dayOfWeek);

  Integer getStartHour();

  void setStartHour(Integer startHour);

  Integer getEndHour();

  void setEndHour(Integer endHour);
}
