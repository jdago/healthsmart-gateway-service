package com.example.gatewayservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback/find-all-medications-for-patient")
    public String findAllMedicationsForPatientFallback() {
        return "The medications for the requested patient could not be retrieved. Please try again later.";
    }

    @GetMapping("/fallback/find-medication-by-medication-name")
    public String findMedicationByMedicationNameFallback(@RequestParam String medicationName){
        return "The requested medication with name: " + medicationName + " could not be found. Please try again later.";
    }

    @GetMapping("/fallback/find-medication-by-medication-ndc-name")
    public String findMedicationByMedicationNDCFallback(@RequestParam String medicationNDC){
        return "The requested medication with NDC: " + medicationNDC + " could not be found. Please try again later";
    }

    @GetMapping("/fallback/find-medication-history")
    public String findMedicationHistoryFallback() {
        return "The medication history could not be retrieved. Please try again later.";
    }

    @GetMapping("/fallback/find-label-by-medication-name-and-dosage")
    public String findLabelByMedicationNameAndDosageFallback(@RequestParam String medicationName, int dosageInMilligrams){
        return "Label was not found for medication: " + medicationName + " with dosage: " + dosageInMilligrams;
    }
}
