package com.example.demo.contoller;

import com.example.demo.models.RequestDTO;
import com.example.demo.models.Category;
import com.example.demo.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return new ArrayList<>();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long Id){
        return new Product();
    }
    @GetMapping("/products/category")
    public List<Category> getAllCategories(){
        return  new ArrayList<>();
    }
    @GetMapping("/products/category/{catName}")
    public List<Product> getAllProducts(@PathVariable("catName") String categoryName){
        return  new ArrayList<>();
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody RequestDTO requestDTO){
        return new Product();
    }
    @PatchMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long Id, @RequestBody RequestDTO requestDTO){
        return new Product();
    }
    @PutMapping ("/products/{id}")
    public Product replaceProduct(@PathVariable("id") Long Id, @RequestBody RequestDTO requestDTO){
        if(requestDTO.getTitle()==null || requestDTO.getDescription()==null || requestDTO.getCategory()==null || requestDTO.getImage()==null ){
            return null;}

        return new Product();
    }
}
