package com.online.mall.mapper;

import com.online.mall.dto.OrderCart;
import com.online.mall.dto.OrderCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    long countByExample(OrderCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByExample(OrderCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByPrimaryKey(Integer cartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insert(OrderCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insertSelective(OrderCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    List<OrderCart> selectByExample(OrderCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    OrderCart selectByPrimaryKey(Integer cartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") OrderCart record, @Param("example") OrderCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExample(@Param("record") OrderCart record, @Param("example") OrderCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKeySelective(OrderCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_cart
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKey(OrderCart record);
}