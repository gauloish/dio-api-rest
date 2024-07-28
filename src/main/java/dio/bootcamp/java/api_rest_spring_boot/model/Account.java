package dio.bootcamp.java.api_rest_spring_boot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String number;
    private String agency;
    @Column(scale = 12, precision = 6)
    private Double balance;
    @Column(name = "additional_limit", scale = 12, precision = 6)
    private Double limit;
}
