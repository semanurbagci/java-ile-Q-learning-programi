package y2p3;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import y2p3.buton;

public class tahta {
	
	int matrisBoyutu=25;
	JFrame frame;
	buton[][] board = new buton[matrisBoyutu][matrisBoyutu];
	
	public void Islemler(int bi, int bj, int hi, int hj, int e) {
		frame = new JFrame("YAZLAB2 PROJE3");
		frame.setSize(1500,650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(matrisBoyutu,matrisBoyutu));
		
		for(int row=0; row<board.length; row++) {
			for(int col=0; col<board[0].length; col++) {
				buton b = new buton(row,col);
				frame.add(b);
				board[row][col]=b;
			}
		}
		
		engelBelirle(bi, bj, hi, hj, e);
		txtYazdir(bi, bj, hi, hj);
		
		frame.setVisible(true);
		
		//RMatrisiOlustur(matrisBoyutu, bi, bj, hi, hj);
	}
	
	public void engelBelirle(int bas_i, int bas_j, int hedef_i, int hedef_j, int engelSayisi) {
		int i=0;
		while(i<engelSayisi) {
			int randRow = (int) (Math.random()*board.length);
			int randCol = (int) (Math.random()*board[0].length);
			while(board[randRow][randCol].isStop()) {
				randRow = (int) (Math.random()*board.length);
				randCol = (int) (Math.random()*board[0].length);
			}
			while((randRow==bas_i && randCol==bas_j) || (randRow==hedef_i && randCol==hedef_j)) {
				randRow = (int) (Math.random()*board.length);
				randCol = (int) (Math.random()*board[0].length);
			}
			board[randRow][randCol].setStop(true);
			board[randRow][randCol].setIcon(new ImageIcon("red.jpg"));
			i++;
		}
		board[bas_i][bas_j].setIcon(new ImageIcon("blue.jpg"));
		board[hedef_i][hedef_j].setIcon(new ImageIcon("green.png"));
	}
	
	public void txtYazdir(int bas_i, int bas_j, int hedef_i, int hedef_j) {
		File file = new File("dosya.txt");
		try {
			if (!file.exists()) {
	            file.createNewFile();
	        } 
	        FileWriter fileWriter = new FileWriter(file, false);
	        BufferedWriter bWriter = new BufferedWriter(fileWriter);
	        
	        for(int i=0; i<matrisBoyutu; i++) {
	        	for(int j=0; j<matrisBoyutu; j++) {
	        		if(board[i][j].isStop()) {
	        			bWriter.write("("+i+","+j+",K)");
	        			bWriter.write("\n");
	        		}
	        		else if(i==bas_i && j==bas_j) {
	        			bWriter.write("("+i+","+j+",M)");
	        			bWriter.write("\n");
	        		}
	        		else if(i==hedef_i && j==hedef_j) {
	        			bWriter.write("("+i+","+j+",Y)");
	        			bWriter.write("\n");
	        		}
	        		else {
	        			bWriter.write("("+i+","+j+",B)");
	        			bWriter.write("\n");
	        		}
	        	}
	        }
	        bWriter.close();
		}catch (Exception e) {
			System.out.println("something went wrong");
		}
	}
	
	public void RMatrisiOlustur(int matrisBoyutu, int bas_i, int bas_j, int hedef_i, int hedef_j) {
		int [][] rMatrisi = new int[board.length*board.length][board.length*board.length]; ;
		for(int i=0; i<board.length*board.length; i++) {
			for(int j=0; j< board.length*board.length; j++) {
				
			}	
		}
		for(int a=0; a<board.length*board.length; a++) {
			for(int b=0; b<board.length*board.length; b++) {
				//System.out.print(rMatrisi[a][b]+"  ");
			}
			//System.out.println();
		}
		
	}
	
}
