package cts.vladu.raresmihai.g1098.facade.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if(this.medic.areTrimitere(pacient)){
            int patLiber = this.salon.getPatLiber();

            if(patLiber > -1){
                System.out.println("Pacient internat ");
                this.salon.ocupaPat(patLiber);
            }
            else{
                System.out.println("Salonul este ocupat Vei fi internat in alt spital ");
            }
        }
        else{
            System.out.println("Ai nevoie de trimitere de la alt medic pentru internare ");
        }
    }
}
