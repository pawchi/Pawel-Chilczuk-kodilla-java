package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCT")
public final class Product {
    private int id;
    private String name;
    private Item item;

    public Product(String name) {
        this.name = name;
    }

    public Product(){
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "ITEM_ID")
        public Item getItem() {
            return item;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
