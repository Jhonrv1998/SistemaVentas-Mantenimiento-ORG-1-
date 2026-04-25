package service;

public class DescuentoSinDescuento implements IdescuentoStrategy{
    
    @Override
    public double aplicar (double monto){
        return monto;
    }
}

