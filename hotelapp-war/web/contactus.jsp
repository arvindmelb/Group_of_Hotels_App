<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : contactus
    Created on : July 10, 2012, 19:36:22 PM
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
                        <webuijsf:staticText id="staticText1"
                            style="color: navy; font-family: Arial,Helvetica,sans-serif; font-size: 14px; font-weight: bold; left: 216px; top: 120px; position: absolute" text="Always at your Service"/>
                        <webuijsf:staticText id="staticText2" style="font-weight: bold; left: 216px; top: 144px; position: absolute" text="Chirag Group of Hotels provides World Class facilities round the clock"/>
                        <webuijsf:staticText id="staticText3" style="font-weight: bold; left: 216px; top: 264px; position: absolute" text="Email"/>
                        <webuijsf:textArea columns="50" id="textArea1" readOnly="true" rows="4"
                            style="font-weight: bold; left: 216px; top: 192px; position: absolute" text="You can contact us at followng address : &#xa; Chirag Group of Hotel T Nagar Road, Chennai &#xa; Phone 91-522-2444444, 2222222"/>
                        <h:outputLink id="hyperlink1" style="position: absolute; left: 216px; top: 288px" value="mailto:chiraggroup@gmail.com">
                            <h:outputText id="hyperlink1Text" value="chiraggroup@gmail.com"/>
                        </h:outputLink>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
