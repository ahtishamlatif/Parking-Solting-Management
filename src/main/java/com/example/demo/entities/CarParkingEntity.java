package com.example.demo.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "car_parking", schema = "parking_data", catalog = "")
public class CarParkingEntity {
    private int carId;
    private String carNmber;
    private String parkingArea;
    private String lineNmber;
    private String slotNmber;
    private Timestamp timeIn;
    private Timestamp timeOut;

    @Id
    @Column(name = "car_id")
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }



// Git Test

    @Basic
    @Column(name = "car_nmber")
    public String getCarNmber() {
        return carNmber;
    }

    public void setCarNmber(String carNmber) {
        this.carNmber = carNmber;
    }

    @Basic
    @Column(name = "parking_area")
    public String getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(String parkingArea) {
        this.parkingArea = parkingArea;
    }

    @Basic
    @Column(name = "line_nmber")
    public String getLineNmber() {
        return lineNmber;
    }

    public void setLineNmber(String lineNmber) {
        this.lineNmber = lineNmber;
    }

    @Basic
    @Column(name = "slot_nmber")
    public String getSlotNmber() {
        return slotNmber;
    }

    public void setSlotNmber(String slotNmber) {
        this.slotNmber = slotNmber;
    }

    @Basic
    @Column(name = "Time_in")
    public Timestamp getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Timestamp timeIn) {
        this.timeIn = timeIn;
    }

    @Basic
    @Column(name = "Time_out")
    public Timestamp getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Timestamp timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarParkingEntity that = (CarParkingEntity) o;
        return carId == that.carId &&
                Objects.equals(carNmber, that.carNmber) &&
                Objects.equals(parkingArea, that.parkingArea) &&
                Objects.equals(lineNmber, that.lineNmber) &&
                Objects.equals(slotNmber, that.slotNmber) &&
                Objects.equals(timeIn, that.timeIn) &&
                Objects.equals(timeOut, that.timeOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carNmber, parkingArea, lineNmber, slotNmber, timeIn, timeOut);
    }
}
