package java0709;

public class ObjectArray2 {

	public static void main(String[] args) 
	{
		Game[] gm = new Game[7];
		
		gm[0] = new Game("리그오브레전드","MOBA","PC");
		gm[1] = new Game("서든어택","FPS","PC");
		gm[2] = new Game("메이플스토리","MMORPG","PC");
		gm[3] = new Game("젤다의 전설: 야생의 숨결","액션/어드벤처","Switch,WiiU");
		gm[4] = new Game("쿠키런","러닝 액션","Android/IOS");
		gm[5] = new Game("스타크래프트1","RTS","PC");
		gm[6] = new Game("디아블로4","액션 RPG","PC");
		
		for( int i=0; i< gm.length; i++ )
		{
			System.out.println(gm[i]);
		}

	}

}
// 7개의 게임정보를 가진
// 객체를 생성 하고 출력하세요
