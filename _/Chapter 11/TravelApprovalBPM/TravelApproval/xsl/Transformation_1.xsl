<?xml version="1.0" encoding="UTF-8" ?>
<?oracle-xsl-mapper
  <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="XSD">
      <schema location="../xsd/TicketOfferRequestType.xsd"/>
      <rootElement name="FlightTicketRequest" namespace="http://packtpub.com/bpel/ticketoffer/"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="WSDL">
      <schema location="http://localhost:8001/soa-infra/services/default/UnitedAirlines/UnitedAirlines.wsdl"/>
      <rootElement name="flightTicketRequest" namespace="http://packtpub.com/service/airline/"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 11.1.1.3.0(build 100415.2045.2557) AT [MON JUL 05 15:55:14 CEST 2010]. -->
?>
<xsl:stylesheet version="1.0" xmlns:ns0="http://packtpub.com/bpel/ticketoffer/"
                xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/"
                xmlns:bpel2="http://docs.oasis-open.org/wsbpel/2.0/process/executable"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:bons1="http://packtpub.com/service/employee/"
                xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions"
                xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/"
                xmlns:plnk="http://schemas.xmlsoap.org/ws/2003/05/partner-link/"
                xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
                xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/"
                xmlns:ora="http://schemas.oracle.com/xpath/extension"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:bons0="http://packtpub.com/service/airline/"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath"
                xmlns:med="http://schemas.oracle.com/mediator/xpath"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath"
                xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:bpmn="http://schemas.oracle.com/bpm/xpath"
                xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap"
                exclude-result-prefixes="xsi xsl ns0 bons1 bons0 xsd soap12 plnk soap mime xp20 bpws bpel2 bpm ora socket mhdr oraext dvm hwf med ids xdk xref bpmn ldap">
  <xsl:template match="/">
    <bons0:flightTicketRequest>
      <bons0:flightData>
        <RequestNo>
          <xsl:value-of select="/ns0:FlightTicketRequest/ns0:flightData/RequestNo"/>
        </RequestNo>
        <OriginFrom>
          <xsl:value-of select="/ns0:FlightTicketRequest/ns0:flightData/OriginFrom"/>
        </OriginFrom>
        <DestinationTo>
          <xsl:value-of select="/ns0:FlightTicketRequest/ns0:flightData/DestinationTo"/>
        </DestinationTo>
        <DesiredDepartureDate>
          <xsl:value-of select="/ns0:FlightTicketRequest/ns0:flightData/DesiredDepartureDate"/>
        </DesiredDepartureDate>
        <DesiredReturnDate>
          <xsl:value-of select="/ns0:FlightTicketRequest/ns0:flightData/DesiredReturnDate"/>
        </DesiredReturnDate>
      </bons0:flightData>
      <bons0:travelClass>
        <xsl:value-of select="/ns0:FlightTicketRequest/ns0:travelClass"/>
      </bons0:travelClass>
    </bons0:flightTicketRequest>
  </xsl:template>
</xsl:stylesheet>
