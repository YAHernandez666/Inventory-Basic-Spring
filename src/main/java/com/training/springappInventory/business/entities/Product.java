package com.training.springappInventory.business.entities;

public class Product {
	private String description;
    private Double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
	public String toString() {
        StringBuffer bf = new StringBuffer();
        bf.append("Descripcion del producto: " + description + ";");
        bf.append("Precio: " + price);
        return bf.toString();
    }

}
