package boletin15;

/**
 *
 * @author Damian
 */
public class ProbaPractica {

    private float nota1ProbaPractica;
    private float porcentaxePP;

    public ProbaPractica() {
    }

    public ProbaPractica(float nota1ProbaPractica, float porcentaxePP) {
        this.nota1ProbaPractica = nota1ProbaPractica;
        this.porcentaxePP = porcentaxePP;

    }

    public void setNota1ProbaPractica(float nota1ProbaPractica) {
        this.nota1ProbaPractica = nota1ProbaPractica;
    }

    public float getNota1ProbaPractica() {
        return nota1ProbaPractica;
    }

    public void setPorcentaxePP(float porcentaxePP) {
        this.porcentaxePP = porcentaxePP;
    }

    public float getPorcentaxePP() {
        return porcentaxePP;
    }
    
    public float calcularPorcentaxe(){
        porcentaxePP = (float) ((nota1ProbaPractica)*0.4);
//        System.out.println(porcentaxePP);
        return porcentaxePP;
    }
}
