package boletin15;
/**
 *
 * @author Damian
 */
public class ProbasEscritas {
    private float nota1ProbaEscrita;
    private float nota2ProbaEscrita;
    private float porcentaxePE;

    public ProbasEscritas() {
    }

    public ProbasEscritas(float nota1ProbaEscrita, float nota2ProbaEscrita, float porcentaxePE) {
        this.nota1ProbaEscrita = nota1ProbaEscrita;
        this.nota2ProbaEscrita = nota2ProbaEscrita;
        this.porcentaxePE = porcentaxePE;
    }

    public void setNota1ProbaEscrita(float nota1ProbaEscrita) {
        this.nota1ProbaEscrita = nota1ProbaEscrita;
    }

    public void setNota2ProbaEscrita(float nota2ProbaEscrita) {
        this.nota2ProbaEscrita = nota2ProbaEscrita;
    }

    public float getNota1ProbaEscrita() {
        return nota1ProbaEscrita;
    }

    public float getNota2ProbaEscrita() {
        return nota2ProbaEscrita;
    }

    public float getPorcentaxePE() {
        return porcentaxePE;
    }

    public void setPorcentaxePE(float porcentaxePE) {
        this.porcentaxePE = porcentaxePE;
    }
    
    public float calcularMediaProbasEscritas(){
        float mediaProbasEscritas = (nota1ProbaEscrita + nota2ProbaEscrita)/2;
        return mediaProbasEscritas;
    }

    public float calcularPorcentaxe(){
                 porcentaxePE = (float) (((nota1ProbaEscrita + nota2ProbaEscrita)/2)*(0.4));
//                System.out.println(porcentaxePE);
                 return porcentaxePE;
    }

}
