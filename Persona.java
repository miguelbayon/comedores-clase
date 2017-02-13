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

    public Persona(String nombre, boolean esHombre, int peso, int estatura, int edad)
    {
        this.nombre = nombre;
        this.esHombre = esHombre;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;  
        caloriasIngeridas = 0;
        comidaMasCaloricaTomada = null;
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
        return comidaMasCaloricaTomada.getNombre();
    }


}








