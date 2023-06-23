package com.czc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author czc
 * @since 2023-06-23
 */
@TableName("menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 菜单名字
     */
    private String menuName;

    /**
     * 菜单级别
     */
    private String menuLevel;

    /**
     * 菜单的父code
     */
    private String menuParentCode;

    /**
     * 点击触发的函数
     */
    private String menuClick;

    /**
     * 权限 0超级管理员，1表示管理员，2表示普通用户，可以用逗号组合使用
     */
    private String menuRight;

    private String menuComponent;

    private String menuIcon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }
    public String getMenuParentCode() {
        return menuParentCode;
    }

    public void setMenuParentCode(String menuParentCode) {
        this.menuParentCode = menuParentCode;
    }
    public String getMenuClick() {
        return menuClick;
    }

    public void setMenuClick(String menuClick) {
        this.menuClick = menuClick;
    }
    public String getMenuRight() {
        return menuRight;
    }

    public void setMenuRight(String menuRight) {
        this.menuRight = menuRight;
    }
    public String getMenuComponent() {
        return menuComponent;
    }

    public void setMenuComponent(String menuComponent) {
        this.menuComponent = menuComponent;
    }
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Override
    public String toString() {
        return "Menu{" +
            "id=" + id +
            ", menuCode=" + menuCode +
            ", menuName=" + menuName +
            ", menuLevel=" + menuLevel +
            ", menuParentCode=" + menuParentCode +
            ", menuClick=" + menuClick +
            ", menuRight=" + menuRight +
            ", menuComponent=" + menuComponent +
            ", menuIcon=" + menuIcon +
        "}";
    }
}
