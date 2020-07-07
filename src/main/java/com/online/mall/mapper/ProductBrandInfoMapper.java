package com.online.mall.mapper;

import com.online.mall.dto.ProductBrandInfo;
import com.online.mall.dto.ProductBrandInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductBrandInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    long countByExample(ProductBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int deleteByExample(ProductBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int deleteByPrimaryKey(Short brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int insert(ProductBrandInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int insertSelective(ProductBrandInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    List<ProductBrandInfo> selectByExample(ProductBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    ProductBrandInfo selectByPrimaryKey(Short brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProductBrandInfo record, @Param("example") ProductBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByExample(@Param("record") ProductBrandInfo record, @Param("example") ProductBrandInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByPrimaryKeySelective(ProductBrandInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByPrimaryKey(ProductBrandInfo record);
}