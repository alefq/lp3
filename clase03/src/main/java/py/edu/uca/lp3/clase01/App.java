package py.edu.uca.lp3.clase01;

import org.apache.commons.lang.math.NumberUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Es numero: " + NumberUtils.isNumber("1"));
        System.out.println("Es numero: " + NumberUtils.isNumber("algo"));

    }
}
