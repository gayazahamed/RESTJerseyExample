package com.test;

import java.io.File;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class JAXBExample {

    private static final String FILE_NAME =
        "C:\\Users\\gshaik\\Desktop\\Log\\jaxb-emp.xml";

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Gayaz");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("sensitive");

        jaxbObjectToXML(emp);

        Employee empFromFile = jaxbXMLToObject();
        System.out.println(empFromFile.toString());
    }


    private static Employee jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Unmarshaller un = context.createUnmarshaller();
            Employee emp = (Employee)un.unmarshal(new File(FILE_NAME));
            return emp;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void jaxbObjectToXML(Employee emp) {

        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(emp, new File(FILE_NAME));
            System.out.println(asString(context, emp));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    
    public static String jaxbObjectToXMLString(Employee emp) {

        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

           return asString(context, emp);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static String asString(JAXBContext pContext,
                                  Object pObject) throws JAXBException {

        java.io.StringWriter sw = new StringWriter();

        Marshaller marshaller = pContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.marshal(pObject, sw);

        return sw.toString();
    }

}
