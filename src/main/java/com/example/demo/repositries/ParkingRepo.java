package com.example.demo.repositries;

import com.example.demo.entities.CarParkingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepo extends JpaRepository<CarParkingEntity,Integer> {
    CarParkingEntity findByCarId(int carId);

}
