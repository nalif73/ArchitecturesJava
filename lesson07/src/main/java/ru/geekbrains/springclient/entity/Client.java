package ru.geekbrains.springclient.entity;



import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

}
