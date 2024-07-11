package com.neoteric.javatdd.service;

import com.neoteric.javatdd.collegeTc.ReceiptDetails;
import com.neoteric.javatdd.collegeTc.StudentForm;

public class StudentReceiptService {
    public ReceiptDetails getReceipt(StudentForm s1) {
        ReceiptDetails receiptDetails = null;
        if (s1.money == 3000) {
            receiptDetails = new ReceiptDetails();
            receiptDetails.receipt = receiptDetails.receipt;
            receiptDetails.name = receiptDetails.name;

            receiptDetails.redNo = receiptDetails.redNo;
        }
        return receiptDetails;
    }
}
