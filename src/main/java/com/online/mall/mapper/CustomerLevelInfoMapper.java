package com.online.mall.mapper;

import com.online.mall.dto.CustomerLevelInfo;
import com.online.mall.dto.CustomerLevelInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerLevelInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    long countByExample(CustomerLevelInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByExample(CustomerLevelInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByPrimaryKey(Byte customerLevel);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insert(CustomerLevelInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insertSelective(CustomerLevelInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    List<CustomerLevelInfo> selectByExample(CustomerLevelInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    CustomerLevelInfo selectByPrimaryKey(Byte customerLevel);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") CustomerLevelInfo record, @Param("example") CustomerLevelInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExample(@Param("record") CustomerLevelInfo record, @Param("example") CustomerLevelInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKeySelective(CustomerLevelInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_level_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKey(CustomerLevelInfo record);
}