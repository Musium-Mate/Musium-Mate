package com.dev.museummate.repository;

import com.dev.museummate.domain.entity.UserEntity;
import com.dev.museummate.security.oauth.ProviderType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByUserName(String userName);
    Optional<UserEntity> findByEmail(String email);
    Optional<UserEntity> findByProviderTypeAndProviderId(ProviderType providerType, String providerId);
}
