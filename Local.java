
/**
 * Write a description of class Local here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Local
{
    protected String nombre;
    protected String direccion;
    protected String platoNombre;
    protected int platoPrecio;
    protected int cantidadPlatosDisponibles;
    public Local(String nombre,String direccion)
    {
        this.nombre=nombre;
        this.direccion=direccion;
    }
       public void venderPlato()
    {
        cantidadPlatosDisponibles--;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getPlato()
    {
        return platoNombre;
    }
    public int cantidadPlatosDisponibles()
    {
        return cantidadPlatosDisponibles;
    }
    public void setPlatoNombre(String nombre)
    {
        platoNombre = nombre;
    }
    public void setPlatoPrecio(int precio)
    {
        platoPrecio = precio;
    }
    public String getPlatoNombre()
    {
        return platoNombre;
    }
    public int getPlatoPrecio()
    {
        return platoPrecio;
    }
    public void informacion()
    {
        System.out.println("El nombre del local es :"+getNombre());
        System.out.println("####################");
    }
}