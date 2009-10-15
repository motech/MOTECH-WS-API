package org.motechproject.ws.mobile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.motechproject.ws.ContactNumberType;
import org.motechproject.ws.MediaType;
import org.motechproject.ws.MessageStatus;
import org.motechproject.ws.NameValuePair;
import org.motechproject.ws.Patient;

/**
 * A webservice interface providing functionality for sending messages
 *
 * @author Kofi A. Asamoah (yoofi@dreamoval.com)
 * Date Created 30-07-09
 */
@WebService
public interface MessageService extends Serializable{

    /**
     * Sends a message to a CHPS patient
     *
     * @param messageId Numeric key of the message to send
     * @param clinic Location of patient's default CHPS compound
     * @param serviceDate Date of current service delivery
     * @param patientNumber Patient mobile contact number
     * @param patientNumberType Type of contact number. Possible values include PERSONAL, SHARED
     * @param messageType Preferred message type. Possible values include TEXT, VOICE
     * @return The id of the message sent
     */
    @WebMethod
    public MessageStatus sendPatientMessage(@WebParam(name="messageId") String messageId, @WebParam(name="personalInfo") NameValuePair[] personalInfo, @WebParam(name="patientNumber") String patientNumber, @WebParam(name="patientNumberType") ContactNumberType patientNumberType, @WebParam(name="langCode") String langCode, @WebParam(name="mediaType") MediaType mediaType, @WebParam(name="notificationType") Long notificationType, @WebParam(name="startDate")Date startDate, @WebParam(name="endDate")Date endDate);

    /**
     * Sends a message to a CHPS Worker
     *
     * @param messageId Numeric key of the message to send
     * @param workerName Name of CHPS worker recieving message
     * @param workerNumber Worker mobile contact number
     * @param patientList A List of patients requiring service from CHPS worker
     * @return The id of the message sent
     */
    @WebMethod
    public MessageStatus sendCHPSMessage(@WebParam(name="messageId") String messageId, @WebParam(name="personalInfo") NameValuePair[] personalInfo, @WebParam(name="workerNumber") String workerNumber, @WebParam(name="patients") Patient[] patients, @WebParam(name="langCode") String langCode, @WebParam(name="mediaType") MediaType mediaType, @WebParam(name="notificationType") Long notificationType, @WebParam(name="startDate")Date startDate, @WebParam(name="endDate")Date endDate);
    
}
