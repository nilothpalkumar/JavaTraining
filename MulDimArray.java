import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class MulDimArray {

    public static void main(String[] args) {


        char[][] a = new char[3][3];
        //System.out.print(a.length);
        a[0][0] = 'X';
        a[0][1] = 'O';
        a[0][2] = 'O';
        a[1][0] = '0';
        a[1][1] = 'X';
        a[1][2] = '0';
        a[2][0] = '0';
        a[2][1] = '0';
        a[2][2] = 'X';

        for (int i=0; i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
