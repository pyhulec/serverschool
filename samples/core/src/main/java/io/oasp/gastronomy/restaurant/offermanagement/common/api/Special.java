package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.TimeFrameEmbedded;

/**
 * @author MWYPYCH
 *
 */
public interface Special extends ApplicationEntity {

  /**
   * @param timeFrame for the special
   */
  void setTimeFrame(TimeFrameEmbedded timeFrame);

  /**
   * @return time frame when the offer is available
   */
  TimeFrameEmbedded getTimeFrame();

  /**
   * @param name of the special
   */
  void setName(String name);

  /**
   * @return name of the Special
   */
  String getName();

  Long getOfferId();

  void setOfferId(Long offerId);

  Money getSpecialPrice();

  void setSpecialPrice(Money price);

}
