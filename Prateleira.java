public class Prateleira{
    private Produto prod1, prod2, prod3;
    
    public Prateleira(Produto prod1, Produto prod2, Produto prod3){
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.prod3 = prod3;
    }
    
    public Prateleira(){
        
    }
    
    public Produto getProd1(){
        return prod1;
    }
    
    public void setProd1(Produto prod1){
        this.prod1 = prod1;    
    }
    
    public Produto getProd2(){
        return prod2;
    }
    
    public void setProd2(Produto prod2){
        this.prod2 = prod2;    
    }
    
    public Produto getProd3(){
        return prod3;
    }
    
    public void setProd3(Produto prod3){
        this.prod3 = prod3;    
    }
    
    public Produto produtoMaisCaro(){
        Produto produtoCaro = prod1;
        if (prod2 != null && prod2.getPreco() > prod1.getPreco() && prod2.getPreco() > prod3.getPreco()){
            produtoCaro = prod2;
        }
        
        else if (prod3 != null && prod3.getPreco() > prod1.getPreco() && prod3.getPreco() > prod2.getPreco()){
            produtoCaro = prod3;
        }
        return produtoCaro;
    }
    
    public String toString(){
        String sep = "";
        sep += "Produto 1: "+prod1+"\n";
        sep += "Produto 2: "+prod2+"\n";
        sep += "Produto 3: "+prod3+"\n";
        sep += "Produto mais caro: "+produtoMaisCaro()+"\n";
        return sep;
    }
}