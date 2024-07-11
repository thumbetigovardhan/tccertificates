package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import com.neoteric.javatdd.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void test() {
        Student student = new Student();
        student.name = "Govardhan";
        student.age = 23;
        student.standard = "1st";
        Address address = new Address();
        address.city = "GNT";
        address.area = "2 town";
        address.street = "pattabhipuram";
        address.flatNo = "11-39";
        address.pinCode = "522006";
        student.address = address;
        StudentService ss = new StudentService();
        Admission admission =ss.getAdmission(student);


        Assertions.assertEquals(50000.00,admission.fee);
        Assertions.assertNotNull(admission.rollNo);
    }
}
