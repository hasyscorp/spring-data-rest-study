package kr.co.hasy.springdatareststudy;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;

import java.time.LocalDateTime;

@Configuration
public class RepositoryEventListener extends AbstractRepositoryEventListener<BaseEntity> {

    @Override
    public void onBeforeSave(BaseEntity baseEntity) {
        baseEntity.setUpdatedAt(LocalDateTime.now());
    }

    @Override
    public void onBeforeCreate(BaseEntity baseEntity) {
        LocalDateTime now = LocalDateTime.now();
        baseEntity.setCreatedAt(now);
        baseEntity.setUpdatedAt(now);
    }
}
