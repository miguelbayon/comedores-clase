import java.util.ArrayList;

public class Persona
{
    private String nombre;
    private boolean esHombre;
    private int peso;
    private int estatura;
    private int edad;
    private int caloriasIngeridas;
    private int metabasal;
    private Comida comidaMasCaloricaTomada;		
    private ArrayList<Comida> comidasIngeridas;

    

    public Persona(String nombre, boolean esHombre, int peso, int estatura, int edad)
    {
        this.nombre = nombre;
        this.esHombre = esHombre;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;  
        caloriasIngeridas = 0;
        comidaMasCaloricaTomada = null;
        comidasIngeridas = new ArrayList<Comida>();
        if(esHombre){
            metabasal= (10*peso)+(6*estatura)+(5*edad)+5;}
        else{
            metabasal= (10*peso)+(6*estatura)+(5*edad)-161;
        }
    }
    

    public int comer(Comida comida){
        int calorias = -1;

        if(caloriasIngeridas <= metabasal){
            calorias = comida.getCalorias();
            caloriasIngeridas += calorias;
            comidasIngeridas.add(comida);

            if(comidaMasCaloricaTomada != null)
            {
                if (comidaMasCaloricaTomada.getCalorias() <= comida.getCalorias())
                {
                    comidaMasCaloricaTomada = comida;  
                }   
            }
            else {
                comidaMasCaloricaTomada = comida;
            }      

        }    

        return calorias;
    }
    

    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    

    public String contestar(String pregunta){
        String respuesta = pregunta;

        if (pregunta.contains(this.nombre) || ( getCaloriasIngeridas() > metabasal)){
            respuesta = respuesta.toUpperCase();
        }
        else {

            if(pregunta.length() % 3 == 0){
                respuesta = "SI";
            }
            else{
                respuesta = "NO";
            }

        }
        System.out.println(respuesta);    
        return respuesta;
    }  
    
    public String getAlimentoMasCaloricoConsumido()
    {
        String nombreComidaADevolver = null;
        
        if (comidaMasCaloricaTomada != null) {
            nombreComidaADevolver = comidaMasCaloricaTomada.getNombre();
            System.out.println(nombreComidaADevolver);
        }
        else {
            System.out.println("Aun no he comido nada");
        }
        
        return nombreComidaADevolver;
    }

    
    public void verListadoComidasIngeridas() 
    {
        
        
    }

}















