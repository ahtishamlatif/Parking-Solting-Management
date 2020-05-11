package com.example.demo.services;

import com.example.demo.entities.CarParkingEntity;

import java.util.List;

public interface ParkingServices {
    CarParkingEntity SaveMyCarEnter(CarParkingEntity carParkingEntity);
    List<CarParkingEntity> showAllVehicle();
    CarParkingEntity editTime(int carId);
    CarParkingEntity findByCarId(int carId);
}
