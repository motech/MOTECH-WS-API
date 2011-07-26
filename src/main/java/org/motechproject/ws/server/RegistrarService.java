/**
 * MOTECH PLATFORM OPENSOURCE LICENSE AGREEMENT
 *
 * Copyright (c) 2010-11 The Trustees of Columbia University in the City of
 * New York and Grameen Foundation USA.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of Grameen Foundation USA, Columbia University, or
 * their respective contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY GRAMEEN FOUNDATION USA, COLUMBIA UNIVERSITY
 * AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL GRAMEEN FOUNDATION
 * USA, COLUMBIA UNIVERSITY OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.motechproject.ws.server;

import org.motechproject.ws.*;
import org.motechproject.ws.rct.RCTRegistrationConfirmation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

/**
 * The service endpoint interface for the major motech server web service
 * endpoint. The annotations allow for minimal configuration deployment of
 * JAX-WS enpoints and clients, with appropriate behavior and metadata.
 */
@WebService
public interface RegistrarService {

    @WebMethod
    public void recordPatientHistory(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "date") Date date,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "lastIPT") Integer lastIPT,
            @WebParam(name = "lastIPTDate") Date lastIPTDate,
            @WebParam(name = "lastTT") Integer lastTT,
            @WebParam(name = "lastTTDate") Date lastTTDate,
            @WebParam(name = "bcgDate") Date bcgDate,
            @WebParam(name = "lastOPV") Integer lastOPV,
            @WebParam(name = "lastOPVDate") Date lastOPVDate,
            @WebParam(name = "lastPenta") Integer lastPenta,
            @WebParam(name = "lastPentaDate") Date lastPentaDate,
            @WebParam(name = "measlesDate") Date measlesDate,
            @WebParam(name = "yellowFeverDate") Date yellowFeverDate,
            @WebParam(name = "lastIPTI") Integer lastIPTI,
            @WebParam(name = "lastIPTIDate") Date lastIPTIDate,
            @WebParam(name = "lastVitaminADate") Date lastVitaminADate)
            throws ValidationException;

    @WebMethod
    public void recordMotherANCVisit(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "date") Date date,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "serialNumber") String serialNumber,
            @WebParam(name = "visitNumber") Integer visitNumber,
            @WebParam(name = "location") Integer location,
            @WebParam(name = "house") String house,
            @WebParam(name = "community") String community,
            @WebParam(name = "estDeliveryDate") Date estDeliveryDate,
            @WebParam(name = "bpSystolic") Integer bpSystolic,
            @WebParam(name = "bpDiastolic") Integer bpDiastolic,
            @WebParam(name = "weight") Double weight,
            @WebParam(name = "ttDose") Integer ttDose,
            @WebParam(name = "iptDose") Integer iptDose,
            @WebParam(name = "iptReactive") Boolean iptReactive,
            @WebParam(name = "itnUse") Boolean itnUse,
            @WebParam(name = "fht") Double fht,
            @WebParam(name = "fhr") Integer fhr,
            @WebParam(name = "urineTestProtein") Integer urineTestProtein,
            @WebParam(name = "urineTestGlucose") Integer urineTestGlucose,
            @WebParam(name = "hemoglobin") Double hemoglobin,
            @WebParam(name = "vdrlReactive") Boolean vdrlReactive,
            @WebParam(name = "vdrlTreatment") Boolean vdrlTreatment,
            @WebParam(name = "dewormer") Boolean dewormer,
            @WebParam(name = "maleInvolved") Boolean maleInvolved,
            @WebParam(name = "pmtct") Boolean pmtct,
            @WebParam(name = "preTestCounseled") Boolean preTestCounseled,
            @WebParam(name = "hivTestResult") HIVResult hivTestResult,
            @WebParam(name = "postTestCounseled") Boolean postTestCounseled,
            @WebParam(name = "pmtctTreatment") Boolean pmtctTreatment,
            @WebParam(name = "referred") Boolean referred,
            @WebParam(name = "nextANCDate") Date nextANCDate,
            @WebParam(name = "comments") String comments)
            throws ValidationException;

    @WebMethod
    public void recordPregnancyTermination(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "date") Date date,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "terminationType") Integer terminationType,
            @WebParam(name = "procedure") Integer procedure,
            @WebParam(name = "complications") Integer[] complications,
            @WebParam(name = "maternalDeath") Boolean maternalDeath,
            @WebParam(name = "referred") Boolean referred,
            @WebParam(name = "postAbortionFPCounseled") Boolean postAbortionFPCounseled,
            @WebParam(name = "postAbortionFPAccepted") Boolean postAbortionFPAccepted,
            @WebParam(name = "comments") String comments)
            throws ValidationException;

    @WebMethod
    public Patient[] recordPregnancyDelivery(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "datetime") Date datetime,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "mode") Integer mode,
            @WebParam(name = "outcome") Integer outcome,
            @WebParam(name = "deliveryLocation") Integer deliveryLocation,
            @WebParam(name = "deliveredBy") Integer deliveredBy,
            @WebParam(name = "maleInvolved") Boolean maleInvolved,
            @WebParam(name = "complications") Integer[] complications,
            @WebParam(name = "vvf") Integer vvf,
            @WebParam(name = "maternalDeath") Boolean maternalDeath,
            @WebParam(name = "comments") String comments,
            @WebParam(name = "child1Outcome") BirthOutcome child1Outcome,
            @WebParam(name = "child1RegistrationType") RegistrationMode child1RegistrationType,
            @WebParam(name = "child1MotechId") Integer child1MotechId,
            @WebParam(name = "child1Sex") Gender child1Sex,
            @WebParam(name = "child1FirstName") String child1FirstName,
            @WebParam(name = "child1Weight") Double child1Weight,
            @WebParam(name = "child2Outcome") BirthOutcome child2Outcome,
            @WebParam(name = "child2RegistrationType") RegistrationMode child2RegistrationType,
            @WebParam(name = "child2MotechId") Integer child2MotechId,
            @WebParam(name = "child2Sex") Gender child2Sex,
            @WebParam(name = "child2FirstName") String child2FirstName,
            @WebParam(name = "child2Weight") Double child2Weight,
            @WebParam(name = "child3Outcome") BirthOutcome child3Outcome,
            @WebParam(name = "child3RegistrationType") RegistrationMode child3RegistrationType,
            @WebParam(name = "child3MotechId") Integer child3MotechId,
            @WebParam(name = "child3Sex") Gender child3Sex,
            @WebParam(name = "child3FirstName") String child3FirstName,
            @WebParam(name = "child3Weight") Double child3Weight)
            throws ValidationException;

    @WebMethod
    public void recordDeliveryNotification(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "datetime") Date datetime,
            @WebParam(name = "motechId") Integer motechId)
            throws ValidationException;

    @WebMethod
    public void recordMotherPNCVisit(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "datetime") Date datetime,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "visitNumber") Integer visitNumber,
            @WebParam(name = "location") Integer location,
            @WebParam(name = "house") String house,
            @WebParam(name = "community") String community,
            @WebParam(name = "referred") Boolean referred,
            @WebParam(name = "maleInvolved") Boolean maleInvolved,
            @WebParam(name = "vitaminA") Boolean vitaminA,
            @WebParam(name = "ttDose") Integer ttDose,
            @WebParam(name = "lochiaColour") Integer lochiaColour,
            @WebParam(name = "lochiaAmountExcess") Boolean lochiaAmountExcess,
            @WebParam(name = "lochiaOdourFoul") Boolean lochiaOdourFoul,
            @WebParam(name = "temperature") Double temperature,
            @WebParam(name = "fht") Double fht,
            @WebParam(name = "comments") String comments)
            throws ValidationException;

    @WebMethod
    public void recordDeath(@WebParam(name = "staffId") Integer staffId,
                            @WebParam(name = "facilityId") Integer facilityId,
                            @WebParam(name = "date") Date date,
                            @WebParam(name = "motechId") Integer motechId)
            throws ValidationException;

    @WebMethod
    public void recordTTVisit(@WebParam(name = "staffId") Integer staffId,
                              @WebParam(name = "facilityId") Integer facilityId,
                              @WebParam(name = "date") Date date,
                              @WebParam(name = "motechId") Integer motechId,
                              @WebParam(name = "ttDose") Integer ttDose)
            throws ValidationException;

    @WebMethod
    public void recordChildPNCVisit(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "datetime") Date datetime,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "visitNumber") Integer visitNumber,
            @WebParam(name = "location") Integer location,
            @WebParam(name = "house") String house,
            @WebParam(name = "community") String community,
            @WebParam(name = "referred") Boolean referred,
            @WebParam(name = "maleInvolved") Boolean maleInvolved,
            @WebParam(name = "weight") Double weight,
            @WebParam(name = "temperature") Double temperature,
            @WebParam(name = "bcg") Boolean bcg,
            @WebParam(name = "opv0") Boolean opv0,
            @WebParam(name = "respiration") Integer respiration,
            @WebParam(name = "cordConditionNormal") Boolean cordConditionNormal,
            @WebParam(name = "babyConditionGood") Boolean babyConditionGood,
            @WebParam(name = "comments") String comments)
            throws ValidationException;

    @WebMethod
    public void recordChildCWCVisit(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "date") Date date,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "serialNumber") String serialNumber,
            @WebParam(name = "cwcLocation") Integer cwcLocation,
            @WebParam(name = "house") String house,
            @WebParam(name = "community") String community,
            @WebParam(name = "immunizations") String immunizations,
            @WebParam(name = "opvDose") Integer opvDose,
            @WebParam(name = "pentaDose") Integer pentaDose,
            @WebParam(name = "iptiDose") Integer iptiDose,
            @WebParam(name = "weight") Double weight,
            @WebParam(name = "muac") Double muac,
            @WebParam(name = "height") Double height,
            @WebParam(name = "maleInvolved") Boolean maleInvolved,
            @WebParam(name = "comments") String comments
    )
            throws ValidationException;

    @WebMethod
    public Patient registerPatient(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "date") Date date,
            @WebParam(name = "registrationMode") RegistrationMode registrationMode,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "registrantType") RegistrantType registrantType,
            @WebParam(name = "firstName") String firstName,
            @WebParam(name = "middleName") String middleName,
            @WebParam(name = "lastName") String lastName,
            @WebParam(name = "preferredName") String preferredName,
            @WebParam(name = "dateOfBirth") Date dateOfBirth,
            @WebParam(name = "estimatedBirthDate") Boolean estimatedBirthDate,
            @WebParam(name = "sex") Gender sex,
            @WebParam(name = "insured") Boolean insured,
            @WebParam(name = "nhis") String nhis,
            @WebParam(name = "nhisExpires") Date nhisExpires,
            @WebParam(name = "motherMotechId") Integer motherMotechId,
            @WebParam(name = "community") Integer community,
            @WebParam(name = "address") String address,
            @WebParam(name = "phoneNumber") String phoneNumber,
            @WebParam(name = "expDeliveryDate") Date expDeliveryDate,
            @WebParam(name = "deliveryDateConfirmed") Boolean deliveryDateConfirmed,
            @WebParam(name = "enroll") Boolean enroll,
            @WebParam(name = "consent") Boolean consent,
            @WebParam(name = "ownership") ContactNumberType ownership,
            @WebParam(name = "format") MediaType format,
            @WebParam(name = "language") String language,
            @WebParam(name = "dayOfWeek") DayOfWeek dayOfWeek,
            @WebParam(name = "timeOfDay") Date timeOfDay,
            @WebParam(name = "reason") InterestReason reason,
            @WebParam(name = "howLearned") HowLearned howLearned,
            @WebParam(name = "messagesStartWeek") Integer messagesStartWeek,
            @WebParam(name = "cwcRegNumber") String cwcRegNumber,
            @WebParam(name = "cwcRegDateToday") Boolean cwcRegDateToday,
            @WebParam(name = "cwcRegDate") Date cwcRegDate,
            @WebParam(name = "ancRegNumber") String ancRegNumber,
            @WebParam(name = "ancRegDateToday") String ancRegDateToday,
            @WebParam(name = "ancRegDate") Date ancRegDate,
            @WebParam(name = "height") Double height,
            @WebParam(name = "gravida") Integer gravida,
            @WebParam(name = "parity") Integer parity,
            @WebParam(name = "lastIPT") Integer lastIPT,
            @WebParam(name = "lastIPTDate") Date lastIPTDate,
            @WebParam(name = "lastTT") Integer lastTT,
            @WebParam(name = "lastTTDate") Date lastTTDate,
            @WebParam(name = "bcgDate") Date bcgDate,
            @WebParam(name = "lastOPV") Integer lastOPV,
            @WebParam(name = "lastOPVDate") Date lastOPVDate,
            @WebParam(name = "lastPenta") Integer lastPenta,
            @WebParam(name = "lastPentaDate") Date lastPentaDate,
            @WebParam(name = "measlesDate") Date measlesDate,
            @WebParam(name = "yellowFeverDate") Date yellowFeverDate,
            @WebParam(name = "lastIPTI") Integer lastIPTI,
            @WebParam(name = "lastIPTIDate") Date lastIPTIDate,
            @WebParam(name = "lastVitaminADate") Date lastVitaminADate,
            @WebParam(name = "whyNoHistory") Integer whyNoHistory)
            throws ValidationException;

    @WebMethod
    public void registerPregnancy(@WebParam(name = "staffId") Integer staffId,
                                  @WebParam(name = "facilityId") Integer facilityId,
                                  @WebParam(name = "date") Date date,
                                  @WebParam(name = "motechId") Integer motechId,
                                  @WebParam(name = "estDeliveryDate") Date estDeliveryDate,
                                  @WebParam(name = "enroll") Boolean enroll,
                                  @WebParam(name = "consent") Boolean consent,
                                  @WebParam(name = "ownership") ContactNumberType ownership,
                                  @WebParam(name = "phoneNumber") String phoneNumber,
                                  @WebParam(name = "format") MediaType format,
                                  @WebParam(name = "language") String language,
                                  @WebParam(name = "dayOfWeek") DayOfWeek dayOfWeek,
                                  @WebParam(name = "timeOfDay") Date timeOfDay,
                                  @WebParam(name = "howLearned") HowLearned howLearned)
            throws ValidationException;

    @WebMethod
    public void registerANCMother(@WebParam(name = "staffId") Integer staffId,
                                  @WebParam(name = "facilityId") Integer facilityId,
                                  @WebParam(name = "date") Date date,
                                  @WebParam(name = "motechId") Integer motechId,
                                  @WebParam(name = "ancRegNumber") String ancRegNumber,
                                  @WebParam(name = "estDeliveryDate") Date estDeliveryDate,
                                  @WebParam(name = "height") Double height,
                                  @WebParam(name = "gravida") Integer gravida,
                                  @WebParam(name = "parity") Integer parity,
                                  @WebParam(name = "enroll") Boolean enroll,
                                  @WebParam(name = "consent") Boolean consent,
                                  @WebParam(name = "ownership") ContactNumberType ownership,
                                  @WebParam(name = "phoneNumber") String phoneNumber,
                                  @WebParam(name = "format") MediaType format,
                                  @WebParam(name = "language") String language,
                                  @WebParam(name = "dayOfWeek") DayOfWeek dayOfWeek,
                                  @WebParam(name = "timeOfDay") Date timeOfDay,
                                  @WebParam(name = "howLearned") HowLearned howLearned)
            throws ValidationException;

    @WebMethod
    public void registerCWCChild(@WebParam(name = "staffId") Integer staffId,
                                 @WebParam(name = "facilityId") Integer facilityId,
                                 @WebParam(name = "date") Date date,
                                 @WebParam(name = "motechId") Integer motechId,
                                 @WebParam(name = "cwcRegNumber") String cwcRegNumber,
                                 @WebParam(name = "enroll") Boolean enroll,
                                 @WebParam(name = "consent") Boolean consent,
                                 @WebParam(name = "ownership") ContactNumberType ownership,
                                 @WebParam(name = "phoneNumber") String phoneNumber,
                                 @WebParam(name = "format") MediaType format,
                                 @WebParam(name = "language") String language,
                                 @WebParam(name = "dayOfWeek") DayOfWeek dayOfWeek,
                                 @WebParam(name = "timeOfDay") Date timeOfDay,
                                 @WebParam(name = "howLearned") HowLearned howLearned)
            throws ValidationException;

    @WebMethod
    public void editPatient(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "date") Date date,
            @WebParam(name = "motechId") Integer motechId,
            @WebParam(name = "mothersMotechId") Integer mothersMotechId,
            @WebParam(name = "firstName") String firstName,
            @WebParam(name = "middleName") String middleName,
            @WebParam(name = "lastName") String lastName,
            @WebParam(name = "preferredName") String preferredName,
            @WebParam(name = "phoneNumber") String phoneNumber,
            @WebParam(name = "phoneOwnership") ContactNumberType phoneOwnership,
            @WebParam(name = "nhis") String nhis,
            @WebParam(name = "nhisExpires") Date nhisExpires,
            @WebParam(name = "edd") Date expectedDeliveryDate,
            @WebParam(name = "stopEnrollment") Boolean stopEnrollment)
            throws ValidationException;

    @WebMethod
    public void recordGeneralVisit(@WebParam(name = "staffId") Integer staffId,
                                   @WebParam(name = "facilityId") Integer facilityId,
                                   @WebParam(name = "date") Date date,
                                   @WebParam(name = "serialNumber") String serialNumber,
                                   @WebParam(name = "sex") Gender sex,
                                   @WebParam(name = "dateOfBirth") Date dateOfBirth,
                                   @WebParam(name = "insured") Boolean insured,
                                   @WebParam(name = "diagnosis") Integer diagnosis,
                                   @WebParam(name = "secondDiagnosis") Integer secondDiagnosis,
                                   @WebParam(name = "rdtGiven") Boolean rdtGiven,
                                   @WebParam(name = "rdtPositive") Boolean rdtPositive,
                                   @WebParam(name = "actTreated") Boolean actTreated,
                                   @WebParam(name = "newCase") Boolean newCase,
                                   @WebParam(name = "newPatient") Boolean newPatient,
                                   @WebParam(name = "referred") Boolean referred,
                                   @WebParam(name = "comments") String comments)
            throws ValidationException;

    @WebMethod
    public void recordChildVisit(@WebParam(name = "staffId") Integer staffId,
                                 @WebParam(name = "facilityId") Integer facilityId,
                                 @WebParam(name = "date") Date date,
                                 @WebParam(name = "serialNumber") String serialNumber,
                                 @WebParam(name = "motechId") Integer motechId,
                                 @WebParam(name = "insured") Boolean insured,
                                 @WebParam(name = "diagnosis") Integer diagnosis,
                                 @WebParam(name = "secondDiagnosis") Integer secondDiagnosis,
                                 @WebParam(name = "rdtGiven") Boolean rdtGiven,
                                 @WebParam(name = "rdtPositive") Boolean rdtPositive,
                                 @WebParam(name = "actTreated") Boolean actTreated,
                                 @WebParam(name = "newCase") Boolean newCase,
                                 @WebParam(name = "newPatient") Boolean newPatient,
                                 @WebParam(name = "referred") Boolean referred,
                                 @WebParam(name = "comments") String comments)
            throws ValidationException;

    @WebMethod
    public void recordMotherVisit(@WebParam(name = "staffId") Integer staffId,
                                  @WebParam(name = "facilityId") Integer facilityId,
                                  @WebParam(name = "date") Date date,
                                  @WebParam(name = "serialNumber") String serialNumber,
                                  @WebParam(name = "motechId") Integer motechId,
                                  @WebParam(name = "insured") Boolean insured,
                                  @WebParam(name = "diagnosis") Integer diagnosis,
                                  @WebParam(name = "secondDiagnosis") Integer secondDiagnosis,
                                  @WebParam(name = "rdtGiven") Boolean rdtGiven,
                                  @WebParam(name = "rdtPositive") Boolean rdtPositive,
                                  @WebParam(name = "actTreated") Boolean actTreated,
                                  @WebParam(name = "newCase") Boolean newCase,
                                  @WebParam(name = "newPatient") Boolean newPatient,
                                  @WebParam(name = "referred") Boolean referred,
                                  @WebParam(name = "comments") String comments)
            throws ValidationException;

    @WebMethod
    public Care[] queryANCDefaulters(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Care[] queryTTDefaulters(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Care[] queryMotherPNCDefaulters(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Care[] queryChildPNCDefaulters(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Care[] queryCWCDefaulters(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Patient[] queryUpcomingDeliveries(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Patient[] queryRecentDeliveries(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Patient[] queryOverdueDeliveries(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId)
            throws ValidationException;

    @WebMethod
    public Patient queryUpcomingCare(
            @WebParam(name = "staffId") Integer staffId,
            @WebParam(name = "facilityId") Integer facilityId,
            @WebParam(name = "motechId") Integer motechId)
            throws ValidationException;

    @WebMethod
    public Patient[] queryMotechId(@WebParam(name = "staffId") Integer staffId,
                                   @WebParam(name = "facilityId") Integer facilityId,
                                   @WebParam(name = "firstName") String firstName,
                                   @WebParam(name = "lastName") String lastName,
                                   @WebParam(name = "preferredName") String preferredName,
                                   @WebParam(name = "birthDate") Date birthDate,
                                   @WebParam(name = "nhis") String nhis,
                                   @WebParam(name = "phoneNumber") String phoneNumber)
            throws ValidationException;

    @WebMethod
    public Patient queryPatient(@WebParam(name = "staffId") Integer staffId,
                                @WebParam(name = "facilityId") Integer facilityId,
                                @WebParam(name = "motechId") Integer motechId)
            throws ValidationException;

    @WebMethod
    public String[] getPatientEnrollments(
            @WebParam(name = "motechId") Integer motechId)
            throws ValidationException;

    @WebMethod
    public void log(@WebParam(name = "type") LogType type,
                    @WebParam(name = "message") String message);

    @WebMethod
    public void setMessageStatus(
            @WebParam(name = "messageId") String messageId,
            @WebParam(name = "success") Boolean success);

    @WebMethod
    public RCTRegistrationConfirmation registerForRCT(@WebParam(name = "staffId") Integer staffId,
                                     @WebParam(name = "facilityId") Integer facilityId,
                                     @WebParam(name = "motechId") Integer motechId,
                                     @WebParam(name = "ownership") ContactNumberType ownership,
                                     @WebParam(name = "regPhone") String regPhone) throws ValidationException;


    @WebMethod
    public MotechStaff getStaffDetails(@WebParam(name = "staffId") String staffId);

    @WebMethod
    public Response processSMS(@WebParam(name ="sms")SMS sms);

}
