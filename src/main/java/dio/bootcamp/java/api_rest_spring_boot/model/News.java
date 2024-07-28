package dio.bootcamp.java.api_rest_spring_boot.model;

import dio.bootcamp.java.api_rest_spring_boot.model.base.Item;
import jakarta.persistence.Entity;

@Entity(name = "tb_news")
public class News extends Item {}