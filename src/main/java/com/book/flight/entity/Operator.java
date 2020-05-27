package com.book.flight.entity;
import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "`operator`")
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="operator_id")
    private int operatorID;
    private String password;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String email;
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name="operator_role", joinColumns=@JoinColumn(name="operator_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
    private Collection<Role> roles;

    public Operator () {
    }

    public int getOperatorID () {
        return operatorID;
    }

    public void setOperatorID ( int operatorID ) {
        this.operatorID = operatorID;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public Collection<Role> getRoles () {
        return roles;
    }

    public void setRoles ( Collection<Role> roles ) {
        this.roles = roles;
    }

    @Override
    public String toString () {
        return "Operator{" +
                "operatorID=" + operatorID +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
//                ", roles=" + roles.forEach (  ); +
                '}';
    }
}
