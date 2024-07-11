package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;

import java.util.UUID;

public class StudentService {

    public Admission getAdmission(Student stud) {
        Admission admission = null;
        if (stud.age>6) {
            admission = new Admission();
            admission.rollNo="4H9" + UUID.randomUUID().toString();
            admission.standard = stud.standard;
            admission.fee = 50000.00;

        }

        return admission;

    }
}
