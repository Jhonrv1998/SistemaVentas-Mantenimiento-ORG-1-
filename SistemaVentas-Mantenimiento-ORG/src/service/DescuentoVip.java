package service;

public class DescuentoVip implements IdescuentoStrategy{
    
    @Override
    public double aplicar (double monto){
        return monto * 0.20;
    }
}
