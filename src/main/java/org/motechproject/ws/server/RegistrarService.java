package org.motechproject.ws.server;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.motechproject.ws.Gender;
import org.motechproject.ws.LogType;

/**
 * The service endpoint interface for the major motech server web service
 * endpoint. The annotations allow for minimal configuration deployment of
 * JAX-WS enpoints and clients, with appropriate behavior and metadata.
 */
@WebService
public interface RegistrarService {

	@WebMethod
	public void recordGeneralVisit(
			@WebParam(name = "clinicId") Integer clinicId,
			@WebParam(name = "visitDate") Date visitDate,
			@WebParam(name = "patientSerial") String patientSerial,
			@WebParam(name = "patientGender") Gender patientGender,
			@WebParam(name = "patientBirthDate") Date patientBirthDate,
			@WebParam(name = "patientDiagnosis") Integer patientDiagnosis,
			@WebParam(name = "patientReferral") Boolean patientReferral)
			throws ValidationException;

	@WebMethod
	public void log(@WebParam(name = "type") LogType type,
			@WebParam(name = "message") String message);

	@WebMethod
	public void setMessageStatus(
			@WebParam(name = "messageId") String messageId,
			@WebParam(name = "success") Boolean success);
}
