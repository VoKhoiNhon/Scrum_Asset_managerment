package DACNPM.asset_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="account")
public class Account {

    @Id
    @Column(name="id_account")
    private Integer id_account;

    @Column(name="password")
    private String password;

    @Column(name="role")
    private int role;


}
