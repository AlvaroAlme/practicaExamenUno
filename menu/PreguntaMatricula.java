package menu;

public class PreguntaMatricula extends PreguntaTexto {

    private String respuesta;
    
    public PreguntaMatricula(String textoPregunta){
        super(textoPregunta);
    }

    @Override
    protected boolean esRespuestaValida(){
        return respuesta.matches("^[0-9]{4}[A-Z]{3}$");
    }
}
