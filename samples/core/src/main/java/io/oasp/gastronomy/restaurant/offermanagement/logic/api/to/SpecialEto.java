package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.TimeFrameEmbedded;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author MWYPYCH
 *
 */
public class SpecialEto extends AbstractEto implements Special {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private TimeFrameEmbedded timeFrame;

  private Long offerId;

  private Money specialPrice;

  private String name;

  /**
   * @return timeFrame
   */
  public TimeFrameEmbedded getTimeFrame() {

    return this.timeFrame;
  }

  /**
   * @param timeFrame new value of {@link #getTimeFrame}.
   */

  @Override
  public void setTimeFrame(TimeFrameEmbedded timeFrame) {

    this.timeFrame = timeFrame;
  }

  /**
   * @return offer
   */
  public Long getOfferId() {

    return this.offerId;
  }

  /**
   * @param offer new value of {@link #getOffer}.
   */
  public void setOfferId(Long offerId) {

    this.offerId = offerId;
  }

  /**
   * @return specialPrice
   */
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  /**
   * @param specialPrice new value of {@link #getSpecialPrice}.
   */
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getName}.
   */
  public void setName(String name) {

    this.name = name;
  }

}
