package com.zn.sitegroup.repository;

import com.zn.sitegroup.entity.LcProductsCampaignsEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zn on 2018/12/15.
 */
public interface IProductCampaignRepository extends JpaRepository<LcProductsCampaignsEntity,Integer> {
    List<LcProductsCampaignsEntity> findByProductId(int productId);
}
