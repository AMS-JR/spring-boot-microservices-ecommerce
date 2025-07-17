package com.eca.inventoryservice;

import com.eca.inventoryservice.model.Inventory;
import com.eca.inventoryservice.repository.InventoryRepository;
import com.eca.inventoryservice.service.InventoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryService inventoryService, InventoryRepository inventoryRepository){
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_15");
            inventory.setQuantity(100);

            Inventory anotherInventory = new Inventory();
            anotherInventory.setSkuCode("iphone_15_blue");
            anotherInventory.setQuantity(0);

            inventoryRepository.save(inventory);
            inventoryRepository.save(anotherInventory);
        };
    }
}
