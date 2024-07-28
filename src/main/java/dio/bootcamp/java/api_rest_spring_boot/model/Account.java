package dio.bootcamp.java.api_rest_spring_boot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private Long id;
    private String number;
    private String agency;
    private Double balance;
    private Double limit;
}
