package com.online.mall.mapper;

import com.online.mall.dto.RoleInfo;
import com.online.mall.dto.RoleInfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleInfoMapper {
     List<RoleInfo> selectAllRoles();


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    long countByExample(RoleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByExample(RoleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insert(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int insertSelective(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    List<RoleInfo> selectByExample(RoleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    RoleInfo selectByPrimaryKey(Long roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByExample(@Param("record") RoleInfo record, @Param("example") RoleInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKeySelective(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    int updateByPrimaryKey(RoleInfo record);

    @Select("select * from role_info where name =#{0} limit 1" )
    RoleInfo findRoleByName(String name);
}