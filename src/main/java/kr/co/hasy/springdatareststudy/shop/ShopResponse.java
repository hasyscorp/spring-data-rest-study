package kr.co.hasy.springdatareststudy.shop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "shopResponse", types = Shop.class)
public interface ShopResponse {

    @Value("#{target.id}")
    String getId();

    @Value("#{target.name} #{target.branchName}")
    String getFullName();
}
