public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        System.out.println("Nova Data instanciada com sucesso!");
    }
    public String formatarData(){
        String dataFormatada = +getDia()+"/"+getMes()+"/"+getAno();;
        return dataFormatada;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


}