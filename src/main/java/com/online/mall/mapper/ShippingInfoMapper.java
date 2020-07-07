package com.online.mall.mapper;

import com.online.mall.dto.ShippingInfo;
import com.online.mall.dto.ShippingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    long countByExample(ShippingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int deleteByExample(ShippingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int deleteByPrimaryKey(Byte shipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int insert(ShippingInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int insertSelective(ShippingInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    List<ShippingInfo> selectByExample(ShippingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    ShippingInfo selectByPrimaryKey(Byte shipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") ShippingInfo record, @Param("example") ShippingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByExample(@Param("record") ShippingInfo record, @Param("example") ShippingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByPrimaryKeySelective(ShippingInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipping_info
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByPrimaryKey(ShippingInfo record);
}