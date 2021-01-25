package kr.co.hasy.springdatareststudy.shop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopResponse2 {
    Long id;
}
