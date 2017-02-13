public class Comida
{
    private String nombreComida;
    private int cal;

    
    public Comida(String comida, int calorias)
    {
        nombreComida = comida;
        cal = calorias;
    }
    

    public int getCalorias() 
    {
        return cal;
    }
    
    
    public String getNombre()
    {
        return nombreComida;
    }

}