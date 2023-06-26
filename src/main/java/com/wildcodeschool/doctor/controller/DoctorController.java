package com.wildcodeschool.doctor.controller;

import com.wildcodeschool.doctor.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class DoctorController {

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Doctor doctor(@PathVariable int number) {
        Doctor doctor15 =new Doctor(15, "Ncuti Gatwa");
        Doctor doctor14 =new Doctor(14, "David Tennant 'sorry for spoilers'");
        Doctor doctor13  =new Doctor(13, "Jodie Whittaker");
        Doctor doctor12  =new Doctor(12, "Peter Capaldi");
        Doctor doctor11  =new Doctor(11, "Matt Smith");
        Doctor doctor10  =new Doctor(10, "David Tennant");
        Doctor doctor9  =new Doctor(9, "Christopher Eccleston");
        Doctor doctor8  =new Doctor(8, "Paul McGann");
        Doctor doctor7  =new Doctor(7, "Sylvester McCoy");
        Doctor doctor6  =new Doctor(6, "Colin Baker");
        Doctor doctor5  =new Doctor(5, "Peter Davison");
        Doctor doctor4  =new Doctor(4, "Tom Baker");
        Doctor doctor3  =new Doctor(3, "Jon Pertwee");
        Doctor doctor2  =new Doctor(2, "Patrick Troughton");
        Doctor doctor1  =new Doctor(1, "william Hartnell");

        Doctor [] doctors = {
                doctor1, doctor2, doctor3,doctor4, doctor5, doctor6, doctor7,
                doctor8, doctor9, doctor10, doctor11, doctor12, doctor13,
                doctor14, doctor15};
        if (number == 13) {
            return doctor13 ;
        }
        if (number >=1 && number <= doctors.length) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "other doctor between 1 and 15");
            //OR return doctors[number - 1];
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor not Regenerated");
        }

    }
}
