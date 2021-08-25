public class Montadora {
    private Montadora(){};
    private static Montadora instance = new Montadora();
    public static Montadora getInstance(){
        return instance;
    }


    private String nomeMontadora;
    private String nomeFranquia;
    private String endereco;

    public String getNomeMontadora() {
        return nomeMontadora;
    }

    public void setNomeMontadora(String nomeMontadora) {
        this.nomeMontadora = nomeMontadora;
    }

    public String getNomeFranquia() {
        return nomeFranquia;
    }

    public void setNomeFranquia(String nomeFranquia) {
        this.nomeFranquia = nomeFranquia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
