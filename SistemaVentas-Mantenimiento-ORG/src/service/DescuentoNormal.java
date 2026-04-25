package service;

public class DescuentoNormal  implements IdescuentoStrategy{
    
    @Override
    public double aplicar (double monto){
        return monto * 0.05;
    }
}
