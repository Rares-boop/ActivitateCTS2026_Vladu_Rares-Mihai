package cts.vladu.raresmihai.g1098.singleton.model;

public class PatientNotificationService implements IHospitalService{
    private int serviceId;
    private String description;
    private static PatientNotificationService patientNotificationService = null;

    private PatientNotificationService() {
    }

    private PatientNotificationService(int serviceId, String description) {
        this.serviceId = serviceId;
        this.description = description;
    }

    public static PatientNotificationService getInstance(int id, String description){
        if(patientNotificationService == null){
            patientNotificationService = new PatientNotificationService(id, description);
        }
        return patientNotificationService;
    }

    @Override
    public int getServiceId() {
        return patientNotificationService.serviceId;
    }

    @Override
    public String getServiceDescription() {
        return patientNotificationService.description;
    }

    @Override
    public void startService() {
        StringBuilder sb = new StringBuilder("START ");
        sb.append(patientNotificationService.serviceId);
        sb.append(patientNotificationService.description);
        System.out.println(sb.toString());
    }
}
