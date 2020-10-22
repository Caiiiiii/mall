package com.online.mall.mapper;

import com.online.mall.dto.ProductComment;
import com.online.mall.dto.ProductCommentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    long countByExample(ProductCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int deleteByExample(ProductCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int insert(ProductComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int insertSelective(ProductComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    List<ProductComment> selectByExample(ProductCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    ProductComment selectByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProductComment record, @Param("example") ProductCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByExample(@Param("record") ProductComment record, @Param("example") ProductCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByPrimaryKeySelective(ProductComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_comment
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByPrimaryKey(ProductComment record);
}