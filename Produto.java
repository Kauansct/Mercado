public class Produto{
    private String nome;
    private double preco;
    private Data validade;
    
    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getValidade(){
        return validade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setValidade(Data validade){
        this.validade = validade;
    }
    
    public String toString(){
        return "Produto: "+nome+"   preço: "+preco+"   Validade: "+validade;
    }
    
    public boolean verificaProdutoVencido(Data dataAtual){
        if (validade.getAno() > dataAtual.getAno()){
            return false;    
        }
        else if(validade.getMes() > dataAtual.getMes()){
            return false;            
        }
        else if (validade.getDia() >= dataAtual.getDia()){
            return false;    
        }
        else{
            return true;
        }
    }
}