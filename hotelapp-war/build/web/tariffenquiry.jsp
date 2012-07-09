<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : tariffenquiry
    Created on : Jul 9, 2012, 3:38:32 PM
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
                            style="color: navy; font-family: 'Arial','Helvetica',sans-serif; font-size: 14px; font-weight: bold; left: 360px; top: 120px; position: absolute" text="Tariff Enquiry"/>
                        <webuijsf:label id="label1" style="left: 288px; top: 168px; position: absolute" text="Select the hotel "/>
                        <webuijsf:dropDown binding="#{tariffenquiry.dropDown1}" id="dropDown1" items="#{tariffenquiry.dropDown1DefaultOptions.options}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'dropDown1');" style="left: 408px; top: 168px; position: absolute" valueChangeListenerExpression="#{tariffenquiry.dropDown1_processValueChange}"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 216px; top: 216px; position: absolute; width: 450px" title="Table" width="450">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.listofrooms}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Room Id" id="tableColumn1" sort="roomsPK">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['roomsPK']['roomId']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Room Type" id="tableColumn2" sort="roomType">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['roomType']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Tariff" id="tableColumn3" sort="roomRent">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['roomRent']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>