package com.online.mall.mapper;

import com.online.mall.dto.ProductInfo;
import com.online.mall.dto.ProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    long countByExample(ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int deleteByExample(ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int deleteByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int insert(ProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int insertSelective(ProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    List<ProductInfo> selectByExampleWithBLOBs(ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    List<ProductInfo> selectByExample(ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    ProductInfo selectByPrimaryKey(Integer productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int updateByPrimaryKeySelective(ProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(ProductInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_info
     *
     * @mbg.generated Tue Jul 07 09:52:34 CST 2020
     */
    int updateByPrimaryKey(ProductInfo record);
}