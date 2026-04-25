package service;

public class DescuentoEmpresa  implements IdescuentoStrategy{
    
    @Override
    public double aplicar (double monto){
        return monto * 0.15;
    }
}
