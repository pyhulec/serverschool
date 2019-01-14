package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import javax.jdo.annotations.Unique;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;

/**
 * @author MWYPYCH
 *
 */

@Entity
@Table(name = "Special", uniqueConstraints = { @UniqueConstraint(columnNames = "name") })
public class SpecialEntity extends ApplicationPersistenceEntity implements Special {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Embedded
  private TimeFrameEmbedded timeFrame;

  private OfferEntity offer;

  private Money specialPrice;

  @Column
  @Unique
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

  @Override
  @Transient
  public Long getOfferId() {

    if (this.offer == null) {
      return null;
    }

    return this.offer.getId();
  }

  /**
   * @param offer new value of {@link #getOffer}.
   */
  public void setOffer(OfferEntity offer) {

    this.offer = offer;
  }

  /**
   * @return specialOfferPrice
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

  @ManyToOne
  @JoinColumn(name = "offerId")
  public OfferEntity getOffer() {

    return this.offer;
  }

  public void setOfferId(Long id) {

    if (id == null) {
      this.offer = null;
    } else {
      OfferEntity offerEntity = new OfferEntity();
      offerEntity.setId(id);
      this.offer = offerEntity;
    }

    setOfferId(id);
  }

}
