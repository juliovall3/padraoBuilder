
public class CelularBuilder {

    private Celular celular;

    public CelularBuilder(){
       celular = new Celular();
    }

    public Celular build() {
        if (celular.getModelo().equals ("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }

        if (celular.getPreco() == 0){
            throw new IllegalArgumentException("Sem preço");
        }
        return celular;
    }

    public CelularBuilder setMarca(String marca){
        celular.setMarca(marca);
        return this;
    }

    public CelularBuilder setModelo(String modelo){
        celular.setModelo(modelo);
        return this;
    }

    public CelularBuilder setCor(String cor){
        celular.setCor(cor);
        return this;
    }

    public CelularBuilder setFabricacao(int fabricacao){
        celular.setFabricacao(fabricacao);
        return this;
    }

    public CelularBuilder setMemoria(String memoria){
        celular.setMemoria(memoria);
        return this;
    }

    public CelularBuilder setProcessador(String processador){
        celular.setProcessador(processador);
        return this;
    }

    public CelularBuilder setPreco(int preco){
        celular.setPreco(preco);
        return this;
    }

}
