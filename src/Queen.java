import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Queen extends JFrame {

	private JButton[][] cboard = new JButton[8][8];
	private JButton reset = new JButton(" RESET ");

	private int counter;

	public Queen() {
		setTitle("Farhad's Eight Queens");
		this.setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel chessBoard = new JPanel(new GridLayout(8, 8));
		this.add(chessBoard, BorderLayout.CENTER);
		this.add(reset, BorderLayout.SOUTH);
		counter = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				cboard[i][j] = new JButton("");
				chessBoard.add(cboard[i][j]);
				cboard[i][j].setMnemonic(0);
				if (((i + j) % 2) == 0) {
					cboard[i][j].setBackground(Color.black);

				} else {
					cboard[i][j].setBackground(Color.white);

				}
			}
		}

		mylisner();
	}

	public boolean downLeftToUpRight(int row, int colmun) {

		if ((row + colmun) < 8) {
			for (int i = row + colmun, j = 0; j <= (row + colmun); i--, j++) {
				if (cboard[i][j].getMnemonic() == 1) {
					return false;
				}
			}
		} else {
			for (int i = 7, j = (row + colmun) - 7; j < 8; i--, j++) {
				if (cboard[i][j].getMnemonic() == 1) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean LeftToright(int row) {

		for (int i = row, j = 0; j < 8; j++) {
			if (cboard[i][j].getMnemonic() == 1) {
				return false;
			}
		}
		return true;
	}

	public void mylisner() {
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.reset();
			}
		});

		cboard[0][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 0);
			}
		});

		cboard[1][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 0);
			}
		});
		cboard[2][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 0);
			}
		});
		cboard[3][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 0);
			}
		});
		cboard[4][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 0);
			}
		});
		cboard[5][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 0);
			}
		});
		cboard[6][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 0);
			}
		});
		cboard[7][0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 0);
			}
		});
		cboard[0][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 1);
			}
		});
		cboard[1][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 1);
			}
		});
		cboard[2][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 1);
			}
		});
		cboard[3][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 1);
			}
		});
		cboard[4][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 1);
			}
		});
		cboard[5][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 1);
			}
		});
		cboard[6][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 1);
			}
		});
		cboard[7][1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 1);
			}
		});
		cboard[0][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 2);
			}
		});
		cboard[1][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 2);
			}
		});
		cboard[2][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 2);
			}
		});
		cboard[3][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 2);
			}
		});
		cboard[4][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 2);
			}
		});
		cboard[5][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 2);
			}
		});
		cboard[6][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 2);
			}
		});
		cboard[7][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 2);
			}
		});
		cboard[0][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 3);
			}
		});
		cboard[1][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 3);
			}
		});
		cboard[2][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 3);
			}
		});
		cboard[3][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 3);
			}
		});
		cboard[4][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 3);
			}
		});
		cboard[5][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 3);
			}
		});
		cboard[6][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 3);
			}
		});
		cboard[7][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 3);
			}
		});
		cboard[0][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 4);
			}
		});
		cboard[1][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 4);
			}
		});
		cboard[2][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 4);
			}
		});
		cboard[3][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 4);
			}
		});
		cboard[4][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 4);
			}
		});
		cboard[5][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 4);
			}
		});
		cboard[6][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 4);
			}
		});
		cboard[7][4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 4);
			}
		});
		cboard[0][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 5);
			}
		});
		cboard[1][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 5);
			}
		});
		cboard[2][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 5);
			}
		});
		cboard[3][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 5);
			}
		});
		cboard[4][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 5);
			}
		});
		cboard[5][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 5);
			}
		});
		cboard[6][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 5);
			}
		});
		cboard[7][5].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 5);
			}
		});
		cboard[0][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 6);
			}
		});
		cboard[1][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 6);
			}
		});
		cboard[2][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 6);
			}
		});
		cboard[3][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 6);
			}
		});
		cboard[4][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 6);
			}
		});
		cboard[5][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 6);
			}
		});
		cboard[6][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 6);
			}
		});
		cboard[7][6].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 6);
			}
		});
		cboard[0][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(0, 7);
			}
		});
		cboard[1][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(1, 7);
			}
		});
		cboard[2][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(2, 7);
			}
		});
		cboard[3][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(3, 7);
			}
		});
		cboard[4][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(4, 7);
			}
		});
		cboard[5][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(5, 7);
			}
		});
		cboard[6][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(6, 7);
			}
		});
		cboard[7][7].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Queen.this.set(7, 7);
			}
		});
	}

	public void reset() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				counter = 0;
				cboard[i][j].setMnemonic(0);
				cboard[i][j].setText(null);
			}
		}
	}

	public void set(int i, int j) {
		if (counter == 0) {
			cboard[i][j].setMnemonic(1);
			cboard[i][j].setText("Q");
			cboard[i][j].setForeground(Color.ORANGE);
			cboard[i][j].setFont(new Font("Times New Roman", Font.BOLD, 30));
			counter++;

		}

		else if ((counter < 8) && upLeftToDownRight(i, j)
				&& downLeftToUpRight(i, j) && upToDown(j) && LeftToright(i)) {
			cboard[i][j].setMnemonic(1);
			cboard[i][j].setText("Q");
			cboard[i][j].setForeground(Color.ORANGE);
			cboard[i][j].setFont(new Font("Times New Roman", Font.BOLD, 30));
			counter++;
		} else {

			JOptionPane.showMessageDialog(null, "          Wrong Move");
		}
		if (counter == 8) {
			JOptionPane.showMessageDialog(null, "           Well Done");
		}
	}

	public boolean upLeftToDownRight(int row, int colmun) {

		if ((row - colmun) <= 0) {
			for (int i = 0, j = colmun - row; j < 8; i++, j++) {
				if (cboard[i][j].getMnemonic() == 1) {
					return false;
				}
			}
		} else {

			for (int i = row - colmun, j = 0; i < 8; i++, j++) {
				if (cboard[i][j].getMnemonic() == 1) {
					return false;
				}
			}

		}
		return true;
	}

	public boolean upToDown(int colmun) {

		for (int i = 0, j = colmun; i < 8; i++) {
			if (cboard[i][j].getMnemonic() == 1) {
				return false;
			}
		}
		return true;
	}
}
