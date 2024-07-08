public class Mercado{
    private Prateleira prat1,prat2;
    
    public Mercado(Prateleira prat1, Prateleira prat2){
        this.prat1 = prat1;
        this.prat2 = prat2;
    }
    
    public Prateleira getPrat1(){
        return prat1;
    }
    
    public Prateleira getPrat2(){
        return prat1;
    }
    
    public double mediaValorProdutos(){
        int nProdutos = 0;
        double somaPreco = 0;
        
        if (prat1.getProd1() != null){
            nProdutos += 1;
            somaPreco += prat1.getProd1().getPreco();
        }
        
        else if (prat1.getProd2() != null){
            nProdutos += 1;
            somaPreco += prat1.getProd2().getPreco();
        }
        
        else if (prat1.getProd3() != null){
            nProdutos += 1;
            somaPreco += prat1.getProd3().getPreco();
        }
        
        else if (prat2.getProd1() != null){
            nProdutos += 1;
            somaPreco += prat2.getProd1().getPreco();
        }
        
        else if (prat2.getProd2() != null){
            nProdutos += 1;
            somaPreco += prat2.getProd2().getPreco();
        }
        
        else if (prat2.getProd3() != null){
            nProdutos += 1;
            somaPreco += prat2.getProd3().getPreco();
        }
        
        if (nProdutos != 0){
            return (somaPreco / nProdutos);
        }
        else{
            return 0;
        }
    }
}
