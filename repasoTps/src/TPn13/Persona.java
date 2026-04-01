package TPn13;

import org.json.JSONObject;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, int dni, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    public Persona (JSONObject jsonObject){
        nombre = jsonObject.getString("nombre");
        edad = jsonObject.getInt("edad");
        dni = jsonObject.getInt("dni");
        sexo = jsonObject.getString("sexo");
    }

    public JSONObject toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre",nombre);
        jsonObject.put("edad",edad);
        jsonObject.put("dni",dni);
        jsonObject.put("sexo",sexo);

        return jsonObject;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
