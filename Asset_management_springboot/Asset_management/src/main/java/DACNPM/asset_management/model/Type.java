package DACNPM.asset_management.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="type")
public class Type {
    @Id
    @Column(name="type_id")
    private int typeId;

    @Column(name="type_name")
    private String typeName;


}

