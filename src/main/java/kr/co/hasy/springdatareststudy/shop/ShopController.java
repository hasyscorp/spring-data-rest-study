package kr.co.hasy.springdatareststudy.shop;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
public class ShopController {

    @GetMapping("/shops/custom/{id}")
    @ResponseBody
    public ShopResponse2 get(@PathVariable("id") Shop shop) {
        return ShopResponse2.builder()
                .id(shop.getId())
                .build();
    }

    @Deprecated
    @GetMapping("/custom/{id}")
    @ResponseBody
    public ShopResponse2 getNotWorking(@PathVariable("id") Shop shop) {
        return ShopResponse2.builder()
                .id(shop.getId())
                .build();
    }
}
