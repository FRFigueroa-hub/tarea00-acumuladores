package acumuladores;

public class Acumuladores {

	/**
	 * Dada una matriz de enteros y un número, verifica si existe alguna fila 
	 * donde todos sus elementos sean múltiplos del número recibido por 
	 * parámetro.
	 * 
	 * Si la matriz está vacía o si el número no es positivo, devuelve falso.
	 * 
	 * @param mat
	 * @param num
	 * @return
	 */
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) { 
		if (mat.length == 0 || num <= 0) return false;
		
		boolean existeFilaDeMultiplos = false;
		for (int i = 0; i < mat.length; i++) {
			boolean todosMultiplos = true;
			for (int j = 0; j < mat[0].length; j++) {
				todosMultiplos = todosMultiplos && mat[i][j]%num == 0;
			}
			existeFilaDeMultiplos = existeFilaDeMultiplos || todosMultiplos;
		}
		return existeFilaDeMultiplos;
	}
	
	/**
	 * Dado 2 matrices se verifica si hay intersección entre las filas de cada
	 * matriz, fila a fila.
	 * 
	 * Si las matrices tienen distinta cantidad de filas o si alguna matriz 
	 * está vacía, devuelve falso.
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) {
		if (mat1.length != mat2.length || mat1.length == 0 || mat2.length == 0) return false;
		
		boolean interseccionEnTodasLasFilas = true;
		for (int i = 0; i < mat1.length; i++) {
			boolean interseccionEnFila = false;
			int[] filaMat1 = mat1[i];
			int[] filaMat2 = mat2[i];
			
			for (int j = 0; j < filaMat1.length; j++) {
				
				for (int k = 0; k < filaMat2.length; k++) {
					interseccionEnFila = interseccionEnFila || filaMat1[j] == filaMat2[k];
				}
			}
			interseccionEnTodasLasFilas = interseccionEnTodasLasFilas && interseccionEnFila;
		}
		return interseccionEnTodasLasFilas;
	}
	
	/**
	 * Dada una matriz y el índice de una columna, se verifica si existe alguna
	 * fila cuya suma de todos sus elementos sea mayor estricto que la suma de
	 * todos los elementos de la columna indicada por parámetro.
	 * 
	 * Si el índice de la columna es inválido o la matriz está vacía, devuelve 
	 * falso.
	 * 
	 * @param mat
	 * @param nColum
	 * @return
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
		if (mat.length == 0 || nColum < 0 || nColum >= mat[0].length) return false;
		
		boolean filaSumaMasQueColumna = false;
		int sumaColumna = 0;
		
		for (int i = 0; i < mat.length; i++) {
			sumaColumna += mat[i][nColum];
		}
		
		int indice = 0;
		int[] sumasDeFilas = new int[mat.length];
		
		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j < mat[0].length; j++) {
				sum += mat[i][j];
			}
			sumasDeFilas[indice] = sum;
			indice++;
		}
		
		for (int f : sumasDeFilas) {
			filaSumaMasQueColumna = filaSumaMasQueColumna || f > sumaColumna;
		}
		return filaSumaMasQueColumna;
	}
	
	/**
	 * Dadas 2 matrices, se verifica si hay intersección entre las columnas de
	 * cada matriz, columna a columna.
	 * 
	 * Si las matrices tienen distinta cantidad de columnas o alguna matriz 
	 * está vacía, devuelve falso. 
	 * 
	 * @param mat1
	 * @param mat2
	 * @return
	 */
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) { 
		throw new RuntimeException("Metodo no implementado aun!!!");
	}
}
