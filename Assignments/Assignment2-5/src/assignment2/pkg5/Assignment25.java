/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg5;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;

/**
 *
 * @author mrudu
 */
public class Assignment25 {

    /**
     * @param args the command line arguments
     */
    
    public static int readNumber(String message, int min, int max) {
        String pattern = "^\\d+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            String line = sc.nextLine();
            Matcher m = r.matcher(line);
            if (m.find()) {
                int i = Integer.parseInt(line);
                if (min <= i && i <= max) {
                    return i;
                } else {
                    System.out.println("Wrong input. Enter again: ");
                }
            } else {
                System.out.println("Wrong input. Enter again: ");
            }
        }
    }

    public static double readDecimal(String message, double min, double max) {
        String pattern = "^(\\d*\\.)?\\d+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            String line = sc.nextLine();
            Matcher m = r.matcher(line);
            if (m.find()) {
                double i = Double.parseDouble(line);
                if (min <= i && i <= max) {
                    return i;
                } else {
                    System.out.println("Wrong input. Enter again: ");
                }
            } else {
                System.out.println("Wrong input. Enter again: ");
            }
        }
    }

    public static String readString(String message) {
        String pattern = "^[A-Za-z]+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            String line = sc.nextLine();
            Matcher m = r.matcher(line);
            if (m.find()) {
                return line;
            } else {
                System.out.println("Wrong input. Enter again: ");
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        try {
            //System.out.println(System.getProperty("user.dir"));
            Scanner sc = new Scanner(System.in);
            char con;
            int choice;
            int patientId = 1;
            SystemEntries entries = new SystemEntries();

            File f = new File("Patient_data6.xls");
            Workbook wb = Workbook.getWorkbook(f);
            Sheet s = wb.getSheet(0);
            int row = s.getRows();
            int col = s.getColumns();

            for (int i = 1; i < row; i++) {
                int j = 0;
                Cell c1 = s.getCell(j, i);
                String fname = c1.getContents();
                j++;
                Cell c2 = s.getCell(j, i);
                String lname = c2.getContents();
                j++;
                Cell c3 = s.getCell(j, i);
                String ageM = c3.getContents();
                int ageMo = Integer.parseInt(ageM);
                j++;
                Cell c4 = s.getCell(j, i);
                String ageY = c4.getContents();
                int ageYrs = Integer.parseInt(ageY);
                j++;
                Cell c5 = s.getCell(j, i);
                String rRate = c5.getContents();
                int respRate = Integer.parseInt(rRate);
                j++;
                Cell c6 = s.getCell(j, i);
                String hRate = c6.getContents();
                int heartRate = Integer.parseInt(hRate);
                j++;
                Cell c7 = s.getCell(j, i);
                String bloodP = c7.getContents();
                int bp = Integer.parseInt(bloodP);
                j++;
                Cell c8 = s.getCell(j, i);
                String wLbs = c8.getContents();
                double weightLbs = Double.parseDouble(wLbs);
                j++;
                Cell c9 = s.getCell(j, i);
                String wKgs = c9.getContents();
                double weightKgs = Double.parseDouble(wKgs);
                j++;
                Cell c10 = s.getCell(j, i);
                String street = c10.getContents();
                j++;
                Cell c11 = s.getCell(j, i);
                String apt = c11.getContents();
                int aptNo = Integer.parseInt(apt);
                j++;
                Cell c12 = s.getCell(j, i);
                String city = c12.getContents();
                j++;
                Cell c13 = s.getCell(j, i);
                String zip = c13.getContents();
                int zipCode = Integer.parseInt(zip);

                Patient pa = new Patient(fname, lname, ageMo, ageYrs);
                pa.setPatientId(patientId);
                VitalSigns vs = new VitalSigns();
                Encounter en = new Encounter();
                vs.setRespiratoryRate(respRate);
                vs.setHeartRate(heartRate);
                vs.setBp(bp);
                vs.setWeightLb(weightLbs);
                vs.setWeightKg(weightKgs);

                en.setVital(vs);
                pa.getEncounterList().add(en);
                House house = new House();
                house.setStreet(street);
                house.setApt(aptNo);
                house.setCity(city);
                house.setZipCode(zipCode);
                house.setP(pa);
                entries.getPatientList().add(pa);
                entries.getPersonList().add(pa);
                Community com = new Community();
                com.getHouseList().add(house);
                patientId++;

            }

            do {
                System.out.println("1. Input the patient data.");
                System.out.println("2. Display data of all Patients");
                System.out.println("3. Display all Person Data");
                System.out.println("4. Display all data of particular patient");
                System.out.println("5. Check if vital sign value is normal.");
                System.out.println("6. Display count of people with abnormal Blood Pressure");
                System.out.println("Enter your choice :");
                choice = sc.nextInt();
                int ageMo = 0;
                int ageYrs = 0;
                String vitalSign = "";
                int val = 0;
                Patient p;
                char newP;

                switch (choice) {
                    case 1:

                        sc.nextLine();
                        String firstName = readString("Enter your first name: ");

                        String lastName = readString("Enter your last name: ");

                        System.out.println("Age less than 1 year? (Y/N)");
                        String ch = sc.nextLine();
                        if (ch.equals("Y") || ch.equals("y")) {
                            ageMo = readNumber("Enter the age in months: ", 1, 11);
                        } else {
                            ageYrs = readNumber("Enter the age in years: ", 1, 100);
                        }

                        int rRate = readNumber("Enter your Respiratory Rate: ", 0, Integer.MAX_VALUE);

                        int hRate = readNumber("Enter your Heart Rate: ", 0, Integer.MAX_VALUE);

                        int bp = readNumber("Enter your Blood Pressure: ", 0, Integer.MAX_VALUE);

                        double weightinLbs = readDecimal("Enter your Weight in lb: ", 0.0, Double.MAX_VALUE);

                        double weightInKgs = weightinLbs * 0.4536;

                        System.out.println("Address:");
                        System.out.println("Enter Street: ");
                        String street = sc.nextLine();
                        
                        int apt = readNumber("Enter Apt No: ", 1, Integer.MAX_VALUE);

                        String city = readString("Enter City: ");

                        int zipCode = readNumber("Enter ZipCode: ", 1, Integer.MAX_VALUE);

                        p = new Patient(firstName, lastName, ageMo, ageYrs);
                        p.setPatientId(patientId);
                        VitalSigns vital = new VitalSigns();
                        Encounter encounter = new Encounter();
                        vital.setRespiratoryRate(rRate);
                        vital.setHeartRate(hRate);
                        vital.setBp(bp);
                        vital.setWeightLb(weightinLbs);
                        vital.setWeightKg(weightInKgs);
                        encounter.setVital(vital);
                        p.getEncounterList().add(encounter);
                        House house = new House();
                        house.setStreet(street);
                        house.setApt(apt);
                        house.setCity(city);
                        house.setZipCode(zipCode);
                        house.setP(p);
                        entries.getPatientList().add(p);
                        entries.getPersonList().add(p);
                        Community com = new Community();
                        com.getHouseList().add(house);
                        patientId++;
                        break;
                    case 2:
                        entries.displayPatientList();
                        break;
                    case 3:
                        entries.displayPersonList();
                        break;
                    case 4:
                        System.out.println("Enter the patient Id you want details about: ");
                        int pID = sc.nextInt();
                        entries.displaySpecifiedPatient(pID);
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.println("Enter the vital sign you want to check: ");
                        vitalSign = sc.nextLine();
                        if ((vitalSign.equalsIgnoreCase("Respiratory Rate")) || (vitalSign.equalsIgnoreCase("Heart Rate"))
                                || (vitalSign.equalsIgnoreCase("Blood Pressure")) || (vitalSign.equalsIgnoreCase("Weight"))) {
                            System.out.println("Age less than 1 year? (Y/N)");
                            String ch1 = sc.nextLine();
                            if (ch1.equals("Y") || ch1.equals("y")) {
                                System.out.println("Enter the age in months: ");
                                ageMo = sc.nextInt();
                            } else {
                                System.out.println("Enter the age in years: ");
                                ageYrs = sc.nextInt();
                            }
                            System.out.println("Enter rate: ");
                            val = sc.nextInt();
                            System.out.println("Is vital sign normal :"
                                    + entries.isThisVitalSignNormal(vitalSign, ageMo, ageYrs, val));
                        } else {
                            System.out.println("Parameter not found");
                        }
                        break;
                    case 6:
                        Community comn = new Community();
                        comn.whichCommunity();
                        City ct = new City();
                        ct.setComA(comn.getCommuA());
                        ct.setComB(comn.getCommuB());
                        System.out.println("Community A");
                        ct.ComAbnormal(ct.getComA());
                        System.out.println("---------------------------------------------------");
                        System.out.println("Community B");
                        ct.ComAbnormal(ct.getComB());
                        break;
                    default:
                        System.out.println("Enter valid number");
                        break;
                }

                System.out.print("Do you wish to continue (Y/N): ");
                con = sc.next().charAt(0);

            } while ((con == 'y') || (con == 'Y'));

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

}
