package org.motechproject.ws;

import org.junit.Test;
import org.motechproject.ws.rct.PregnancyTrimester;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PatientTest {

    @Test
    public void shouldDetermineIfPatientHasRegisteredPregnancy(){
        Patient patient = new Patient();
        assertFalse(patient.isPregnancyRegistered());
        Patient pregnantPatient = new Patient();
        pregnantPatient.setEstimateDueDate(new Date());
        assertTrue(pregnantPatient.isPregnancyRegistered());

    }

    @Test
    public void shouldDetermineTrimesterAsSecond(){
        Patient patient = new Patient();
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MONTH,5);
        patient.setEstimateDueDate(instance.getTime());
        assertTrue(patient.isPregnancyRegistered());
        assertTrue(PregnancyTrimester.SECOND.equals(patient.pregnancyTrimester()));
    }
    
    @Test
    public void shouldDetermineTrimesterAsThird(){
        Patient patient = new Patient();
        Calendar currentDate = Calendar.getInstance();
        currentDate.add(Calendar.MONTH,2);
        Date estimatedDueDate = currentDate.getTime();
        patient.setEstimateDueDate(estimatedDueDate);
        assertTrue(patient.isPregnancyRegistered());
        assertTrue(PregnancyTrimester.THIRD.equals(patient.pregnancyTrimester()));
    }
}
