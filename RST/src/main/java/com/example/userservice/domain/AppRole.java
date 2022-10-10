package com.example.userservice.domain;

import javax.persistence.*;

@Entity
@Table(name = "app_role", schema = "tnet_pro", catalog = "")
public class AppRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "role_id", nullable = false)
    private long roleId;
    @Basic
    @Column(name = "role_name", nullable = false, length = 30)
    private String roleName;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppRole appRole = (AppRole) o;

        if (roleId != appRole.roleId) return false;
        if (roleName != null ? !roleName.equals(appRole.roleName) : appRole.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
