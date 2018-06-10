package boletin15;
/**
 *
 * @author Damian
 */
public class Boletins {
    
    private int boletinsFeitos;
    private int boletinsAFacer;
    private float mediaBoletins;
    private float porcentaxeB;
    private int porcentaxe;

    public Boletins() {
    }

    public Boletins(int BoletinsFeitos, int BoletinsAFacer, float mediaBoletines, float porcentaxeB) {
        this.boletinsFeitos = boletinsFeitos;
        this.boletinsAFacer = boletinsAFacer;
        this.mediaBoletins = mediaBoletines;
        this.porcentaxeB = porcentaxeB;
    }

    public void setBoletinsFeitos(int boletinsFeitos) {
        this.boletinsFeitos = boletinsFeitos;
    }

    public void setBoletinsAFacer(int boletinsAFacer) {
        this.boletinsAFacer = boletinsAFacer;
    }

    public float getBoletinsFeitos() {
        return boletinsFeitos;
    }

    public float getBoletinsAFacer() {
        return boletinsAFacer;
    }

    public void setMediaBoletins(float mediaBoletins) {
        this.mediaBoletins = mediaBoletins;
    }

    public void setPorcentaxeB(float porcentaxeB) {
        this.porcentaxeB = porcentaxeB;
    }

    public float getMediaBoletins() {
        return mediaBoletins;
    }

    public float getPorcentaxeB() {
        return porcentaxeB;
    }
    
    public void setPorcentaxe(int porcentaxe){
        this.porcentaxe = porcentaxe;
    }
    
    public int getPorcentaxe(){
        return porcentaxe;
    }
    
    
    public float calcularMediaBoletins(){
        
        
        if(porcentaxe>90){
            mediaBoletins=2;
        }
        else if(porcentaxe>70 && porcentaxe<90){
            mediaBoletins=1;
    }
        else{
            mediaBoletins=0;
        }
        return mediaBoletins;
    }
    
    public float calcularPorcentaxe(){
        porcentaxeB = ((mediaBoletins)*(int)0.2);
//        System.out.println(porcentaxeB);
        return porcentaxeB;
    }
}
