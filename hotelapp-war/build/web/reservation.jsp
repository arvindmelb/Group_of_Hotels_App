<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : reservation
    Created on : Jul 9, 2012, 6:19:37 PM
    Author     : Administrator
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:staticText id="staticText1"
                            style="font-family: Arial,Helvetica,sans-serif; font-size: 18px; font-weight: bolder; left: 288px; top: 24px; position: absolute" text="Customer Information"/>
                        <webuijsf:label id="label1" style="left: 168px; top: 72px; position: absolute" text="Customer Name"/>
                        <webuijsf:textField binding="#{reservation.name}" id="name" style="left: 336px; top: 72px; position: absolute"/>
                        <webuijsf:label id="label2" style="left: 168px; top: 96px; position: absolute" text="Address1"/>
                        <webuijsf:label id="label3" style="left: 168px; top: 120px; position: absolute" text="Address2"/>
                        <webuijsf:label id="label4" style="left: 168px; top: 144px; position: absolute" text="City"/>
                        <webuijsf:label id="label5" style="left: 168px; top: 168px; position: absolute" text="State"/>
                        <webuijsf:label id="label6" style="left: 168px; top: 192px; position: absolute" text="Zip Code"/>
                        <webuijsf:label id="label7" style="left: 168px; top: 264px; position: absolute" text="Contact No"/>
                        <webuijsf:label id="label8" style="left: 168px; top: 288px; position: absolute" text="Hotel Name"/>
                        <webuijsf:label id="label9" style="left: 168px; top: 312px; position: absolute" text="Room Type"/>
                        <webuijsf:label id="label10" style="left: 168px; top: 336px; position: absolute" text="Reservation Date"/>
                        <webuijsf:label id="label11" style="left: 168px; top: 216px; position: absolute" text="Country"/>
                        <webuijsf:label id="label12" style="left: 168px; top: 240px; position: absolute" text="Email Id"/>
                        <webuijsf:label id="label13" style="left: 168px; top: 360px; position: absolute" text="Amount"/>
                        <webuijsf:textField binding="#{reservation.address1}" columns="60" id="address1" style="left: 336px; top: 96px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.address2}" columns="60" id="address2" style="left: 336px; top: 120px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.city}" id="city" style="left: 336px; top: 144px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.state}" id="state" style="left: 336px; top: 168px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.zipcode}" id="zipcode" style="left: 336px; top: 192px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.country}" id="country" style="left: 336px; top: 216px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.emailid}" id="emailid" style="left: 336px; top: 240px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.contactno}" id="contactno" style="left: 336px; top: 264px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.reservdate}" id="reservdate" style="left: 336px; top: 336px; position: absolute" valueChangeListenerExpression="#{reservation.reservdate_processValueChange}"/>
                        <webuijsf:textField binding="#{reservation.chequeno}" id="chequeno" style="left: 336px; top: 480px; position: absolute"/>
                        <webuijsf:textField binding="#{reservation.credit_cardno}" id="credit_cardno" style="left: 336px; top: 456px; position: absolute"/>
                        <webuijsf:dropDown binding="#{reservation.roomtype}" id="roomtype" items="#{reservation.roomtypeDefaultOptions.options}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'roomtype');" style="left: 336px; top: 312px; position: absolute" valueChangeListenerExpression="#{reservation.roomtype_processValueChange}"/>
                        <webuijsf:dropDown binding="#{reservation.hotelname}" id="hotelname" items="#{reservation.hotelnameDefaultOptions.options}"
                            style="left: 336px; top: 288px; position: absolute" valueChangeListenerExpression="#{reservation.hotelname_processValueChange}"/>
                        <webuijsf:staticText binding="#{reservation.amount}" id="amount" style="left: 336px; top: 360px; position: absolute"/>
                        <webuijsf:radioButtonGroup binding="#{reservation.paymode}" id="paymode" items="#{reservation.paymodeDefaultOptions.options}" style="height: 48px; left: 336px; top: 384px; position: absolute; width: 240px"/>
                        <webuijsf:radioButtonGroup binding="#{reservation.credit_card_name}" id="credit_card_name"
                            items="#{reservation.credit_card_nameDefaultOptions.options}" style="left: 336px; top: 504px; position: absolute"/>
                        <webuijsf:label id="label14" style="position: absolute; left: 168px; top: 384px" text="Mode of Payment"/>
                        <webuijsf:label id="label15" style="left: 168px; top: 456px; position: absolute" text="Credit card Number"/>
                        <webuijsf:label id="label16" style="left: 168px; top: 480px; position: absolute" text="Cheque Number"/>
                        <webuijsf:label id="label17" style="left: 168px; top: 504px; position: absolute" text="Credit Card"/>
                        <webuijsf:label id="label18" style="left: 168px; top: 576px; position: absolute" text="Credit card Expiry"/>
                        <webuijsf:button actionExpression="#{reservation.reserving_action}" binding="#{reservation.reserving}" id="reserving"
                            style="color: navy; font-family: Arial,Helvetica,sans-serif; font-size: 14px; font-weight: bold; left: 335px; top: 600px; position: absolute" text="Reserve"/>
                        <webuijsf:textField binding="#{reservation.credit_card_expiry}" id="credit_card_expiry" style="left: 336px; top: 576px; position: absolute"/>
                        <webuijsf:staticText binding="#{reservation.room_message}" id="room_message" style="left: 648px; top: 552px; position: absolute"/>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 648px; top: 336px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
