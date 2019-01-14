package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import static com.querydsl.core.alias.Alias.$;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.querydsl.core.alias.Alias;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.TimeFrameEmbedded;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;

/**
 * @author MWYPYCH
 *
 */
@Named
public class SpecialDaoImpl extends ApplicationMasterDataDaoImpl<SpecialEntity> implements SpecialDao {

  private SpecialEntity special = Alias.alias(SpecialEntity.class);

  /**
   * The constructor.
   */
  public SpecialDaoImpl() {
    super();
  }

  @Override
  protected Class<SpecialEntity> getEntityClass() {

    return SpecialEntity.class;
  }

  @Override
  public List<SpecialEntity> findActiveSpecials(SpecialSearchCriteriaTo criteria) {

    if (criteria == null) {
      return new ArrayList<>(0);
    }

    List<SpecialEntity> result = getAavilableSpecialsQuery(criteria).fetch();
    return result;
  }

  @Override
  public Money findBestActiveSpecial(SpecialSearchCriteriaTo criteria) {

    if (criteria == null) {
      return null;
    }
    JPQLQuery<SpecialEntity> query = getAavilableSpecialsQuery(criteria);

    query.orderBy($(this.special.getSpecialPrice()).asc());
    return (query.fetchCount() > 0) ? query.fetchFirst().getSpecialPrice() : null;
  }

  /**
   *
   */
  private JPQLQuery<SpecialEntity> getAavilableSpecialsQuery(SpecialSearchCriteriaTo criteria) {

    SpecialEntity special = Alias.alias(SpecialEntity.class);
    JPQLQuery<SpecialEntity> query = new JPAQuery<SpecialEntity>(getEntityManager()).from($(special));

    OfferEntity offer = Alias.alias(OfferEntity.class);
    if (criteria.getOfferId() != null && criteria.getOfferId() > 0) {
      query = query.join($(special.getOffer()), $(offer));
      query.where($(offer.getId()).loe(criteria.getOfferId()));
    }

    TimeFrameEmbedded timeFrame = Alias.alias(TimeFrameEmbedded.class);
    if (criteria.getCheckingDate() != null) {
      query = query.join($(special.getTimeFrame()), $(timeFrame));
      query.where($(timeFrame.getStartDay()).loe(criteria.getCheckingDate().getDayOfWeek()));
      query.where($(timeFrame.getEndDay()).goe(criteria.getCheckingDate().getDayOfWeek()));
      query.where($(timeFrame.getStartHour()).loe(criteria.getCheckingDate().getHour()));
      query.where($(timeFrame.getEndHour()).goe(criteria.getCheckingDate().getHour()));
    }
    return query;
  }
}
