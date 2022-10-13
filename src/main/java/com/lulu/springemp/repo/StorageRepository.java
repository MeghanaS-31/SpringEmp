package com.lulu.springemp.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lulu.springemp.entity.ImageData;
import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {
    Optional<ImageData> findByName(String fileName);
}