package com.lover.system.entity.mybatis;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lhf
 * @since 2019-06-09
 */
@TableName("system_user")
public class SystemUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户编码
     */
    @NotBlank(message = "用户编码不能为空")
    @Length(min = 0, max = 10, message = "用户编码长度不正确")
    @Pattern(regexp = "^[0-9a-zA-Z_]+$", message = "用户编码只能由数字、字母、下划线组成")
    @TableField("user_code")
    private String userCode;

    /**
     * 用户姓名
     */
    @NotBlank(message = "用户姓名不能为空")
    @Length(min = 0, max = 10, message = "用户姓名长度不正确")
    @TableField("user_name")
    private String userName;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 唯一的uuid
     */
    @TableField("user_uuid")
    private String userUuid;

    /**
     * 身份证号
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 手机号码
     */
    @TableField("tele_no")
    private String teleNo;

    /**
     * 生日
     */
    @TableField("birthday")
    private LocalDateTime birthday;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 删除时间
     */
    @TableField("delete_time")
    private LocalDateTime deleteTime;

    /**
     * 是否禁用
     */
    @TableField("is_disable")
    private Integer isDisable;

    /**
     * 禁用时间
     */
    @TableField("disable_time")
    private LocalDateTime disableTime;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTeleNo() {
        return teleNo;
    }

    public void setTeleNo(String teleNo) {
        this.teleNo = teleNo;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    public LocalDateTime getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(LocalDateTime disableTime) {
        this.disableTime = disableTime;
    }

    @Override
    public String toString() {
        return "SystemUserEntity{" +
        "userId=" + userId +
        ", userCode=" + userCode +
        ", userName=" + userName +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", userUuid=" + userUuid +
        ", idCard=" + idCard +
        ", teleNo=" + teleNo +
        ", birthday=" + birthday +
        ", isDelete=" + isDelete +
        ", deleteTime=" + deleteTime +
        ", isDisable=" + isDisable +
        ", disableTime=" + disableTime +
        "}";
    }
}
