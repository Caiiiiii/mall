package com.online.mall.dto;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   角色和权限关系表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role_permission_relation
 */
public class RolePermissionRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission_relation.role_permission_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Long rolePermissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission_relation.role_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission_relation.permission_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private Long permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission_relation.role_permission_id
     *
     * @return the value of role_permission_relation.role_permission_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission_relation.role_permission_id
     *
     * @param rolePermissionId the value for role_permission_relation.role_permission_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setRolePermissionId(Long rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission_relation.role_id
     *
     * @return the value of role_permission_relation.role_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission_relation.role_id
     *
     * @param roleId the value for role_permission_relation.role_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission_relation.permission_id
     *
     * @return the value of role_permission_relation.permission_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission_relation.permission_id
     *
     * @param permissionId the value for role_permission_relation.permission_id
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission_relation
     *
     * @mbg.generated Fri Jul 17 15:24:46 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolePermissionId=").append(rolePermissionId);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}