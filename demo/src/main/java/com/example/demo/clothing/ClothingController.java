package com.example.demo.clothing;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

//import com.example.demo.Clothing;

@RestController
@RequestMapping("/clothing")
public class ClothingController {

    private final ClothingRepository clothingRepository;

    public ClothingController(ClothingRepository clothingRepository) {
        this.clothingRepository = clothingRepository;
    }

    @GetMapping
    public List<Clothing> getAllClothing() {
        return clothingRepository.findAll();
    }

    @GetMapping("/{id}")
    public Clothing getClothingById(@PathVariable("id") Long id) {
        System.out.println("Fetching clothing with ID: " + id);

        return clothingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clothing not found with ID: " + id));
    }

    @PostMapping
    public Clothing addClothing(@RequestBody Clothing clothing) {
        return clothingRepository.save(clothing);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClothingById(@PathVariable Long id) {
        if (clothingRepository.existsById(id)) {
            clothingRepository.deleteById(id);
            return ResponseEntity.ok("Clothing item deleted successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Clothing not found with ID: " + id);
        }
    }
}