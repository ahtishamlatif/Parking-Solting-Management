package com.example.demo.Controller;

import com.example.demo.entities.CarParkingEntity;
import com.example.demo.services.ParkingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WebController {
    @Autowired
    private ParkingServices parkingServices;

    @RequestMapping("/welcome")
    public String indexpage() {
        return "index";

    }

    @RequestMapping("/new-car-form")
    public String NewRegistration() {
        return "NewRegistration";
    }

    @RequestMapping("/register")
    public RedirectView insertData(@ModelAttribute CarParkingEntity carParkingEntity, BindingResult result, HttpServletRequest request) {
        if (carParkingEntity.getCarNmber() != null) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            carParkingEntity.setTimeIn(timestamp);
            parkingServices.SaveMyCarEnter(carParkingEntity);
          Integer id=  carParkingEntity.getCarId();
            System.out.println(id);
        }
        return new RedirectView("/new-car-form");
    }


    @RequestMapping("/allVehicle")
    public String allVehicl(HttpServletRequest request) {
        request.setAttribute("list", parkingServices.showAllVehicle());

        return "allVehicle";
    }

    @RequestMapping("/mark-as-timeout")
    public RedirectView timeout(@RequestParam int carId, HttpServletRequest request) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //carParkingEntity.setTimeOut(timestamp);
        //parkingServices.editTime(carId);
        CarParkingEntity carData=parkingServices.findByCarId(carId);
        carData.setTimeOut(timestamp);
        parkingServices.SaveMyCarEnter(carData);
        return new RedirectView("/allVehicle");
    }
}
