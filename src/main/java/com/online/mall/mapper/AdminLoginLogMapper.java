package com.online.mall.mapper;

import com.online.mall.dto.AdminLoginLog;
import com.online.mall.dto.AdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    long countByExample(AdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int deleteByExample(AdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int deleteByPrimaryKey(Integer loginId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int insert(AdminLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int insertSelective(AdminLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    List<AdminLoginLog> selectByExample(AdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    AdminLoginLog selectByPrimaryKey(Integer loginId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByExampleSelective(@Param("record") AdminLoginLog record, @Param("example") AdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByExample(@Param("record") AdminLoginLog record, @Param("example") AdminLoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByPrimaryKeySelective(AdminLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_login_log
     *
     * @mbg.generated Tue Jul 07 15:40:19 CST 2020
     */
    int updateByPrimaryKey(AdminLoginLog record);
}