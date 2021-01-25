package kr.co.hasy.springdatareststudy.shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    @RestResource(path = "name")
    List<Shop> findAllByName(String name);
    @RestResource(path = "branchName")
    List<Shop> findAllByBranchName(String branchName);

}
