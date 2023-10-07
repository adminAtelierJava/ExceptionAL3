/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class AddTable {
    public static void main(String[] args) {

		int[] array = new int[3];
		for(int i=0;i<4;++i){
			try {
				array[i] = i;
				System.out.println(array[i]);
			}
			catch (ArrayIndexOutOfBoundsException ex)
			{
				System.out.println(ex);
			}

		}

		System.out.println(array);
	}
}


