package com.online.mall.mapper;

import com.online.mall.dto.ProductSupplierInfo;
import com.online.mall.dto.ProductSupplierInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSupplierInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    long countByExample(ProductSupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByExample(ProductSupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByPrimaryKey(Integer supplierId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insert(ProductSupplierInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insertSelective(ProductSupplierInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    List<ProductSupplierInfo> selectByExample(ProductSupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    ProductSupplierInfo selectByPrimaryKey(Integer supplierId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProductSupplierInfo record, @Param("example") ProductSupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExample(@Param("record") ProductSupplierInfo record, @Param("example") ProductSupplierInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKeySelective(ProductSupplierInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplier_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKey(ProductSupplierInfo record);
}