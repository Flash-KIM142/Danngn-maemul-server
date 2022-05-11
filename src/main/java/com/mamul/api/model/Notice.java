package com.mamul.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@ToString
@Entity
public class Notice {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String brand;
    @Column
    private Integer price;
    @Column
    private boolean isUsed;
    @Column
    private String details;
    @Column
    private String usedDesc;
    @Column
    private boolean inPerson;
    @Column
    private boolean canPost;

    @Builder
    public Notice(
            Long id,
            String name,
            String brand,
            Integer price,
            boolean isUsed,
            String details,
            String usedDesc,
            boolean inPerson,
            boolean canPost
    ){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isUsed = isUsed;
        this.details = details;
        this.usedDesc = usedDesc;
        this.inPerson = inPerson;
        this.canPost = canPost;
    }

}
