package net.chrisrichardson.ftgo.restaurantservice.web;

import net.chrisrichardson.ftgo.restaurantservice.domain.RestaurantMenu;

public class GetRestaurantResponse {

  private RestaurantMenu menu;

  public RestaurantMenu getMenu() {
    return menu;
  }

  private Long id;
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  public GetRestaurantResponse() {
  }

  public GetRestaurantResponse(Long id, String name, RestaurantMenu menu) {
    this.id = id;
    this.name = name;
    this.menu = menu;
  }
}
