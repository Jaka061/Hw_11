package kg.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name= "full_name" )
    private String fullName;
    @Column(name= "age")
    private Integer age;
    @Column(name= "status")
    private String status;
    @ManyToOne
    @Column(name= "team_id")
    private Teams teams;

}
