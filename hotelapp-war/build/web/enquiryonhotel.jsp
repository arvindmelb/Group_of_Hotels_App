<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : enquiryonhotel
    Created on : Jul 8, 2012, 10:50:26 PM
    Author     : Arvind Kumar
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
                            style="color: navy; font-family: Arial,Helvetica,sans-serif; font-size: 14px; font-weight: bold; left: 216px; top: 120px; position: absolute" text="Enquiry on Hotel"/>
                        <webuijsf:label id="label1" style="left: 144px; top: 168px; position: absolute; width: 120px" text="Select the Hotel Name"/>
                        <webuijsf:label id="label2" style="left: 144px; top: 192px; position: absolute" text="Address"/>
                        <webuijsf:label id="label3" style="left: 144px; top: 216px; position: absolute" text="City"/>
                        <webuijsf:label id="label4" style="left: 144px; top: 240px; position: absolute" text="State"/>
                        <webuijsf:label id="label5" style="left: 144px; top: 264px; position: absolute" text="Country"/>
                        <webuijsf:label id="label6" style="left: 144px; top: 288px; position: absolute" text="Number of Rooms"/>
                        <webuijsf:dropDown binding="#{enquiryonhotel.hotelname}" id="hotelname"
                            items="#{enquiryonhotel.hotelsDataProvider.options['hotels.hotel_name,hotels.hotel_name']}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'hotelname');" style="left: 288px; top: 168px; position: absolute" valueChangeListenerExpression="#{enquiryonhotel.hotelname_processValueChange}"/>
                        <webuijsf:textField binding="#{enquiryonhotel.address}" id="address" style="left: 288px; top: 192px; position: absolute"/>
                        <webuijsf:textField binding="#{enquiryonhotel.city}" id="city" style="left: 288px; top: 216px; position: absolute"/>
                        <webuijsf:textField binding="#{enquiryonhotel.state}" id="state" style="left: 288px; top: 240px; position: absolute"/>
                        <webuijsf:textField binding="#{enquiryonhotel.country}" id="country" style="left: 288px; top: 264px; position: absolute"/>
                        <webuijsf:textField binding="#{enquiryonhotel.no_of_rooms}" id="no_of_rooms" style="left: 288px; top: 288px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
