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

package org.motechproject.ws;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.motechproject.ws.rct.PregnancyTrimester;

import java.util.Date;

public class Patient {

    String motechId;
    String preferredName;
    String firstName;
    String lastName;
    Date birthDate;
    Integer age;
    Gender sex;
    String community;
    String phoneNumber;
    Date estimateDueDate;
    Date deliveryDate;
    Care[] cares;
    ContactNumberType contactNumberType;
    PregnancyTrimester pregnancyTrimester;

    public String getMotechId() {
        return motechId;
    }

    public void setMotechId(String motechId) {
        this.motechId = motechId;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getEstimateDueDate() {
        return estimateDueDate;
    }

    public void setEstimateDueDate(Date estimateDueDate) {
        this.estimateDueDate = estimateDueDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Care[] getCares() {
        return cares;
    }

    public void setCares(Care[] cares) {
        this.cares = cares;
    }

    public ContactNumberType getContactNumberType() {
        return contactNumberType;
    }

    public void setContactNumberType(ContactNumberType contactNumberType) {
        this.contactNumberType = contactNumberType;
    }

    public PregnancyTrimester pregnancyTrimester() {

        if (!isPregnancyRegistered())
            return PregnancyTrimester.NONE;

        DateTime deliveryDate = new DateTime(estimateDueDate.getTime());
        DateTime today = new DateTime(new Date().getTime());
        Months months = Months.monthsBetween(today, deliveryDate);
        int monthsDiff = Math.abs(months.getMonths());

        if (monthsDiff <= 3) return PregnancyTrimester.THIRD;
        if (monthsDiff <= 6) return PregnancyTrimester.SECOND;

        return PregnancyTrimester.FIRST;
    }

    public boolean isPregnancyRegistered() {
        return estimateDueDate != null;
    }

    public boolean isInFirstWeekOfPregnancy() {
        return isPregnancyRegistered() && PregnancyTrimester.FIRST.equals(pregnancyTrimester());
    }

}
