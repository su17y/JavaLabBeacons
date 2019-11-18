package entity;

import lombok.Data;

import javax.persistence.*;

@Data
public class Floor {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "number", nullable = false)
    private int number;

    @Basic
    @Column(name = "x1", nullable = false)
    private double x1;

    @Column(name = "x2", nullable = false)
    private double x2;

    @Column(name = "y1", nullable = false)
    private double y1;

    @Column(name = "y2", nullable = false)
    private double y2;

    @ManyToOne
    @JoinColumn(
            name = "portal_id",
            referencedColumnName = "id",
            nullable = false
    )
    private Portal portal;

    @ManyToOne
    @JoinColumn(
            name = "building_id",
            referencedColumnName = "id",
            nullable = false
    )
    private Building building;
}
