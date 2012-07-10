<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : Jul 8, 2012, 6:56:12 PM
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
                        <div style="position:absolute; left:0px; top:0px">
                            <jsp:directive.include file="header.jspf"/>
                        </div>
                        <div style="position:absolute; left:0px; top:110px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                       <webuijsf:image id="image1" style="left: 360px; top: 120px; position: absolute" url="/images/hfront.JPG"/>
                        <webuijsf:image height="100" id="image2" style="left: 216px; top: 288px; position: absolute" url="/images/delux.JPG" width="120"/>
                        <webuijsf:image height="100" id="image3" style="left: 408px; top: 288px; position: absolute" url="/images/suite.jpg" width="120"/>
                        <webuijsf:image height="100" id="image4" style="left: 600px; top: 288px; position: absolute" url="/images/dining.jpg" width="120"/>
                        <webuijsf:textArea columns="105" id="textArea1" readOnly="true" rows="11"
                            style="font-weight: bold; left: 216px; top: 432px; position: absolute"
                            text="Spacious rooms with 10 feet high ceilings. &#xa;Large Designer Bathrooms with Superior Fixtures and Fine Amenities. &#xa;Twin and King beds. 42”Plasma television with cable/satellite channels. &#xa;In room DVD Player. Access to hotel’s lobby bar exclusively for in-house guests and their guests.  &#xa;Access to world class fitness centre offering facilities like Sauna, Steam,  Gym and Swimming Pool. &#xa;Complimentary internet access. Multi-line telephones with voice mail, data line and fax capabilities. &#xa;In room electronic safe with a provision of charging the laptop. &#xa;Spacious washroom with Rain shower &amp; bath tubs. &#xa;24 hour Room Service. &#xa;In room tea / coffee maker and mini bar. &#xa;Complimentary Newspaper, Hair dryer, Electronic Weighing Machine, Iron with Ironing Board. &#xa;" trim="false"/>
                        <webuijsf:staticText id="staticText1"
                            style="color: navy; font-family: Arial,Helvetica,sans-serif; font-size: 14px; font-weight: bold; left: 432px; top: 408px; position: absolute" text="World Class Facilities"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
