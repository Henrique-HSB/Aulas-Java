package exercicio2;

public class MediaDoAluno {
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;

    public MediaDoAluno(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = (nota1 + nota2 + nota3)/3;
    }

    public String resultado() {
        if (this.media >= 7) {
            return "Aprovado";
        } else if (this.media < 7 && this.media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "MediaDoAluno{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                '}' + resultado();
    }
}
