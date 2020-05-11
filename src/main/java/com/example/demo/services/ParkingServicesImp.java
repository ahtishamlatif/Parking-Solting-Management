package com.example.demo.services;

import com.example.demo.entities.CarParkingEntity;
import com.example.demo.repositries.ParkingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingServicesImp implements ParkingServices {
  @Autowired
  private ParkingRepo parkingRepo;
    @Override
    public CarParkingEntity SaveMyCarEnter(CarParkingEntity carParkingEntity) {
        return parkingRepo.save(carParkingEntity);
    }

  @Override
  public List<CarParkingEntity> showAllVehicle() {
      List<CarParkingEntity> list=new ArrayList<>();
      for (CarParkingEntity Vehicles: parkingRepo.findAll()
      ) {
      list.add(Vehicles);
      }
    return list;
  }

    @Override
    public CarParkingEntity editTime(int carId) {
        return parkingRepo.getOne(carId);
    }

    @Override
    public CarParkingEntity findByCarId(int carId) {
        return parkingRepo.findByCarId(carId);
    }


}
