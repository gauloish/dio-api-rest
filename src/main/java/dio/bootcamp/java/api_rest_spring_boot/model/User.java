package dio.bootcamp.java.api_rest_spring_boot.model;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private Account account;
    private List<Card> cards;
    private List<Feature> features;
    private List<News> news;
}
