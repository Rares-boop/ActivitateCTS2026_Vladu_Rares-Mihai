package cts.vladu.raresmihai.g1098.facade.clase;

public class Salon {
    private boolean[] listaPaturi = new boolean[4];

    public Salon() {
        this.listaPaturi[0] = true;
        this.listaPaturi[2] = true;
    }

    public int getPatLiber(){
        for(int i=0;i<listaPaturi.length;i++){
            if(listaPaturi[i]){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.listaPaturi[i] = false;
    }
}
