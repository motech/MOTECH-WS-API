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

package org.motechproject.ws.mobile;

import java.io.Serializable;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.motechproject.ws.Care;

import org.motechproject.ws.ContactNumberType;
import org.motechproject.ws.MediaType;
import org.motechproject.ws.MessageStatus;
import org.motechproject.ws.NameValuePair;
import org.motechproject.ws.Patient;
import org.motechproject.ws.PatientMessage;

/**
 * A webservice interface providing functionality for sending messages
 *
 * @author Kofi A. Asamoah (yoofi@dreamoval.com)
 * Date Created 30-07-09
 */
@WebService
public interface MessageService extends Serializable{

    /**
     * Sends messages to registered patients
     *
     * @param messages List of messages to be sent
     */
    @WebMethod
    public void sendPatientMessages(@WebParam(name="messages") PatientMessage[] messages);
	
    /**
     * Sends a message to a registered patient
     *
     * @param messageId Id of the message to send
     * @param personalInfo List of name value pairs containing patient information
     * @param patientNumber Patient mobile contact number
     * @param patientNumberType Type of contact number. Possible values include PERSONAL, SHARED
     * @param langCode Code representing preferred communication language
     * @param mediaType Patient's preferred communication medium
     * @param notificationType Type of message to send to patient
     * @param startDate Date to begin message sending attempts
     * @param endDate Date to stop message sending attempts
     * @param recipientId String unique identifier of the recipient
     * @return The status of the message
     */
    @WebMethod
    public MessageStatus sendPatientMessage(@WebParam(name="messageId") String messageId, 
    										@WebParam(name="personalInfo") NameValuePair[] personalInfo, 
    										@WebParam(name="patientNumber") String patientNumber, 
    										@WebParam(name="patientNumberType") ContactNumberType patientNumberType, 
    										@WebParam(name="langCode") String langCode, 
    										@WebParam(name="mediaType") MediaType mediaType, 
    										@WebParam(name="notificationType") Long notificationType, 
    										@WebParam(name="startDate")Date startDate, 
    										@WebParam(name="endDate")Date endDate,
    										@WebParam(name="recipientId")String recipientId);

    /**
     * Sends a message to a registered CHPS worker
     *
     * @param messageId Id of the message to send
     * @param personalInfo List of name value pairs containing patient information
     * @param workerNumber CHPS worker's mobile contact number
     * @param patients A List of patients requiring service from CHPS worker
     * @param langCode  Code representing preferred communication language
     * @param mediaType Patient's preferred communication medium
     * @param notificationType Type of message to send to patient
     * @param startDate Date to begin message sending attempts
     * @param endDate Date to stop message sending attempts
     * @return The status of the message
     */
    @WebMethod
    public MessageStatus sendCHPSMessage(@WebParam(name="messageId") String messageId, @WebParam(name="personalInfo") NameValuePair[] personalInfo, @WebParam(name="workerNumber") String workerNumber, @WebParam(name="patients") Patient[] patients, @WebParam(name="langCode") String langCode, @WebParam(name="mediaType") MediaType mediaType, @WebParam(name="notificationType") Long notificationType, @WebParam(name="startDate")Date startDate, @WebParam(name="endDate")Date endDate);

    /**
     * Sends a list of care defaulters to a CHPS worker
     *
     * @param messageId Id of the message to send
     * @param workerNumber CHPS worker's mobile contact number
     * @param cares List of patient care options which have defaulters
     * @param mediaType Patient's preferred communication medium
     * @param startDate Date to begin message sending attempts
     * @param endDate Date to stop message sending attempts
     * @return The status of the message
     */
    @WebMethod
    public MessageStatus sendDefaulterMessage(@WebParam(name = "messageId") String messageId,
                                              @WebParam(name = "workerNumber") String workerNumber,
                                              @WebParam(name = "cares") Care[] cares,
                                              @WebParam(name = "media") MediaType mediaType,
                                              @WebParam(name = "startDate") Date startDate,
                                              @WebParam(name = "endDate") Date endDate);

    /**
     * Sends a list of patients within a delivery schedule to a CHPS worker
     *
     * @param messageId Id of the message to send
     * @param workerNumber CHPS worker's mobile contact number
     * @param patients List of patients with matching delivery status
     * @param deliveryStatus Status of patient delivery. Expected values are 'Upcoming', 'Recent' and 'Overdue'
     * @param mediaType Patient's preferred communication medium
     * @param startDate Date to begin message sending attempts
     * @param endDate Date to stop message sending attempts
     * @return The status of the message
     */
    @WebMethod
    public MessageStatus sendDeliveriesMessage(@WebParam(name = "messageId") String messageId,
                                               @WebParam(name = "workerNumber") String workerNumber,
                                               @WebParam(name = "patients") Patient[] patients,
                                               @WebParam(name = "deliveryStatus") String deliveryStatus,
                                               @WebParam(name = "mediaType") MediaType mediaType,
                                               @WebParam(name = "startDate") Date startDate,
                                               @WebParam(name = "endDate") Date endDate);

    /**
     * Sends a list of upcoming care for a particular patient to a CHPS worker
     *
     * @param messageId Id of the message to send
     * @param workerNumber CHPS worker's mobile contact number
     * @param patient patient due for care
     * @param mediaType Patient's preferred communication medium
     * @param startDate Date to begin message sending attempts
     * @param endDate Date to stop message sending attempts
     * @return The status of the message
     */
    @WebMethod
    public MessageStatus sendUpcomingCaresMessage(@WebParam(name = "messageId") String messageId,
                                                  @WebParam(name = "workerNumber") String workerNumber,
                                                  @WebParam(name = "patient") Patient patient,
                                                  @WebParam(name = "mediaType") MediaType mediaType,
                                                  @WebParam(name = "startDate") Date startDate,
                                                  @WebParam(name = "endDate") Date endDate);

    /**
     * Sends an SMS message
     *
     * @param content the message to send
     * @param recipient the phone number to receive the message
     * @return
     */
    @WebMethod
    public MessageStatus sendMessage(@WebParam(name = "content") String content,
                                     @WebParam(name = "recipient") String recipient);

    /**
     * Sends multiple upcoming care messages to a CHPS worker
     *
     * @param messageId Id of the message to send
     * @param workerNumber CHPS worker's mobile contact number
     * @param cares List of upcoming care
     * @param mediaType Patient's preferred communication medium
     * @param startDate Date to begin message sending attempts
     * @param endDate Date to stop message sending attempts
     * @return The status of the message
     */
    @WebMethod
    public MessageStatus sendBulkCaresMessage(@WebParam(name = "messageId") String messageId,
                                                  @WebParam(name = "workerNumber") String workerNumber,
                                                  @WebParam(name = "patient") Care[] cares,
                                                  @WebParam(name = "mediaType") MediaType mediaType,
                                                  @WebParam(name = "startDate") Date startDate,
                                                  @WebParam(name = "endDate") Date endDate);
}
