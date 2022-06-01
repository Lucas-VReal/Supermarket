package br.com.supermarket.api.models;

import jakarta.persistence.*;

@Entity
@Table (name = "produtos")
public class products {

    public products (Long id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;

    }

    public products(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_type")
    private String type;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
