public class Principal{
    public static void main(String [] args){
        double v1 = Teclado.leDouble("Digite o valor do preço para o 1º produto");
        while (v1 <= 0){
            System.out.println("ERRO...");
            v1 = Teclado.leDouble("Digite novamente o valor do preço para o 1º produto");
        }
        
        double v2 = Teclado.leDouble("Digite o valor do preço para o 2º produto");
        while (v2 <= 0){
            System.out.println("ERRO...");
            v2 = Teclado.leDouble("Digite navamente o valor do preço para o 2º produto");
        }
        
        double v3 = Teclado.leDouble("Digite o valor do preço para o 3º produto");
        while (v3 <= 0){
            System.out.println("ERRO...");
            v3 = Teclado.leDouble("Digite novamente o valor do preço para o 3º produto");
        }
        
        Prateleira p1 = new Prateleira(
        new Produto("Amaciante", v1, new Data(10,4,2024)),
        new Produto("Creme Dental", v2, new Data(5,5,2025)),
        new Produto("Leite Codensado", v3, new Data(4,12,2022)));
        
        Prateleira p2 = new Prateleira();
        Produto prod1 = new Produto("Cortina", 167.98, new Data(13,10,2035));
        p2.setProd1(prod1);
        
        Mercado m1 = new Mercado(p1, p2);
        
        System.out.println("Produtos vencidos:");
        if (p1.getProd1() != null && p1.getProd1().verificaProdutoVencido(new Data(10,10,2024)) == true){
            System.out.println(p1.getProd1());
        }
        
        if (p1.getProd2() != null && p1.getProd2().verificaProdutoVencido(new Data(10,10,2024)) == true){
            System.out.println(p1.getProd2());
        }
        
        if (p1.getProd3() != null && p1.getProd3().verificaProdutoVencido(new Data(10,10,2024)) == true){
            System.out.println(p1.getProd3());
        }
        
        if (p2.getProd1() != null && p1.getProd1().verificaProdutoVencido(new Data(10,10,2024)) == true){
            System.out.println(p2.getProd1());
        }
        
        if (p2.getProd2() != null && p1.getProd2().verificaProdutoVencido(new Data(10,10,2024)) == true){
            System.out.println(p2.getProd2());
        }
        
        if (p2.getProd3() != null && p1.getProd3().verificaProdutoVencido(new Data(10,10,2024)) == true){
            System.out.println(p2.getProd3());
        }
        
        System.out.println("Produtos mais caros das prateleiras:");
        System.out.println(p1.produtoMaisCaro());
        System.out.println(p2.produtoMaisCaro());
        
        System.out.println("Média do valor dos produtos do mercado: "+m1.mediaValorProdutos());
    }
}

