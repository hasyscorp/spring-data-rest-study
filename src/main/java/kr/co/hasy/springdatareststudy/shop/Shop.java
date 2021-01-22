package kr.co.hasy.springdatareststudy.shop;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kr.co.hasy.springdatareststudy.BaseEntity;
import kr.co.hasy.springdatareststudy.styler.Styler;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Shop extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String branchName;

    @JsonIgnore
    private String hiddenString;

    @OneToMany(mappedBy = "shop")
    private List<Styler> stylers;

}
