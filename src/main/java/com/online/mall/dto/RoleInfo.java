package com.online.mall.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   角色表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role_info
 */
public class RoleInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.role_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Long roleId;

    /**
     * Database Column Remarks:
     *   名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String name;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.description
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private String description;

    /**
     * Database Column Remarks:
     *   后台用户数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.admin_count
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer adminCount;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.create_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   启用状态：0->禁用；1->启用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.status
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.sort
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.role_id
     *
     * @return the value of role_info.role_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.role_id
     *
     * @param roleId the value for role_info.role_id
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.name
     *
     * @return the value of role_info.name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.name
     *
     * @param name the value for role_info.name
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.description
     *
     * @return the value of role_info.description
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.description
     *
     * @param description the value for role_info.description
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.admin_count
     *
     * @return the value of role_info.admin_count
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getAdminCount() {
        return adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.admin_count
     *
     * @param adminCount the value for role_info.admin_count
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.create_time
     *
     * @return the value of role_info.create_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.create_time
     *
     * @param createTime the value for role_info.create_time
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.status
     *
     * @return the value of role_info.status
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.status
     *
     * @param status the value for role_info.status
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.sort
     *
     * @return the value of role_info.sort
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.sort
     *
     * @param sort the value for role_info.sort
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated Fri Jul 17 15:24:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", adminCount=").append(adminCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}