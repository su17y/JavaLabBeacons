package entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Portal {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "x", nullable = false)
    private double x;

    @Basic
    @Column(name = "y", nullable = false)
    private double y;


}
