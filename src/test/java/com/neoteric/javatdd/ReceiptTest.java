package com.neoteric.javatdd;

import com.neoteric.javatdd.collegeTc.ReceiptDetails;
import com.neoteric.javatdd.collegeTc.StudentForm;
import com.neoteric.javatdd.service.StudentReceiptService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ReceiptTest {
    @Test
    public void test() {
        StudentForm studentForm = new StudentForm();
        studentForm.name = "Govardhan";
        studentForm.redNo = "20JR1A04H9";
        studentForm.contactNo = 630295446;
        studentForm.email = "t@123";
        studentForm.Standard = "4th year";
        studentForm.fatherName = "Venakteswarlu";
        studentForm.money = 3000;
        studentForm.date = new Date();
        StudentReceiptService srs = new StudentReceiptService();
        ReceiptDetails receiptDetails = srs.getReceipt(studentForm);


        Assertions.assertEquals(3000,studentForm.money);

    }
}
