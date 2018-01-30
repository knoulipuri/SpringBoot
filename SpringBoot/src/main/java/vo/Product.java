package vo;

import java.util.List;

public class Product {

	private String name;
	private String description;
	private int shine;
	private float price;
	private int rarity;
	private String color;
	private int faces;
	private List<String> images;
	private List<String> reviews;
   
	public Product(String name, String description, int shine, float price, int rarity, String color, int faces,
			List<String> images, List<String> reviews) {
		super();
		this.name = name;
		this.description = description;
		this.shine = shine;
		this.price = price;
		this.rarity = rarity;
		this.color = color;
		this.faces = faces;
		this.images = images;
		this.reviews = reviews;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getShine() {
		return shine;
	}

	public void setShine(int shine) {
		this.shine = shine;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFaces() {
		return faces;
	}

	public void setFaces(int faces) {
		this.faces = faces;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<String> getReviews() {
		return reviews;
	}

	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", shine=" + shine + ", price=" + price
				+ ", rarity=" + rarity + ", color=" + color + ", faces=" + faces + ", images=" + images + ", reviews="
				+ reviews + "]";
	}
}
