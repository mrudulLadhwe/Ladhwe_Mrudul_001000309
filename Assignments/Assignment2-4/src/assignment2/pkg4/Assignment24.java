/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mrudu
 */
public class Assignment24 {

    /**
     * @param args the command line arguments
     */
    public static int readNumber(String message, int min, int max) {
        String pattern = "^\\d+$";
        Pattern r = Pattern.compile(pattern);
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
        Pattern r = Pattern.compile(pattern);
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
        Pattern r = Pattern.compile(pattern);
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

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Scanner sc = new Scanner(System.in);
            char con;
            int choice;
            int patientId = 1;

            do {
                System.out.println("1. Input the patient data.");
                System.out.println("2. Display data of all Patients");
                System.out.println("3. Display all Person Data");
                System.out.println("4. Display all data of particular patient");
                System.out.println("5. Display current data of particular patient");
                System.out.println("6. Check if vital sign value is normal.");
                System.out.println("Enter your choice :");
                choice = sc.nextInt();
                String firstName;
                String lastName;
                int ageMo = 0;
                int ageYrs = 0;
                int rRate;
                int hRate;
                int bp;
                double weightinLbs;
                double weightInKgs;
                String vitalSign = "";
                int val = 0;
                Patient p;
                char newP;
                SystemEntries entries = new SystemEntries();

                switch (choice) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Is patient new? (Y/N)");
                        newP = sc.next().charAt(0);
                        if (newP == 'y' || newP == 'Y') {

                            sc.nextLine();
                            firstName = readString("Enter your first name: ");

                            lastName = readString("Enter your last name: ");

                            System.out.println("Age less than 1 year? (Y/N)");
                            String ch = sc.nextLine();
                            if (ch.equals("Y") || ch.equals("y")) {
                                ageMo = readNumber("Enter the age in months: ", 1, 11);
                            } else {
                                ageYrs = readNumber("Enter the age in years: ", 1, 100);
                            }

                            rRate = readNumber("Enter your Respiratory Rate: ", 0, Integer.MAX_VALUE);

                            hRate = readNumber("Enter your Heart Rate: ", 0, Integer.MAX_VALUE);

                            bp = readNumber("Enter your Blood Pressure: ", 0, Integer.MAX_VALUE);

                            weightinLbs = readDecimal("Enter your Weight in lb: ", 0.0, Double.MAX_VALUE);

                            weightInKgs = weightinLbs * 0.4536;

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
                            entries.getPatientList().add(p);
                            entries.getPersonList().add(p);
                            patientId++;
                        } else {
                            System.out.println("Enter Patient ID");
                            int pId = sc.nextInt();
                            for (int i = 0; i < entries.getPatientList().size();) {
                                if (entries.getPatientList().get(i).getPatientId() == pId) {
                                    rRate = readNumber("Enter your Respiratory Rate: ", 0, Integer.MAX_VALUE);

                                    hRate = readNumber("Enter your Heart Rate: ", 0, Integer.MAX_VALUE);

                                    bp = readNumber("Enter your Blood Pressure: ", 0, Integer.MAX_VALUE);

                                    weightinLbs = readDecimal("Enter your Weight in lb: ", 0.0, Double.MAX_VALUE);

                                    weightInKgs = weightinLbs * 0.4536;
                                    p = entries.getPatientList().get(i);
                                    VitalSigns vital = new VitalSigns();
                                    Encounter encounter = new Encounter();
                                    vital.setRespiratoryRate(rRate);
                                    vital.setHeartRate(hRate);
                                    vital.setBp(bp);
                                    vital.setWeightLb(weightinLbs);
                                    vital.setWeightKg(weightInKgs);
                                    encounter.setVital(vital);
                                    p.getEncounterList().add(encounter);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        break;

                    case 2:
                        if (entries.getPatientList().size() == 0) {
                            System.out.println("No record found. Please enter data First");
                        } else {
                            entries.displayPatientList();
                        }
                        break;
                    case 3:
                        if (entries.getPersonList().size() == 0) {
                            System.out.println("No record found. Please enter data First");
                        } else {
                            entries.displayPersonList();
                        }
                        break;
                    case 4:
                        if (entries.getPatientList().size() == 0) {
                            System.out.println("No record found. Please enter data First");
                        } else {
                            System.out.println("Enter the patient Id you want details about: ");
                            int pID = sc.nextInt();
                            entries.displaySpecifiedPatient(pID);
                        }
                        break;
                    case 5:
                        if (entries.getPatientList().size() == 0) {
                            System.out.println("No record found. Please enter data First");
                        } else {
                            System.out.println("Enter the patient Id you want current details about: ");
                            int ptId = sc.nextInt();
                            entries.displayPatientCurrRecord(ptId);
                        }
                        break;
                    case 6:
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
