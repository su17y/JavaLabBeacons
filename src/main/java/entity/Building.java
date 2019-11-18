package entity;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name = "BUILDING")
public class Building {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Id
    @Column(name = "address",nullable = false)
    private String address;

    @OneToMany(mappedBy = "building")
    private Set<Floor> floors;
}
