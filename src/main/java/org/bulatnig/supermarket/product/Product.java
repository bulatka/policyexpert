package org.bulatnig.supermarket.product;

public class Product {

    private Long id;
    private Type type;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    enum Type {
        ENUMERABLE,
        WEIGHED
    }

}
