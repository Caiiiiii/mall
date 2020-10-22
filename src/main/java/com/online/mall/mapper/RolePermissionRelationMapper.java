package com.online.mall.mapper;

import com.online.mall.dto.PermissionInfo;
import com.online.mall.dto.RoleInfo;
import com.online.mall.dto.RolePermissionRelation;
import com.online.mall.dto.RolePermissionRelationExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RolePermissionRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    long countByExample(RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int deleteByExample(RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int deleteByPrimaryKey(Long rolePermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int insert(RolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int insertSelective(RolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    List<RolePermissionRelation> selectByExample(RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    RolePermissionRelation selectByPrimaryKey(Long rolePermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByExample(@Param("record") RolePermissionRelation record, @Param("example") RolePermissionRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByPrimaryKeySelective(RolePermissionRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    int updateByPrimaryKey(RolePermissionRelation record);

    @Delete("delete from role_permission_relation where role_id = #{0}")
    void deleteAllByRoleId(Long roleId);

    @Select("select b.* from role_permission_relation a inner " +
            "join permission_info b on a.permission_id = b.permission_id where a.role_id = #{0}")
    List<PermissionInfo> getPermissionByRoleId(Long roleId);

    List<RoleInfo> selectAllRoles();
}