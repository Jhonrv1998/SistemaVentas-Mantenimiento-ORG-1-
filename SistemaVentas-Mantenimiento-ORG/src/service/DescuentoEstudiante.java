package service;

public class DescuentoEstudiante  implements IdescuentoStrategy{
    
    @Override
    public double aplicar (double monto){
        return monto * 0.10;
    }
}
