<?xml version="1.0" encoding="utf-8"?>
<!-- Created with Liquid Technologies Online Tools 1.0 (https://www.liquid-technologies.com) -->
<xs:schema attributeFormDefault="unqualified" elementFormDefault="qualified" xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="configuration">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="property">
          <xs:complexType>
            <xs:attribute name="name" type="xs:string" use="required" />
            <xs:attribute name="value" type="xs:string" use="required" />
          </xs:complexType>
        </xs:element>
        <xs:element maxOccurs="unbounded" name="appender">
          <xs:complexType>
            <xs:sequence>
              <xs:element minOccurs="0" name="file" type="xs:string" />
              <xs:element minOccurs="0" name="encoder">
                <xs:complexType>
                  <xs:sequence>
                    <xs:element name="Pattern" type="xs:string" />
                  </xs:sequence>
                  <xs:attribute name="class" type="xs:string" use="required" />
                </xs:complexType>
              </xs:element>
              <xs:element minOccurs="0" name="rollingPolicy">
                <xs:complexType>
                  <xs:sequence>
                    <xs:element name="FileNamePattern" type="xs:string" />
                    <xs:element name="MaxHistory" type="xs:unsignedByte" />
                    <xs:element name="timeBasedFileNamingAndTriggeringPolicy">
                      <xs:complexType>
                        <xs:sequence>
                          <xs:element name="maxFileSize" type="xs:string" />
                        </xs:sequence>
                        <xs:attribute name="class" type="xs:string" use="required" />
                      </xs:complexType>
                    </xs:element>
                  </xs:sequence>
                  <xs:attribute name="class" type="xs:string" use="required" />
                </xs:complexType>
              </xs:element>
              <xs:element minOccurs="0" name="layout">
                <xs:complexType>
                  <xs:sequence>
                    <xs:element name="Pattern" type="xs:string" />
                  </xs:sequence>
                  <xs:attribute name="class" type="xs:string" use="required" />
                </xs:complexType>
              </xs:element>
            </xs:sequence>
            <xs:attribute name="name" type="xs:string" use="required" />
            <xs:attribute name="class" type="xs:string" use="required" />
          </xs:complexType>
        </xs:element>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>