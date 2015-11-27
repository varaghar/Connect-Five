
import javax.websocket.Session;

public class Pair { 
  private final Session black; 
  private final Session white; 
  

public Pair(Session black, Session white) { 
    this.black = black; 
    this.white = white; 
  } 

public Session getBlack() {
	return black;
}

public Session getWhite() {
	return white;
}
  
} 