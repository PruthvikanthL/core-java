package service;

import dto.CarDto;
import repository.CarReop;
import repository.CarReopImplimentaion;

public class CarServiceImplimentation implements CarService {
    @Override
    public boolean verfication(CarDto carDto) {
        if(carDto!=null){
            if(carDto.getCarname().length()>3){
                System.out.println("Car Name is valid");
                CarReop carReop=new CarReopImplimentaion();
                return carReop.peristant(carDto);
            }
        }
        System.out.println("Car is  not valid");
        return false;
    }
}
