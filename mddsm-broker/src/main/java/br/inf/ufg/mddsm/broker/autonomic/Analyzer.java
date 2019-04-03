package br.inf.ufg.mddsm.broker.autonomic;

import java.util.Collection;

import base.autonomic.ChangeRequest;

public class Analyzer {
    private Collection<ChangeRequest> requests;

    public Analyzer(Collection<ChangeRequest> requests) {
        this.requests = requests;
    }

    private Planner planner;
    public void setPlanner(Planner planner) {
        this.planner = planner;
    }

    public void symptomDetected(SymptomOccurrence symptom) {
        for (ChangeRequest request : requests) {
            if (request.getBasedOn().equals(symptom.getSymptom())) {
                requestChange(symptom, request);
            }
        }
    }

    private void requestChange(SymptomOccurrence symptom, ChangeRequest request) {
        planner.change(new ChangeRequestInstance(request, symptom));
    }

}
