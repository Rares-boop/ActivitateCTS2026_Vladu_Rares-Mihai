package ro.ase.cts.facade.clase;

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
                this.salon.ocupaPat(patLiber);
                System.out.println("Pacient internat ");
            }
            else{
                System.out.println("Paturile sunt ocupate ");
            }
        }
        else{
            System.out.println("Este nevoie de trimitere de la medic ");
        }
    }
}
