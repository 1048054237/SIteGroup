package com.zn.sitegroup.repository;

import com.zn.sitegroup.entity.LcProductsImagesEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zn on 2018/12/15.
 */
public interface IProductImageRepository extends JpaRepository<LcProductsImagesEntity,Long> {
    List<LcProductsImagesEntity> findByProductId(long productId);
}
