package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.LocalDateTime;

import io.oasp.gastronomy.restaurant.offermanagement.common.api.TimeFrame;
import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * @author MWYPYCH
 *
 */
public class SpecialSearchCriteriaTo extends SearchCriteriaTo {

  private TimeFrame timeFrame;

  private LocalDateTime checkingDate;

  private Long offerId;

  private String name;

  public SpecialSearchCriteriaTo() {
    super();
  }

  /**
   * @return timeFrame
   */
  public TimeFrame getTimeFrame() {

    return this.timeFrame;
  }

  /**
   * @param timeFrame new value of {@link #gettimeFrame}.
   */
  public void setTimeFrame(TimeFrame timeFrame) {

    this.timeFrame = timeFrame;
  }

  /**
   * @return checkingDate
   */
  public LocalDateTime getCheckingDate() {

    return this.checkingDate;
  }

  /**
   * @param checkingDate new value of {@link #getcheckingDate}.
   */
  public void setCheckingDate(LocalDateTime checkingDate) {

    this.checkingDate = checkingDate;
  }

  /**
   * @return offerId
   */
  public Long getOfferId() {

    return this.offerId;
  }

  /**
   * @param offerId new value of {@link #getofferId}.
   */
  public void setOfferId(Long offerId) {

    this.offerId = offerId;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

}
