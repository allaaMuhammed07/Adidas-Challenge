package Definition;

import models.Products;

public class defineProducts extends Products {


    public void createProduct(String id, String name, String description){
        setId(id);
        setName(name);
        setDescription(description);
    }
}
