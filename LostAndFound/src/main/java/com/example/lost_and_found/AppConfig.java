package com.example.lost_and_found;

import org.springframework.context.annotation.Configuration;


// Конфігурація бінів Spring
@Configuration
public class AppConfig {

    // Бін типу singleton
    // @Bean
    // @Primary
    // public ItemService itemServiceSingleton(ItemRepository itemRepository) {
    //     return new ItemService(itemRepository);
    // }

    // // Бін типу prototype
    // @Bean
    // @Scope("prototype")
    // public ItemService itemServicePrototype(ItemRepository itemRepository) {
    //     return new ItemService(itemRepository);
    // }
}
