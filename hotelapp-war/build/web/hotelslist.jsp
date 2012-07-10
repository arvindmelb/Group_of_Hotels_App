<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : hotelslist
    Created on : Jul 8, 2012, 9:21:31 PM
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
                        <webuijsf:table augmentTitle="false" binding="#{hotelslist.table1}" id="table1"
                            style="left: 48px; top: 216px; position: absolute; width: 450px" title="Table" width="450">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.listofhotels}" sourceVar="currentRow">
                               <webuijsf:tableColumn headerText="Hotel ID" id="tableColumn1" sort="column1">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['hotelId']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Hotel Name" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['hotelName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Address" id="tableColumn3" sort="column3">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['address']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="City" id="tableColumn4" sort="column4">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['city']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="State" id="tableColumn5" sort="column5">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['hotelState']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Country" id="tableColumn6" sort="column6">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['country']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="No of Rooms" id="tableColumn7" sort="column7">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['noOfRooms']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:staticText id="staticText9"
                            style="color: navy; font-family: 'Arial','Helvetica',sans-serif; font-size: 14px; font-weight: bold; left: 336px; top: 120px; position: absolute" text="List of Hotels in Chirag Group"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
