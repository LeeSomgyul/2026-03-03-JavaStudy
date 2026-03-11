import java.awt.*;

import javax.swing.*;

public class GameView extends JPanel {
	
	Image back, horse;
	
	public GameView() {
		back = Toolkit.getDefaultToolkit().getImage("");
	}

	public void paint(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}

}
