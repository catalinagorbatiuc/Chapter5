//aplicație care calculează produsul dintre numerele întregi impare de la 1 la 15.

public class ex12
{
    public static void main( String args[] )
    {
        int product = 1; // produsul tuturor numerelor impare

        // parcurge toate numerele impare de la 3 la 15
        for ( int x = 3; x <= 15; x += 2 )
            product *= x;

// arată rezultate
 System.out.printf( "Product is %d\n", product );
    } // end main
}