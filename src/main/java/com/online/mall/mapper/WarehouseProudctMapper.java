package com.online.mall.mapper;

import com.online.mall.dto.WarehouseProudct;
import com.online.mall.dto.WarehouseProudctExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WarehouseProudctMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    long countByExample(WarehouseProudctExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByExample(WarehouseProudctExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByPrimaryKey(Integer wpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insert(WarehouseProudct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insertSelective(WarehouseProudct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    List<WarehouseProudct> selectByExample(WarehouseProudctExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    WarehouseProudct selectByPrimaryKey(Integer wpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") WarehouseProudct record, @Param("example") WarehouseProudctExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExample(@Param("record") WarehouseProudct record, @Param("example") WarehouseProudctExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKeySelective(WarehouseProudct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse_proudct
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKey(WarehouseProudct record);
}