package com.book.flight.entity;
import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "`role`")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private int roleID;
    @Column(name="role_name")
    private String roleName;
    @ManyToMany
    @JoinTable(name="operator_role", joinColumns=@JoinColumn(name="role_id"), inverseJoinColumns=@JoinColumn(name="operator_id"))
    private Collection<Operator> operators;

    public Role () {
    }

    public int getRoleID () {
        return roleID;
    }

    public void setRoleID ( int roleID ) {
        this.roleID = roleID;
    }

    public String getRoleName () {
        return roleName;
    }

    public void setRoleName ( String roleName ) {
        this.roleName = roleName;
    }

    public Collection<Operator> getOperators () {
        return operators;
    }

    public void setOperators ( Collection<Operator> operators ) {
        this.operators = operators;
    }

    @Override
    public String toString () {
        return "Role{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
