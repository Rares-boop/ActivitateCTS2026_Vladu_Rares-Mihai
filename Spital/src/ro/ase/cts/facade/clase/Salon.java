package ro.ase.cts.facade.clase;

public class Salon {
    private boolean[] paturiSalon = new boolean[4];

    public Salon(boolean[] paturiSalon) {
        this.paturiSalon = paturiSalon;
    }

    public Salon() {
        this.paturiSalon[0] = true;
        this.paturiSalon[2] = true;
    }

    public int getPatLiber(){
        for(int i=0;i<this.paturiSalon.length;i++){
            if(this.paturiSalon[i]){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiSalon[i] = false;
    }
}
