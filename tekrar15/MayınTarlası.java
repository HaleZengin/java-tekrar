package tekrar15;

import java.util.Random;
import java.util.Scanner;

public class MayýnTarlasý {

	int rowNumber, colNumber,size;
	int[][] map;   		//boþ harita
	int[][] board; 		//kullanýcýdanýn kullanacagý harita
	boolean game=true;
	
	Random rand = new Random();
	Scanner scan= new Scanner(System.in);
	
	 MayýnTarlasý(int rowNumber, int colNumber) {
		this.rowNumber=rowNumber;
		this.colNumber=colNumber;
		this.map = new int [rowNumber][colNumber];
		this.board = new int [rowNumber][colNumber];
		this.size = rowNumber*colNumber;
	}
	 
	 public void check(int r,int c) {  // burada sectigimiz karenin sagýna soluna altýna üstüne mayýn var mý diye bakar 
		
		 if (map[r][c]==0) {	
		
		 if ((c<colNumber-1) && (map[r][c+1]==-1)) {
			 board[r][c+1]++;	
		}
		 if ((r<rowNumber-1) && (map[r+1][c]==-1)) {
			 board[r+1][c]++;	
		}
		 if ((r>0) && (map[r-1][c]==-1)) {
			 board[r][c]++;	
		}
		 if ((c>0) && (map[r][c-1]==-1)) {
			 board[r][c]++;	
		}
		 if (board[r][c]==0) {
			board[r][c]=-2;
		}
		}
	 }
	 
	 public void run() {
		 int row,col,success=0;
		 oyunuHazýrlayan();
		 print(map);
		 System.out.println("Oyun baþladý...");
		 while (game) {
			print(board);
			System.out.println("Satýr giriniz:");
			row=scan.nextInt();
			System.out.println("Sütun giriniz:");
			col=scan.nextInt();
			if (row<=0 || row>=rowNumber-1) {
				System.out.println("Gecersiz koordinat");
				continue;
			}
			if (col<=0 || col>=colNumber-1) {
				System.out.println("Gecersiz koordinat");
				continue;
			}
			
			if (map[row][col]!=-1) {
				check(row,col);
				success++;
				if (success == (size-(size/4))) {
					System.out.println("Basardýnýz!!! Hiç bir mayýna basmadýnýz!");
					break;
				}
			} else {
				game=false;
				System.out.println("Game over!");
			}
		
		}
	 }
	
	 public void oyunuHazýrlayan() {  				//mayýnlarý rasgele koy
		 int randomRow,randomColumn,count=0;
		 
		 while (count!=(size/4)) {
			 randomRow=rand.nextInt(rowNumber);
			 randomColumn=rand.nextInt(colNumber);
			 
			 if (map[randomRow][randomColumn]!=-1) {
				map[randomRow][randomColumn]=-1; 	//mayýnlarýn oldugu yerlere-1 de
				count++;
			}
		}
		
	 }
	 
	 public void print(int [][] arr) {
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j]>=0) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}
