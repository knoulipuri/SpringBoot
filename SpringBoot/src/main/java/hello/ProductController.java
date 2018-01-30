package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vo.Product;

@RestController
public class ProductController {

	@RequestMapping("/products")	
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product p = null;
		List<String> images = null;
		List<String> reviews = new ArrayList<String>();

		// Azurite product
		images = new ArrayList<String>();
		images.add("images/gem-02.gif");
		images.add("images/gem-05.gif");
		images.add("images/gem-09.gif");
		p = new Product("Azurite",
				"Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.",
				8, 110.50f, 7, "#CCC", 14, images, reviews);
		products.add(p);
		// Bloodstone product
		images = new ArrayList<String>();
		images.add("images/gem-01.gif");
		images.add("images/gem-03.gif");
		images.add("images/gem-04.gif");
		p = new Product("Bloodstone",
				"Origin of the Bloodstone is unknown, hence its low value. It has a very high shine and 12 sides, however.",
				9, 22.90f, 6, "#EEE", 12, images, reviews);
		products.add(p);
		// Zircon product
		images = new ArrayList<String>();
		images.add("images/gem-06.gif");
		images.add("images/gem-07.gif");
		images.add("images/gem-08.gif");
		p = new Product("Zircon",
				"Zircon is our most coveted and sought after gem. You will pay much to be the proud owner of this gorgeous and high shine gem.",
				70, 1100f, 2, "#OOO", 6, images, reviews);
		products.add(p);
		return products;
	}

}
