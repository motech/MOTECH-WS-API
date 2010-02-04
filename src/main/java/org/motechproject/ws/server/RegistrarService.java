package org.motechproject.ws.server;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.motechproject.ws.BirthOutcome;
import org.motechproject.ws.ContactNumberType;
import org.motechproject.ws.DeliveredBy;
import org.motechproject.ws.Gender;
import org.motechproject.ws.HIVStatus;
import org.motechproject.ws.LogType;

/**
 * The service endpoint interface for the major motech server web service
 * endpoint. The annotations allow for minimal configuration deployment of
 * JAX-WS enpoints and clients, with appropriate behavior and metadata.
 */
@WebService
public interface RegistrarService {

	@WebMethod
	public void recordMotherANCVisit(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "visitNumber") Integer visitNumber,
			@WebParam(name = "ttDose") Integer ttDose,
			@WebParam(name = "iptDose") Integer iptDose,
			@WebParam(name = "itnUse") Boolean itnUse,
			@WebParam(name = "hivStatus") HIVStatus hivStatus)
			throws ValidationException;

	@WebMethod
	public void recordPregnancyTermination(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "abortionType") Integer abortionType,
			@WebParam(name = "complication") Integer complication)
			throws ValidationException;

	@WebMethod
	public void recordPregnancyDelivery(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "method") Integer method,
			@WebParam(name = "outcome") Integer outcome,
			@WebParam(name = "location") Integer location,
			@WebParam(name = "deliveredBy") DeliveredBy deliveredBy,
			@WebParam(name = "maternalDeath") Boolean maternalDeath,
			@WebParam(name = "cause") Integer cause,
			@WebParam(name = "child1Outcome") BirthOutcome child1Outcome,
			@WebParam(name = "child1PatientId") String child1PatientId,
			@WebParam(name = "child1Sex") Gender child1Sex,
			@WebParam(name = "child1FirstName") String child1FirstName,
			@WebParam(name = "child1OPV") Boolean child1OPV,
			@WebParam(name = "child1BCG") Boolean child1BCG,
			@WebParam(name = "child2Outcome") BirthOutcome child2Outcome,
			@WebParam(name = "child2PatientId") String child2PatientId,
			@WebParam(name = "child2Sex") Gender child2Sex,
			@WebParam(name = "child2FirstName") String child2FirstName,
			@WebParam(name = "child2OPV") Boolean child2OPV,
			@WebParam(name = "child2BCG") Boolean child2BCG)
			throws ValidationException;

	@WebMethod
	public void recordMotherPPCVisit(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "visitNumber") Integer visitNumber,
			@WebParam(name = "vitaminA") Boolean vitaminA,
			@WebParam(name = "ttDose") Integer ttDose)
			throws ValidationException;

	@WebMethod
	public void recordDeath(@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "cause") Integer cause) throws ValidationException;

	@WebMethod
	public void recordChildPNCVisit(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "bcg") Boolean bcg,
			@WebParam(name = "opvDose") Integer opvDose,
			@WebParam(name = "pentaDose") Integer pentaDose,
			@WebParam(name = "yellowFever") Boolean yellowFever,
			@WebParam(name = "csm") Boolean csm,
			@WebParam(name = "ipti") Boolean ipti,
			@WebParam(name = "vitaminA") Boolean vitaminA)
			throws ValidationException;

	@WebMethod
	public void registerChild(@WebParam(name = "chpsId") String chpsId,
			@WebParam(name = "regDate") Date regDate,
			@WebParam(name = "motherRegNum") String motherRegNum,
			@WebParam(name = "childRegNum") String childRegNum,
			@WebParam(name = "childDob") Date childDob,
			@WebParam(name = "childGender") Gender childGender,
			@WebParam(name = "childFirstName") String childFirstName,
			@WebParam(name = "nhis") String nhis,
			@WebParam(name = "nhisExpires") Date nhisExpires)
			throws ValidationException;

	@WebMethod
	public void editPatient(
			@WebParam(name = "chpsId") String chpsId,
			@WebParam(name = "patientRegNum") String patientRegNum,
			@WebParam(name = "primaryPhone") String primaryPhone,
			@WebParam(name = "primaryPhoneType") ContactNumberType primaryPhoneType,
			@WebParam(name = "secondaryPhone") String secondaryPhone,
			@WebParam(name = "secondaryPhoneType") ContactNumberType secondaryPhoneType,
			@WebParam(name = "nhis") String nhis,
			@WebParam(name = "nhisExpires") Date nhisExpires)
			throws ValidationException;

	@WebMethod
	public void stopPregnancyProgram(@WebParam(name = "chpsId") String chpsId,
			@WebParam(name = "patientRegNum") String patientRegNum)
			throws ValidationException;

	@WebMethod
	public void recordGeneralVisit(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "serialNumber") String serialNumber,
			@WebParam(name = "sex") Gender sex,
			@WebParam(name = "birthDate") Date birthDate,
			@WebParam(name = "insured") Boolean insured,
			@WebParam(name = "diagnosis") Integer diagnosis,
			@WebParam(name = "secondDiagnosis") Integer secondDiagnosis,
			@WebParam(name = "referral") Boolean referral)
			throws ValidationException;

	@WebMethod
	public void recordChildVisit(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "serialNumber") String serialNumber,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "newCase") Boolean newCase,
			@WebParam(name = "diagnosis") Integer diagnosis,
			@WebParam(name = "secondDiagnosis") Integer secondDiagnosis,
			@WebParam(name = "referral") Boolean referral)
			throws ValidationException;

	@WebMethod
	public void recordMotherVisit(
			@WebParam(name = "facilityId") String facilityId,
			@WebParam(name = "date") Date date,
			@WebParam(name = "serialNumber") String serialNumber,
			@WebParam(name = "patientId") String patientId,
			@WebParam(name = "newCase") Boolean newCase,
			@WebParam(name = "diagnosis") Integer diagnosis,
			@WebParam(name = "secondDiagnosis") Integer secondDiagnosis,
			@WebParam(name = "referral") Boolean referral)
			throws ValidationException;

	@WebMethod
	public void log(@WebParam(name = "type") LogType type,
			@WebParam(name = "message") String message);

	@WebMethod
	public void setMessageStatus(
			@WebParam(name = "messageId") String messageId,
			@WebParam(name = "success") Boolean success);
}
